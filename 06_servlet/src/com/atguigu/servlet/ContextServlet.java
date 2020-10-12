package com.atguigu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;
import java.io.IOException;

/**
 * @auther qq
 * @creat 2020-08-11-10:09
 */
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
        String ip = context.getInitParameter("ip");

        System.out.println("context-param参数username的值是：" + username);
        System.out.println("context-param参数password的值是：" + password);
        System.out.println("context-param参数ip的值是：" + ip);

        System.out.println("当前工程路径：" + context.getContextPath());

        System.out.println("工程部署的路径是：" + context.getRealPath("/"));
        System.out.println("工程下css目录的绝对路径是：" + context.getRealPath("/css"));
        System.out.println("工程下imgs目录下的0.jpg绝对路径是：" + context.getRealPath("/imgs/0.jpg"));
    }
}
