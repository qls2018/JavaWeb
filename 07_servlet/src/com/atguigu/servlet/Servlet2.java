package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther qq
 * @creat 2020-08-12-10:38
 */
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("在柜台2中查看材料：" + username);

        //查看柜台1的章
        Object key = req.getAttribute("key");
        System.out.println("柜台1是否有章：" + key);

        //处理自己的业务
        System.out.println("处理自己的业务。");


    }
}
