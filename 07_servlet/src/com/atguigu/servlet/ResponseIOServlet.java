package com.atguigu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @auther qq
 * @creat 2020-08-13-09:31
 */
public class ResponseIOServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        System.out.println(resp.getCharacterEncoding());
        //设置服务器字符集为utf-8
//        resp.setCharacterEncoding("utf-8");

//        //通过响应头，设置浏览器也使用字符集为utf-8
//        resp.setHeader("Content-Type","text/html;charset=utf-8");

        //同时设置服务器和客户端都使用utf-8,还设置了响应头。
        //获取流之间设置有效
        resp.setContentType("text/html;charset=utf-8");
        System.out.println(resp.getCharacterEncoding());


        //向客户端回传字符串数据
        PrintWriter writer = resp.getWriter();
//        writer.write("response's content!!!");
        writer.write("我要减肥!!!");
//        writer.println();
    }


}
