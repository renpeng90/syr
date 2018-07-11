package common.util.reflect;

import com.google.common.collect.Sets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

/**
 * @author zhangyibo
 */
public class Obj2MapUtil {

    private static final Logger LOG = LoggerFactory.getLogger(Obj2MapUtil.class);


    public static <T> void copyMap2ObjExc(Map<String, Object> map, T t, String... exfields) {
        copyMap2Obj(map, t, false, exfields);
    }

    public static <T> void copyMap2ObjInc(Map<String, Object> map, T t, String... infields) {
        copyMap2Obj(map, t, true, infields);
    }

    public static <T> void copyObj2MapExc(T t, Map<String, Object> map, String... exfields) {
        copyObj2Map(t, map, false, exfields);
    }

    public static <T> void copyObj2MapInc(T t, Map<String, Object> map, String... infields) {
        copyObj2Map(t, map, true, infields);
    }

    /**
     * @throws Exception 转换失败时抛出异常
     */
    private static <T> void copyMap2Obj(Map<String, Object> map, T t, boolean flag, String... inOrExfields) {
        Class<?> clazz = t.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Set<String> mapKey = map.keySet();
        Set<String> includeFieldSet = Sets.newHashSetWithExpectedSize(inOrExfields.length);
        for (String includeFiledName : inOrExfields) {
            includeFieldSet.add(includeFiledName);
        }
        for (Field field : fields) {
            String filedName = field.getName();
            if (mapKey.contains(filedName) && !flag ^ includeFieldSet.contains(filedName)) {
                Object value = map.get(filedName);
                String setMethodName = getMethodName(filedName, "set");
                try {
                    Method setMethod = clazz.getDeclaredMethod(setMethodName, field.getType());
                    setMethod.invoke(t, value);
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    //直接转换成runtime抛出 抛出受检异常上层也无法处理
                    LOG.error("拷贝异常", e);
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /**
     * @throws Exception 转换失败时抛出异常
     */
    private static <T> void copyObj2Map(T t, Map<String, Object> map, boolean flag, String... inOrExfields) {
        Class<?> clazz = t.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Set<String> includeFieldSet = Sets.newHashSetWithExpectedSize(inOrExfields.length);
        for (String includeFiledName : inOrExfields) {
            includeFieldSet.add(includeFiledName);
        }
        for (Field field : fields) {
            if (!flag ^ includeFieldSet.contains(field.getName())) {
                String getMethodName = getMethodName(field.getName(), "get");
                Object value;
                try {
                    Method getMethod = clazz.getDeclaredMethod(getMethodName);
                    value = getMethod.invoke(t);
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    //直接转换成runtime抛出 抛出受检异常上层也无法处理
                    LOG.error("拷贝异常", e);
                    throw new RuntimeException(e);
                }
                map.put(field.getName(), value);
            }
        }
    }

    /**
     * @param fieldName 属性名
     * @return 对应的set/get方法名称
     */
    private static String getMethodName(String fieldName, String type) {
        return type + fieldName.substring(0, 1).toUpperCase()
                + fieldName.substring(1);
    }

}

