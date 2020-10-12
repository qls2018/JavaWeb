package com.atguigu.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther qq
 * @creat 2020-08-12-10:38
 */
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("在柜台1中查看材料：" + username);


        //盖章并传递到柜台2
        req.setAttribute("key","柜台1的章");

        //问路
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/form.html");

        requestDispatcher.forward(req,resp);



    }
}
