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
        String phone_num = req.getParameter("phone_num");
        String school = req.getParameter("school");
        String college = req.getParameter("college");
        String identity = req.getParameter("identity");
        String pi_name = req.getParameter("pi_name");
        String student_name = req.getParameter("student_name");



        if (us.existsEmail(email)) {
            System.out.println("用户名【" + email + "】已存在");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
        } else {
            us.registUser(new User(null, username, password, email,phone_num,school,college,identity,pi_name,student_name));
            req.getRequestDispatcher("/pages/major/index.html").forward(req, resp);

        }


    }
}
