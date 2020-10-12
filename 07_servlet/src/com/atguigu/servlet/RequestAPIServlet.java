package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther qq
 * @creat 2020-08-12-08:50
 */
public class RequestAPIServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("URI==> " + req.getRequestURI());
        System.out.println("URL==> " + req.getRequestURL());
        System.out.println("HOST==> " + req.getRemoteHost());
        System.out.println("Header==> " + req.getHeader("User-Agent"));
        System.out.println("Method==> " + req.getMethod());

    }
}
