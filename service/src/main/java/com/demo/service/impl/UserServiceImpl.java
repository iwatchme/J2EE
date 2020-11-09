package com.demo.service.impl;


import com.demo.mapper.UsersEntityDynamicSqlSupport;
import com.demo.mapper.UsersEntityMapper;
import com.demo.pojo.UsersEntity;
import com.demo.pojo.bo.UserBo;
import com.demo.service.UserService;
import com.demo.utils.Sex;
import com.power.common.util.DateTimeUtil;
import com.power.common.util.IDCardUtil;
import com.power.common.util.MD6Util;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.checkerframework.checker.nullness.Opt;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.SqlCriterion;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.DefaultSelectStatementProvider;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UsersEntityMapper usersEntityMapper;


    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean isUserExistByName(String userName) {
        Optional<UsersEntity> usersEntity =  usersEntityMapper.selectOne(c-> {
            return c.where(UsersEntityDynamicSqlSupport.username, SqlBuilder.isEqualTo(userName));
        });
        return usersEntity.isPresent();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean isUserExistById(String id) {
        Optional<UsersEntity> usersEntity =  usersEntityMapper.selectOne(c-> {
           return c.where(UsersEntityDynamicSqlSupport.id, SqlBuilder.isEqualTo(id));
        });
        return usersEntity.isPresent();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void saveUser(UserBo userBo) {
//        usersEntityMapper.insert()
        UsersEntity entity = new UsersEntity();
        entity.setUsername(userBo.getUserName());
        entity.setPassword(MD6Util.md6(userBo.getPassword()));
        entity.setNickname(userBo.getUserName());
        entity.setFace("testurl");
        entity.setBirthday(DateTimeUtil.strToDate("1990-06-21", DateTimeUtil.DATE_FORMAT_DAY));
        entity.setSex(Sex.MALE.code);
        entity.setCreated_time(DateTimeUtil.strToDate(DateTimeUtil.nowStrTime(), DateTimeUtil.DATE_FORMAT_SECOND));
        entity.setUpdated_time(DateTimeUtil.strToDate(DateTimeUtil.nowStrTime(), DateTimeUtil.DATE_FORMAT_SECOND));
        entity.setId(IDCardUtil.getIdCard());

        int result = usersEntityMapper.insert(entity);
        Logger.getGlobal().log(Level.WARNING, "result: %d", result);

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public UsersEntity isUserExistByLogin(String name, String password) {
        Optional<UsersEntity> usersEntity =  usersEntityMapper.selectOne(c-> {
            return c.where(UsersEntityDynamicSqlSupport.username, SqlBuilder.isEqualTo(name)).and(
                    UsersEntityDynamicSqlSupport.password, SqlBuilder.isEqualTo(password)
            );
        });
        return usersEntity.get();
    }


}
