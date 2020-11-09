package com.demo.pojo.bo;

import com.google.common.base.Strings;
import io.swagger.annotations.ApiModel;

@ApiModel
public class UserBo {

    @Override
    public String toString() {
        return "UserBo{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }

    private String userName;
    private String password;
    private String confirmPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
