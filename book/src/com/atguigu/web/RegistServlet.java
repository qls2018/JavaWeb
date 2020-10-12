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
 * @creat 2020-08-17-15:28
 */
public class RegistServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1。获取参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");

        //2。验证验证码
        if ("abcde".equalsIgnoreCase(code)) {
            //正确
            //检查用户名是否相同
            if (userService.existsUsername(username)) {
                //不可用
                System.out.println("用户名[" + username + "]已存在！");
                req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
            } else {
                //可用
                //调用Sservice保存到数据库
                userService.regiserUser(new User(null,username,password,email));
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req,resp);
            }


        } else {
            //不正确
            System.out.println("验证码[" + code + "]错误！");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
        }


    }
}
