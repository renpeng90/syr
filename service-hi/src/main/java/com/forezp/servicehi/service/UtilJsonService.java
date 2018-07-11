package com.forezp.servicehi.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.forezp.servicehi.api.domain.User;
import com.forezp.servicehi.common.util.util.JsonUtil;
import com.forezp.servicehi.common.util.util.ceshiData.JsonData;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/**
 一，几个基本概念
 ①JSONArray 相当于 JAVA中的List<Object>，如：['a','b','c'....]
 ②JSONObject相当于JAVA中的Map<String, Object>，如：{'1':'a', '2':'b'...}













 */

/**
 * @author renpeng
 * @date 2018/6/6
 */
@Service
public class UtilJsonService {

    private Logger logger = LoggerFactory.getLogger(getClass());
//    yyyyMMdd
    public static final String DATE_8_DATE_STR = "20180606";

    //做json缓存的
    private static final int MAX_CACHE_SIZE = 8;
    private Map<String, JSONObject> cache = new LinkedHashMap<String, JSONObject>() {
        @Override
        protected boolean removeEldestEntry(Map.Entry<String, JSONObject> eldest) {
            return this.size() > MAX_CACHE_SIZE;
        }
    };


    /**
     * 先在缓冲中查询数据，如果没有就从数据库差，然后放到缓冲中
     * @param identNo
     * @return
     */
    public JSONObject getCarrierReportJson(String identNo) {
        JSONObject carrierReport = cache.get(identNo);
        if (carrierReport == null) {
            String carrierReportStr = "去查询json数据";//this.getCarrierReport(identNo);
            if (StringUtils.isBlank(carrierReportStr)) {
                return null;
            }
            carrierReport = JSONObject.parseObject(carrierReportStr);
            cache.put(identNo, carrierReport);
        }

        return carrierReport;
    }

    /**
     * 通过jsonUtil了解的使用方法
     * @return
     */
    public String findJson() {
        String carrierReportStr=JsonData.getCarrerInfo();
        JSONObject carrierReport = JSONObject.parseObject(carrierReportStr);
        if (carrierReport == null) {
            return null;
        }
        JSONArray callContactDetails = carrierReport.getJSONArray("call_contact_detail");
        boolean callBool = !(callContactDetails != null && callContactDetails.size() > 0);
        if (callBool) {
            return null;
        }
        //近6个月联系次数≥10次的联系人个数
        Integer sixMoreTenCount=0;
        for (int i = 0; i < callContactDetails.size(); i++) {
            JSONObject callContact = (JSONObject) callContactDetails.get(i);
            if (callContact != null) {
                Integer callCntSixm=(Integer) callContact.get("call_cnt_6m");
                if(callCntSixm!=null&&callCntSixm>=10){
                    sixMoreTenCount++;
                }
            }
        }
        return null;
    }
    /**
     * 解析各种格式的json数据
     * (做错误判断)
     * @return
     */
    public String findJson4() {
        String jsonDataStr=JsonUtil.getJsonDataA;
        JSONObject jsonData =JSONObject.parseObject(jsonDataStr);
        if (jsonData == null) {
            return null;
        }
        JSONArray array =jsonData.getJSONArray("array");
        boolean arrayBool = !(array != null && array.size() > 0);
        if (!arrayBool) {
            for (int i = 0; i < array.size(); i++) {
                int a = (Integer) array.get(i);
                logger.info("a={}",a);
            }
        }
        JSONArray arraylist =jsonData.getJSONArray("arraylist");
        boolean arraylistBool = !(arraylist != null && arraylist.size() > 0);
        if (!arraylistBool) {
            for (int i = 0; i < arraylist.size(); i++) {
                JSONObject arraylistObject = (JSONObject) arraylist.get(i);
                String a=(String)arraylistObject.get("a");
                String c=(String)arraylistObject.get("c");
                String e=(String)arraylistObject.get("e");
                logger.info("a={},e={},c={}",a,e,c);
            }
        }
        JSONObject object =jsonData.getJSONObject("object");
        if (object != null) {
            String a=(String)object.get("a");
            String c=(String)object.get("c");
            String e=(String)object.get("e");
            logger.info("a={},e={},c={}",a,e,c);
        }
        String stringA =(String)jsonData.get("string");
        if(!StringUtils.isBlank(stringA)){
            logger.info("stringA={}",stringA);
        }
        return "success";
    }

