package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther qq
 * @creat 2020-08-11-11:17
 */
public class ContextServlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();

        context.setAttribute("key1","value1");

        System.out.println("context中获取域数据key1的值是：" + context.getAttribute("key1"));
    }
}
