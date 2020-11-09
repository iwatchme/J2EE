package com.demo.swagger;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerUtils {

    public Docket createDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder().title("Demo")
                .license("demo licence")
                        .contact(new Contact("frank.yang", "www.baidu.com", "demo@126.com"))
                        .version("1.0")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.demo.controller"))
                .paths(PathSelectors.any())
                .build()
                ;
    }
}
