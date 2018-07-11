package common.util.validate;

import common.annotation.Check;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 校验工具类 提供传统及函数式两种方式校验
 * 例子参见
 * @See ValidateUtilTest
 * Created by zhangyibo on 2017/3/3.
 */
public class ValidateUtil {

    public static <T> boolean checkNull(T t){
        return t==null;
    }

    public static <T> void checkNullExp(T t){
        if(t==null)
            throw new IllegalArgumentException("参数不能为空！");
    }

    public static boolean checkEmpty(String str){
        return StringUtils.isEmpty(str);
    }

    public static void checkEmptyExp(String str){
        if(StringUtils.isEmpty(str))
            throw new IllegalArgumentException("参数不能为空!");
    }

    public static boolean checkRegex(String str,String regex){
        if(checkNull(str)) return false;
        return Pattern.compile(regex)
                .matcher(str).matches();
    }

    public static void checkRegexExp(String str,String regex){
        if(checkNull(str)||!Pattern.compile(regex)
                .matcher(str).matches())
            throw new IllegalArgumentException("参数不满足正则表达式要求!regex:"+regex);
    }

    public static <T> void checkPropsNullExp(T t,String... fieldNames){
        for(String fieldName:fieldNames){
            Object value;
            try {
                value = PropertyUtils.getReadMethod(PropertyUtils.getPropertyDescriptor(t,fieldName)).invoke(t);
            } catch (Exception e) {
                throw new RuntimeException("获取对象值时发生异常");
            }
            if(value==null){
                throw new IllegalArgumentException(fieldName+"不能为空");
            }
        }
    }


    /**
     * 根据@Check注解校验 参数
     * @param t
     * @param <T>
     * @return
     */
    public static <T> void checkPropsByAnnoExp(T t){
        Map<String, Check> checkMap = getFieldCheckMap(t.getClass());
        for(Map.Entry<String,Check> checkEntry:checkMap.entrySet()){
            Check check = checkEntry.getValue();
            String filedName = checkEntry.getKey();
            final Object value;
            try {
                value = BeanUtils.getPropertyDescriptor(t.getClass(),filedName).getReadMethod().invoke(t);
            } catch (Exception e) {
                throw new RuntimeException("校验工具类获取校验字段过程中出现异常",e);
            }

            if(checkEntry.getValue().required()){
                if(checkNull(value)||checkEmpty(value.toString())){
                    throw new IllegalArgumentException(filedName+"不能为空！");
                }
            }

            if(value!=null){
                //长度校验
                if (check.fixed()){
                    if(value.toString().length()!=check.length()){
                        throw new IllegalArgumentException(filedName+"长度不是固定长度"+check.length()+"!");
                    }
                }else{
                    if(value.toString().length()>check.length()){
                        throw new IllegalArgumentException(filedName+"长度超过最大长度限制!最大长度为"+check.length());
                    }
                }
                //数字校验
                if(check.numberic()){
                    if(!StringUtils.isNumeric(value.toString())){
                        throw new IllegalArgumentException(filedName+"必须为数字!");
                    }
                }
                if(checkRegex(value.toString(),check.regular())){
                    throw new IllegalArgumentException(filedName+"不满足正则表达式要求!");
                }
            }
        }
    }


    /**
     * 获取域名map name:Check
     *
     * @param cls
     * @return
     */
    private static Map<String, Check> getFieldCheckMap(Class<?> cls) {
        Map<String, Check> nameMap = new HashMap<String, Check>();
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            Check anno = f.getAnnotation(Check.class);
            if (anno != null) {
                nameMap.put(f.getName(), anno);
            }
        }
        return nameMap;
    }



}
