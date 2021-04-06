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
import java.util.UUID;

/**
 * @author Libra
 */
public class LoginServlet extends HttpServlet {

    private UserService us = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");


        String email = request.getParameter("email");
        String password = request.getParameter("password");




        if (us.login(new User(null, null, password, email, null, null, null, null, null, null)) != null) {
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            request.getRequestDispatcher("/pages/major/index.html").forward(request, response);
        } else {
            request.getRequestDispatcher("/pages/user/login.html").forward(request, response);
        }

    }

}
