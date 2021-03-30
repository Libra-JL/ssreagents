package com.ssreagents.web;

import com.ssreagents.pojo.User;
import com.ssreagents.service.UserService;
import com.ssreagents.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {
    private UserService us = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");


        System.out.println("============================");
        if (us.existsUsername(username)) {
            System.out.println("用户名【" + username + "】已存在");
            req.getRequestDispatcher("/ssreagents_war_exploded/pages/user/regist.html").forward(req, resp);
        } else {
            us.registUser(new User(null, username, password, email));
            req.getRequestDispatcher("/ssreagents_war_exploded/pages/user/regist_success.html");
        }


    }
}
