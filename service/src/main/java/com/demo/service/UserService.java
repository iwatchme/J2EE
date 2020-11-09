package com.demo.service;


import com.demo.pojo.UsersEntity;
import com.demo.pojo.bo.UserBo;

public interface UserService {

    public boolean isUserExistByName(String userName);

    public boolean isUserExistById(String id);

    public void saveUser(UserBo userBo);

    public UsersEntity isUserExistByLogin(String name, String password);
}
