package com.demo.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDemoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    public static final UserDemo userDemo = new UserDemo();

    /**
     * Database Column Remarks:
     *   主键id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.id")
    public static final SqlColumn<Integer> id = userDemo.id;

    /**
     * Database Column Remarks:
     *   用户名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.name")
    public static final SqlColumn<String> name = userDemo.name;

    /**
     * Database Column Remarks:
     *   用户年龄
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: demo.age")
    public static final SqlColumn<Integer> age = userDemo.age;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    public static final class UserDemo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> age = column("age", JDBCType.INTEGER);

        public UserDemo() {
            super("demo");
        }
    }
}