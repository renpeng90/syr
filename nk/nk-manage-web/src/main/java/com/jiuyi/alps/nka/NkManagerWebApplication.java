package com.jiuyi.alps.nka;


import common.feign.config.FeignClientConfiguration;
import common.rest.EnableRestExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Import(value = {FeignClientConfiguration.class})
@EnableEurekaClient
@EnableSwagger2
@SpringBootApplication
@EnableRestExceptionHandler
@EnableRedisHttpSession
//@EnableDynamicWebSecurity
public class NkManagerWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(NkManagerWebApplication.class, args);
    }
    
//    @Bean
//    public static ConfigureRedisAction configureRedisAction() {
//        return ConfigureRedisAction.NO_OP;
//    }
//
//    @Bean
//    public Docket baseServiceApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("manager-web-api")
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Manager Web APIs")
//                .description("后台管理接口").version("1.0").build();
//    }
}
