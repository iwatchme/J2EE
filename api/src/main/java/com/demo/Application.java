package com.demo;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.swing.*;

@SpringBootApplication
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