    /**
     * 解析各种格式的json数据
     * (不做错误判断)
     * @return
     */
    public void findJson3() {
        String jsonDataStr=JsonUtil.getJsonDataA;
        JSONObject jsonData =JSONObject.parseObject(jsonDataStr);
        JSONArray array =jsonData.getJSONArray("array");
        JSONArray arraylist =jsonData.getJSONArray("arraylist");
        JSONObject object =jsonData.getJSONObject("object");
        String stringA =(String)jsonData.get("string");
        for (int i = 0; i < array.size(); i++) {
            int a = (Integer) array.get(i);
            logger.info("a={}",a);
        }
        for (int i = 0; i < arraylist.size(); i++) {
            JSONObject arraylistObject = (JSONObject) arraylist.get(i);
            String a=(String)arraylistObject.get("a");
            String c=(String)arraylistObject.get("c");
            String e=(String)arraylistObject.get("e");
            logger.info("a={},e={},c={}",a,e,c);
        }

        String a=(String)object.get("a");
        String c=(String)object.get("c");
        String e=(String)object.get("e");
        logger.info("a={},e={},c={}",a,e,c);
        logger.info("stringA={}",stringA);

    }




//    =======================================================================
public static void main(String[] args) {
    //测试JSON解析

    //1从对象（集合）到JSON字符串

    User u1 = new User(999,"tom","123456");

    //导入阿里巴巴   JSON对象  jar包
    String ju1=JSONObject.toJSONString(u1);
    System.out.println("ju1="+ju1);

    //集合
    List<User> lu = new ArrayList<User>();
    lu.add(new User(111,"User1","111"));
    lu.add(new User(222,"User2","111"));
    lu.add(new User(333,"User3","111"));
    lu.add(new User(444,"User4","111"));

    //导入阿里巴巴 JSON集合  jar包
    String jlu = JSONArray.toJSONString(lu);
    System.out.println("jlu="+jlu);

    //2从JSON字符串到集合（对象）
    //阿里巴巴JSON 可以直接将JSON字符串转为对象
    User u2 =JSONObject.parseObject(ju1,User.class);
    System.out.println("u2="+u2);


    try {
        //名字冲突使用全路径  官方jar包
        //官方jar包不能直接转为对象，只能获取对象的单个值
//        JSONObject jo = new JSONObject(ju1);
//
//        int userid = jo.getInt("userID");            //只能获取单个值
//        System.out.println("userID="+userid);


    } catch (JSONException e) {
        // TODO 自动生成的 catch 块
        e.printStackTrace();
    }
    //字符串集合
    //使用阿里巴巴jar包可以直接得到对象的集合
    List<User> lu2 = JSONArray.parseArray(jlu,User.class);
    //遍历集合
    for(User u:lu2)
    {

        System.out.println(u);
    }

    try {
//        //使用官方jar包 必须解析JSON数组
//        JSONArray ja = new JSONArray(jlu);
//
//        //使用官方jar包   解析JSON数组时一次只能获取其中的一个JSON对象
//        JSONObject  u3=  ja.getJSONObject(0);
//
//        System.out.println("u3="+u3);


    } catch (JSONException e) {
        // TODO 自动生成的 catch 块
        e.printStackTrace();
    }

}

//    =======================================================================

    /**
     * 这是网上的一种对于数据在文件中的数据，数据格式很全
     * 这个很好
     */
    public void readWithFastJson()
    {
        String jsonString = "{\"array\":[1,2,3],\"arraylist\":[{\"a\":\"b\",\"c\":\"d\",\"e\":\"f\"},{\"a\":\"b\",\"c\":\"d\",\"e\":\"f\"},{\"a\":\"b\",\"c\":\"d\",\"e\":\"f\"}],\"object\":{\"a\":\"b\",\"c\":\"d\",\"e\":\"f\"},\"string\":\"HelloWorld\"}";

        // 如果json数据以形式保存在文件中，用FileReader进行流读取！！
        // path为json数据文件路径！！
        // JSONReader reader = new JSONReader(new FileReader(path));

        // 为了直观，方便运行，就用StringReader做示例！
        JSONReader reader = new JSONReader(new StringReader(jsonString));
        reader.startObject();
        System.out.print("start fastjson");
        while (reader.hasNext())
        {
            String key = reader.readString();
            System.out.print("key " + key);
            if (key.equals("array"))
            {
                reader.startArray();
                System.out.print("start " + key);
                while (reader.hasNext())
                {
                    String item = reader.readString();
                    System.out.print(item);
                }
                reader.endArray();
                System.out.print("end " + key);
            }
            else if (key.equals("arraylist"))
            {
                reader.startArray();
                System.out.print("start " + key);
                while (reader.hasNext())
                {
                    reader.startObject();
                    System.out.print("start arraylist item");
                    while (reader.hasNext())
                    {
                        String arrayListItemKey = reader.readString();
                        String arrayListItemValue = reader.readObject().toString();
                        System.out.print("key " + arrayListItemKey);
                        System.out.print("value " + arrayListItemValue);
                    }
                    reader.endObject();
                    System.out.print("end arraylist item");
                }
                reader.endArray();
                System.out.print("end " + key);
            }
            else if (key.equals("object"))
            {
                reader.startObject();
                System.out.print("start object item");
                while (reader.hasNext())
                {
                    String objectKey = reader.readString();
                    String objectValue = reader.readObject().toString();
                    System.out.print("key " + objectKey);
                    System.out.print("value " + objectValue);
                }
                reader.endObject();
                System.out.print("end object item");
            }
            else if (key.equals("string"))
            {
                System.out.print("start string");
                String value = reader.readObject().toString();
                System.out.print("value " + value);
                System.out.print("end string");
            }
        }
        reader.endObject();
        System.out.print("start fastjson");
    }

}
