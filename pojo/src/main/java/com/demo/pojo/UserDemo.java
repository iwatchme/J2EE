package com.demo.pojo;

import javax.annotation.Generated;

/**
 * Database Table Remarks:
 *   测试表 测试使用
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table demo
 */
public class UserDemo {
    /**
     * Database Column Remarks:
     *   主键id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.id")
    private Integer id;

    /**
     * Database Column Remarks:
     *   用户名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.name")
    private String name;

    /**
     * Database Column Remarks:
     *   用户年龄
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.age")
    private Integer age;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.age")
    public Integer getAge() {
        return age;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.age")
    public void setAge(Integer age) {
        this.age = age;
    }
}