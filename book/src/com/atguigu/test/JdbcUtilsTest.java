package com.atguigu.test;

import com.atguigu.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @auther qq
 * @creat 2020-08-13-16:24
 */
public class JdbcUtilsTest {
    @Test
    public void testJdbcUtils(){
        for (int i = 0; i < 100; i++) {

            Connection connection = JdbcUtils.getconnection();
            System.out.println(connection);
            JdbcUtils.close(connection);
        }
    }

}
