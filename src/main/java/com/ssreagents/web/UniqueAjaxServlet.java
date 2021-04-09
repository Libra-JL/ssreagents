package com.ssreagents.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Source;
import java.io.IOException;
@WebServlet("/unique")
public class UniqueAjaxServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String brand = request.getParameter("brand");
        System.out.println(brand);

//        //获取参数
//        String brand = request.getParameter("brand");
//        String product_name = request.getParameter("product_name");
//        String goods_num = request.getParameter("goods_num");
//        //数据库查询
//        Connection connection = JdbcUtils.getConnection();
////        String sql = "select "
////        connection.prepareStatement()
//        //如果存在返回数据给前端
//
//        //如果不存在则不做任何处理

    }




}
