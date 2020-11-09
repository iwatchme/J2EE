package com.demo.service.impl;

import com.demo.mapper.UserDemoMapper;
import com.demo.pojo.UserDemo;
import com.demo.service.DemoService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private UserDemoMapper mapper;


    @Override
    public UserDemo getUser(int id) throws Throwable {

        return mapper.selectOne(SelectDSLCompleter.allRows()).orElseThrow(new ErrorMsg("error"));
    }

    @Override
    public void saveUser(UserDemo userDemo) {
        mapper.insertSelective(userDemo);

    }

    @Override
    public void updateUser(UserDemo userDemo) {
        mapper.updateByPrimaryKey(userDemo);
    }

    @Override
    public void delete(int id) {
        mapper.deleteByPrimaryKey(id);

    }

    class ErrorMsg implements Supplier<Throwable> {

        private String message;

        public ErrorMsg(String msg) {
            this.message = msg;
        }

        @Override
        public Throwable get() {
            return new Throwable(message);
        }
    }
}
