package com.jiuyi.alps.nka.service.restTemplate;

import com.jiuyi.alps.nka.domain.cust.CustBasicInfoDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * 参考nk中的ccs，那里面有接口的例子
 */

/**
 *
 restTemplate.exchange(
         String url,
         HttpMethod method,
         HttpEntity requestEntity,
         Class responseType,
         Object uriVariables[]
     )

 说明：
 1）url: 请求地址；
 2）method: 请求类型(如：POST,PUT,DELETE,GET)；
 3）requestEntity: 请求实体，封装请求头，请求内容
 4）responseType: 响应类型，根据服务接口的返回类型决定
 5）uriVariables: url中参数变量值
 */

/**
 * @author renpeng
 * @date 2018/7/12
 */
public class restTemplateService {

    private static final String URL="";
    @Autowired
    private RestTemplate restTemplate;

    public void testRestTemplate(){

        //发送请求的
        List<Map> list = new ArrayList<>();
        String responseStr = restTemplate.postForObject(URL, this.getInputRequestEntity(list), String.class);



    }


    /**
     * exchange既可以执行POST方法，还可以执行GET，所以应用最为广泛，使用方法如下：
     */
    public void testRestTemplateExchange(){

        String url = "http://localhost/mirana-ee/app/login";
        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        //  请勿轻易改变此提交方式，大部分的情况下，提交方式都是表单提交
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //  封装参数，千万不要替换为Map与HashMap，否则参数无法传递
        MultiValueMap<String, String> params= new LinkedMultiValueMap<String, String>();
        //  也支持中文
        params.add("username", "用户名");
        params.add("password", "123456");
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(params, headers);
        //  执行HTTP请求
        ResponseEntity<String> response = client.exchange(url, HttpMethod.POST, requestEntity, String.class);
        //  输出结果
        System.out.println(response.getBody());


    }
    /**
     * postForEntity是对exchange的简化，仅仅只需要减少HttpMethod.POST参数，如下：
     * postForObject(String url, Object request, Class responseType, Object uriVariables[]):
     */
    public void testRestTemplatePost(){


        /////////////////////////
        String reqJsonStr = "{\"code\":\"testCode\", \"group\":\"testGroup\",\"content\":\"testContent\", \"order\":1}";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(reqJsonStr,headers);
        ResponseEntity<Map> resp = restTemplate.exchange(URL, HttpMethod.POST, entity, Map.class);
        /////////////////////

        CustBasicInfoDomain data = new CustBasicInfoDomain();
//        data.setCode("cd123");
//        data.setGroup("TEST");
//        data.setContent("测试数据");
//        data.setOrder(5);
        CustBasicInfoDomain obj = restTemplate.postForObject(URL, data, CustBasicInfoDomain.class);
        //////////////////////////
        //发送请求的
        List<Map> list = new ArrayList<>();
        String responseStr = restTemplate.postForObject(URL, this.getInputRequestEntity(list), String.class);



    }
    /**
     * getForObject(String url, Class responseType, Object urlVariables[])：
     */
    public void testRestTemplateGet(){
//        返回请求的结果对象，例如
//        Order o = restTemplate.getForObject(Constants.SERVER_URL+"/order?orderCode={orderCode}",
//                Order.class,order.getOrderCode());
//        getForEntity(String url, Class responseType, Object urlVariables[])：
//        返回封装了数据对象的ResponseEntity对象，例如：
//        ResponseEntity<EBTUser> ebtuserResponse = restTemplate.getForEntity(url,EBTUser.class);
//        EBTUser user = ebtuserResponse.getBody();


        ////////////////////////////
        HttpHeaders header1 = new HttpHeaders();
        List list = new ArrayList<>();
        list.add(MediaType.APPLICATION_PDF);
        header1.setAccept(list);
        ResponseEntity<byte[]> response = restTemplate.exchange(URL, HttpMethod.GET, new HttpEntity<byte[]>(header1), byte[].class);
        ////////////////////////////
        //发送请求的,通过get请求来访问页面，等待返回值
        String status = restTemplate.getForObject(URL, String.class);

    }


    /**
     * 携带的请求信息
     * @param list
     * @return
     */
    private HttpEntity<MultiValueMap<String, String>> getInputRequestEntity(List list) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cookie", "token=" );
        headers.add("Content-Type", "application/json");
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity(list, headers);
        return requestEntity;
    }
}
