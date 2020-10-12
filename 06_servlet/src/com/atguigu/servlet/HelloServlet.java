package com.atguigu.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @auther qq
 * @creat 2020-08-04-11:26
 */
public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("1 构造器方法。");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2 init初始化方法。");

        System.out.println("HelloServlet程序的别名是：" + servletConfig.getServletName());

        System.out.println("初始化参数username的值是：" + servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是：" + servletConfig.getInitParameter("url"));

        System.out.println(servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3 service === Hello Servlet 被访问了");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();

        if ("GET".equals(method)){
            doGet();
        }else if ("POST".equals(method)){
            doPost();
        }

    }

    public void doGet(){
        System.out.println("get请求");
        System.out.println("get请求");
    }
    public void doPost(){
        System.out.println("post请求");
        System.out.println("post请求");
    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4 . destroy销毁方法.");
    }
}
