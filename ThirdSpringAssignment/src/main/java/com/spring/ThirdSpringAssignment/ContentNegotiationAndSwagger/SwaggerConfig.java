package com.spring.ThirdSpringAssignment.ContentNegotiationAndSwagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/** @Configuration annotation is used to auto scan this file, it helps Spring boot to add necessary dependeny for swagger **/
@Configuration

/** And to enable Swagger, @EnableSwagger2 annotation is used **/
@EnableSwagger2
public class SwaggerConfig {

    /** paths method is used to decide which APIs documentation will be created in swagger **/
    /** Here, i am using "/api/**", which means all those APIs whose URLs are starting with the keyword api **/

    /** And the basePackage being selected is "com.spring", which means all packages inside this package,
     * will be scanned for the APIs **/
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/**"))
                .apis(RequestHandlerSelectors.basePackage("com.spring"))
                .build();
    }
}
