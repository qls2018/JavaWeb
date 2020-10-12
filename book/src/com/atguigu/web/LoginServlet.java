package com.atguigu.web;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther qq
 * @creat 2020-08-17-17:04
 */
public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //调用userService.login()登陆处理业务
        User loginUser = userService.login(new User(null, username, password, null));

        if(loginUser == null ){
            System.out.println("登陆失败！");
            req.getRequestDispatcher("/pages/user/login.html").forward(req,resp);
        }else{
            System.out.println("登陆成功！");
            req.getRequestDispatcher("/pages/user/login_success.html").forward(req,resp);
        }
    }
}
