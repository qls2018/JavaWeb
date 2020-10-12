package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @auther qq
 * @creat 2020-08-17-10:46
 */
public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void regiserUser() {
        userService.regiserUser(new User(null,"bbj168","66666","bbj168@qq.com"));
        userService.regiserUser(new User(null,"abc168","66666","abc168@qq.com"));
    }

    @Test
    public void login() {
        System.out.println( userService.login(new User(null,"admin","admin",null)));
    }

    @Test
    public void existsUsername() {
        if (userService.existsUsername("qqls")){
            System.out.println("用户名已存在！");
        }else {
            System.out.println("用户名可用！");
        }
    }
}