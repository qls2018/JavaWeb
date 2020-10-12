package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther qq
 * @creat 2020-08-13-11:28
 */
public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此一游。Response1");
//        resp.setStatus(302);

//        resp.setHeader("Location","http://localhost:8080/07_servlet/response2");
//        resp.setHeader("Location","http://localhost:8080/07_servlet/WEB-INF/form.html");
//        resp.setHeader("Location","http://www.baidu.com");


        //第二种方法
        resp.sendRedirect("http://www.baidu.com");
    }
}
