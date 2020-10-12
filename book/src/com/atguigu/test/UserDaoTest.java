package com.atguigu.test;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import com.mysql.jdbc.MiniAdmin;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @auther qq
 * @creat 2020-08-14-11:17
 */
public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername() {

        if(userDao.queryUserByUsername("admin123") == null){
            System.out.println("用户名可用！");
        }else{
            System.out.println("用户名已存在！");
        }


    }

    @Test
    public void queryUserByUsernameAndPassword() {
        if(userDao.queryUserByUsernameAndPassword("admin", "admin12") == null ){
            System.out.println("用户净或密码错误，登陆失败！");
        }else{
            System.out.println("查询成功！");
        }
    }

    @Test
    public void saveUser() {
        User user = new User(null, "qqls", "123456", "sdf@233.com");
        System.out.println(userDao.saveUser(user));


    }
}