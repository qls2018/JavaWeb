package com.atguigu.dao.impl;

import com.atguigu.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @auther qq
 * @creat 2020-08-13-16:32
 */
public abstract class BaseDao {

    //使用Dbutils操作数据库
    private QueryRunner queryRunner = new QueryRunner();

    //用来执行insert/update/delete语句
    public int update(String sql,Object ...args){

        Connection connection = JdbcUtils.getconnection();

        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return -1;
    }


    public <T> T queryForOne(Class<T> type, String sql, Object ...args){

        Connection connection = JdbcUtils.getconnection();
        try {
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }
        return null;
    }


    public <T> List<T> queryForList(Class<T> type,String sql,Object ...args){
        Connection connection = JdbcUtils.getconnection();

        try {
            return queryRunner.query(connection,sql,new BeanListHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(connection);
        }

        return null;
    }

    public Object queryForSingleValue(String sql,Object ...args){
        Connection conn = JdbcUtils.getconnection();

        try {
            return queryRunner.query(conn,sql, new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.close(conn);
        }
        return null;
    }



}
