package com.demo.mapper;

import static com.demo.mapper.UsersEntityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.demo.pojo.UsersEntity;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UsersEntityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    BasicColumn[] selectList = BasicColumn.columnList(id, username, password, nickname, realname, face, mobile, email, sex, birthday, created_time, updated_time);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UsersEntity> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UsersEntity> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UsersEntityResult")
    Optional<UsersEntity> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UsersEntityResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="realname", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="face", property="face", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="created_time", property="created_time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_time", property="updated_time", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UsersEntity> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, usersEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, usersEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int deleteByPrimaryKey(String id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int insert(UsersEntity record) {
        return MyBatis3Utils.insert(this::insert, record, usersEntity, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(nickname).toProperty("nickname")
            .map(realname).toProperty("realname")
            .map(face).toProperty("face")
            .map(mobile).toProperty("mobile")
            .map(email).toProperty("email")
            .map(sex).toProperty("sex")
            .map(birthday).toProperty("birthday")
            .map(created_time).toProperty("created_time")
            .map(updated_time).toProperty("updated_time")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int insertMultiple(Collection<UsersEntity> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, usersEntity, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(nickname).toProperty("nickname")
            .map(realname).toProperty("realname")
            .map(face).toProperty("face")
            .map(mobile).toProperty("mobile")
            .map(email).toProperty("email")
            .map(sex).toProperty("sex")
            .map(birthday).toProperty("birthday")
            .map(created_time).toProperty("created_time")
            .map(updated_time).toProperty("updated_time")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int insertSelective(UsersEntity record) {
        return MyBatis3Utils.insert(this::insert, record, usersEntity, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(nickname).toPropertyWhenPresent("nickname", record::getNickname)
            .map(realname).toPropertyWhenPresent("realname", record::getRealname)
            .map(face).toPropertyWhenPresent("face", record::getFace)
            .map(mobile).toPropertyWhenPresent("mobile", record::getMobile)
            .map(email).toPropertyWhenPresent("email", record::getEmail)
            .map(sex).toPropertyWhenPresent("sex", record::getSex)
            .map(birthday).toPropertyWhenPresent("birthday", record::getBirthday)
            .map(created_time).toPropertyWhenPresent("created_time", record::getCreated_time)
            .map(updated_time).toPropertyWhenPresent("updated_time", record::getUpdated_time)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default Optional<UsersEntity> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, usersEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default List<UsersEntity> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, usersEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default List<UsersEntity> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, usersEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default Optional<UsersEntity> selectByPrimaryKey(String id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, usersEntity, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    static UpdateDSL<UpdateModel> updateAllColumns(UsersEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword)
                .set(nickname).equalTo(record::getNickname)
                .set(realname).equalTo(record::getRealname)
                .set(face).equalTo(record::getFace)
                .set(mobile).equalTo(record::getMobile)
                .set(email).equalTo(record::getEmail)
                .set(sex).equalTo(record::getSex)
                .set(birthday).equalTo(record::getBirthday)
                .set(created_time).equalTo(record::getCreated_time)
                .set(updated_time).equalTo(record::getUpdated_time);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UsersEntity record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(nickname).equalToWhenPresent(record::getNickname)
                .set(realname).equalToWhenPresent(record::getRealname)
                .set(face).equalToWhenPresent(record::getFace)
                .set(mobile).equalToWhenPresent(record::getMobile)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(birthday).equalToWhenPresent(record::getBirthday)
                .set(created_time).equalToWhenPresent(record::getCreated_time)
                .set(updated_time).equalToWhenPresent(record::getUpdated_time);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int updateByPrimaryKey(UsersEntity record) {
        return update(c ->
            c.set(username).equalTo(record::getUsername)
            .set(password).equalTo(record::getPassword)
            .set(nickname).equalTo(record::getNickname)
            .set(realname).equalTo(record::getRealname)
            .set(face).equalTo(record::getFace)
            .set(mobile).equalTo(record::getMobile)
            .set(email).equalTo(record::getEmail)
            .set(sex).equalTo(record::getSex)
            .set(birthday).equalTo(record::getBirthday)
            .set(created_time).equalTo(record::getCreated_time)
            .set(updated_time).equalTo(record::getUpdated_time)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: users")
    default int updateByPrimaryKeySelective(UsersEntity record) {
        return update(c ->
            c.set(username).equalToWhenPresent(record::getUsername)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(nickname).equalToWhenPresent(record::getNickname)
            .set(realname).equalToWhenPresent(record::getRealname)
            .set(face).equalToWhenPresent(record::getFace)
            .set(mobile).equalToWhenPresent(record::getMobile)
            .set(email).equalToWhenPresent(record::getEmail)
            .set(sex).equalToWhenPresent(record::getSex)
            .set(birthday).equalToWhenPresent(record::getBirthday)
            .set(created_time).equalToWhenPresent(record::getCreated_time)
            .set(updated_time).equalToWhenPresent(record::getUpdated_time)
            .where(id, isEqualTo(record::getId))
        );
    }
}