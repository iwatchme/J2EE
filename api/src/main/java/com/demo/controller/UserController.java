package com.demo.controller;

import com.demo.pojo.UsersEntity;
import com.demo.pojo.bo.UserBo;
import com.demo.service.UserService;
import com.google.common.base.Strings;
import com.power.common.enums.HttpCodeEnum;
import com.power.common.model.CommonResult;
import com.power.common.util.MD6Util;
import io.swagger.annotations.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;

@Api(value = "注册登录", tags = {"用户注册登录相关的api"})
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    private static final Logger logger = LogManager.getLogger();


    @ApiOperation(value = "用户名是否存在", notes = "用户名是否存在1", httpMethod = "GET")
    @GetMapping("/isExistById")
    public Object isUserExistById(@ApiParam(value = "用户id", required = true, type = "String")@RequestParam(value = "id") String id) {

        logger.debug("is user exist: "+id);
        if (Strings.isNullOrEmpty(id)) {
             return CommonResult.fail(HttpCodeEnum.BAD_REQUEST);
         }

         boolean isExist = userService.isUserExistById(id);
        if (isExist) {
            return CommonResult.ok(HttpCodeEnum.SUCCESS);
        }
        return CommonResult.fail(HttpCodeEnum.NOT_FOUND);
    }

    @ApiOperation(value = "用户名是否存在", notes = "用户名是否存在1", httpMethod = "GET")
    @GetMapping("/isExistByName")
    public Object isUserExistByName(@ApiParam(value = "用户名", required = true, type = "String")@RequestParam(value = "username") String name) {
        logger.debug("is user exist by name: "+name);

        if (Strings.isNullOrEmpty(name)) {
            return CommonResult.fail(HttpCodeEnum.BAD_REQUEST.code, "请输入用户名");
        }

        boolean isExist = userService.isUserExistByName(name);
        if (isExist) {
            return CommonResult.fail(HttpCodeEnum.INTERNAL_SERVER_ERROR.code, "用户名已存在");
        }
        return CommonResult.ok(HttpCodeEnum.SUCCESS);
    }

    @ApiOperation(value = "用户注册", notes = "用户注册1", httpMethod = "POST")
    @PostMapping("/register")
    public Object register(@RequestBody  UserBo userBo) {
        String name = userBo.getUserName();
        String password = userBo.getPassword();
        String confirmPassword = userBo.getConfirmPassword();


        if (Strings.isNullOrEmpty(name)) {
            return CommonResult.fail(HttpCodeEnum.BAD_REQUEST.code, "name is empty");
        }

        if (Strings.isNullOrEmpty(password)) {
            return CommonResult.fail(HttpCodeEnum.BAD_REQUEST.code, "password is empty");
        }


        if (Strings.isNullOrEmpty(confirmPassword)) {
            return CommonResult.fail(HttpCodeEnum.BAD_REQUEST.code, "confirmword is empty");
        }

        if (password.length() <= 6 || confirmPassword.length() <= 6 ) {
            return CommonResult.fail(HttpCodeEnum.BAD_REQUEST.code, "password is too short");
        }

        if (!password.equalsIgnoreCase(confirmPassword)) {
            return CommonResult.fail(HttpCodeEnum.BAD_REQUEST.code, "password is not the same");
        }


        userService.saveUser(userBo);


        return CommonResult.ok(HttpCodeEnum.SUCCESS);
    }



    @ApiOperation(value = "用户登录", notes = "用户登录", httpMethod = "POST")
    @PostMapping("/login")
    public Object login(@RequestBody  UserBo userBo) {
        String name = userBo.getUserName();
        String password = userBo.getPassword();


        if (Strings.isNullOrEmpty(name)) {
            return CommonResult.fail(HttpCodeEnum.BAD_REQUEST.code, "name is empty");
        }

        if (Strings.isNullOrEmpty(password)) {
            return CommonResult.fail(HttpCodeEnum.BAD_REQUEST.code, "password is empty");
        }


        UsersEntity entity = userService.isUserExistByLogin(name, MD6Util.md6(password));

        if (entity == null) {
            return CommonResult.fail(HttpCodeEnum.BAD_REQUEST.code, "当前用户不存在");
        }


        return CommonResult.ok(HttpCodeEnum.SUCCESS);
    }


    @ApiOperation(value = "用户登出", notes = "用户登出", httpMethod = "POST")
    @PostMapping("/logout")
    public Object logout() {


        return null;

    }

}
