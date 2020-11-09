package com.demo.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UsersEntityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    public static final UsersEntity usersEntity = new UsersEntity();

    /**
     * Database Column Remarks:
     *   主键id 用户id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.id")
    public static final SqlColumn<String> id = usersEntity.id;

    /**
     * Database Column Remarks:
     *   用户名 用户名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.username")
    public static final SqlColumn<String> username = usersEntity.username;

    /**
     * Database Column Remarks:
     *   密码 密码
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.password")
    public static final SqlColumn<String> password = usersEntity.password;

    /**
     * Database Column Remarks:
     *   昵称 昵称
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.nickname")
    public static final SqlColumn<String> nickname = usersEntity.nickname;

    /**
     * Database Column Remarks:
     *   真实姓名 真实姓名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.realname")
    public static final SqlColumn<String> realname = usersEntity.realname;

    /**
     * Database Column Remarks:
     *   头像 头像
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.face")
    public static final SqlColumn<String> face = usersEntity.face;

    /**
     * Database Column Remarks:
     *   手机号 手机号
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.mobile")
    public static final SqlColumn<String> mobile = usersEntity.mobile;

    /**
     * Database Column Remarks:
     *   邮箱地址 邮箱地址
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.email")
    public static final SqlColumn<String> email = usersEntity.email;

    /**
     * Database Column Remarks:
     *   性别 性别 1:男  0:女  2:保密
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.sex")
    public static final SqlColumn<Integer> sex = usersEntity.sex;

    /**
     * Database Column Remarks:
     *   生日 生日
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.birthday")
    public static final SqlColumn<Date> birthday = usersEntity.birthday;

    /**
     * Database Column Remarks:
     *   创建时间 创建时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.created_time")
    public static final SqlColumn<Date> created_time = usersEntity.created_time;

    /**
     * Database Column Remarks:
     *   更新时间 更新时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: users.updated_time")
    public static final SqlColumn<Date> updated_time = usersEntity.updated_time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    public static final class UsersEntity extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> nickname = column("nickname", JDBCType.VARCHAR);

        public final SqlColumn<String> realname = column("realname", JDBCType.VARCHAR);

        public final SqlColumn<String> face = column("face", JDBCType.VARCHAR);

        public final SqlColumn<String> mobile = column("mobile", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<Integer> sex = column("sex", JDBCType.INTEGER);

        public final SqlColumn<Date> birthday = column("birthday", JDBCType.DATE);

        public final SqlColumn<Date> created_time = column("created_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updated_time = column("updated_time", JDBCType.TIMESTAMP);

        public UsersEntity() {
            super("users");
        }
    }
}