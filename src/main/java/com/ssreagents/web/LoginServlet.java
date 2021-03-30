package com.ssreagents.web;

import com.ssreagents.pojo.User;
import com.ssreagents.service.UserService;
import com.ssreagents.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private UserService us = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (us.login(new User(null, username, password, null)) != null) {
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            request.getRequestDispatcher("").forward(request,response);
        }else {
            request.getRequestDispatcher("").forward(request,response);
        }

    }

}
