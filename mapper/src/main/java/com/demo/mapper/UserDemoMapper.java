package com.demo.mapper;

import static com.demo.mapper.UserDemoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.demo.pojo.UserDemo;
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
public interface UserDemoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, age);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserDemo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UserDemo> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserDemoResult")
    Optional<UserDemo> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserDemoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER)
    })
    List<UserDemo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userDemo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userDemo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default int insert(UserDemo record) {
        return MyBatis3Utils.insert(this::insert, record, userDemo, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(age).toProperty("age")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default int insertMultiple(Collection<UserDemo> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, userDemo, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(age).toProperty("age")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default int insertSelective(UserDemo record) {
        return MyBatis3Utils.insert(this::insert, record, userDemo, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(age).toPropertyWhenPresent("age", record::getAge)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default Optional<UserDemo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userDemo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default List<UserDemo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userDemo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default List<UserDemo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userDemo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default Optional<UserDemo> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userDemo, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    static UpdateDSL<UpdateModel> updateAllColumns(UserDemo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(age).equalTo(record::getAge);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserDemo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(age).equalToWhenPresent(record::getAge);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default int updateByPrimaryKey(UserDemo record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(age).equalTo(record::getAge)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: demo")
    default int updateByPrimaryKeySelective(UserDemo record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(age).equalToWhenPresent(record::getAge)
            .where(id, isEqualTo(record::getId))
        );
    }
}