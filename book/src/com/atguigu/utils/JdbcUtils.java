package com.atguigu.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import sun.applet.Main;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @auther qq
 * @creat 2020-08-13-15:23
 */
public class JdbcUtils {

    private static DruidDataSource dataSource;

    static{

        try {
            Properties properties = new Properties();
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(inputStream);
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);

//            System.out.println(dataSource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //返回null，获取失败。
    public static Connection getconnection(){

        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void close(Connection conn){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


}
