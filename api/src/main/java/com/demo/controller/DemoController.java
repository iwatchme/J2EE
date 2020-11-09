package com.demo.controller;

import com.demo.pojo.UserDemo;
import com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.logging.Logger;

@RestController
@ApiIgnore
public class DemoController {

    @Autowired
    private DemoService service;

    @GetMapping("/getUser")
    public UserDemo getUser(int id) {
        try {
            return  service.getUser(id);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }




}
