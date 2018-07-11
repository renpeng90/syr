package com.jiuyi.alps.nka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableScheduling
@EnableEurekaClient
@SpringBootApplication
@EnableAsync
@EnableTransactionManagement
@EnableSwagger2
//@EnableOssSupport
//@EnableRestExceptionHandler
//@Import(value = {SecurityConfiguration.class, RestTemplateConfig.class, FeignClientConfiguration.class})
public class NkServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NkServiceApplication.class, args);
    }

//    @Bean
//    public Docket baseServiceApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("sevice-api")
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Service APIs")
//                .description("服务接口").version("1.0").build();
//    }
}
