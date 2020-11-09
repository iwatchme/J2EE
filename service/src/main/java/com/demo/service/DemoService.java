package com.demo.service;

import com.demo.pojo.UserDemo;
import org.apache.catalina.User;

public interface DemoService {

    public UserDemo getUser(int id) throws Throwable;

    public void saveUser(UserDemo userDemo);

    public void updateUser(UserDemo userDemo);

    public void  delete(int id);
}
