package com.ssreagents.web;

import com.google.gson.Gson;
import com.ssreagents.pojo.Vitus;
import com.ssreagents.service.UniqueService;
import com.ssreagents.service.impl.UniqueServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Source;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/unique")
public class UniqueAjaxServlet extends HttpServlet {

    private Vitus vitus = new Vitus();
    private UniqueService us = new UniqueServiceImpl();


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        String brand = request.getParameter("brand");
        String goods_num = request.getParameter("goods_num");
        String batch_num = request.getParameter("batch_num");

        vitus.setBrand(brand);
        vitus.setGoods_num(goods_num);
        vitus.setBatch_num(batch_num);

        Vitus vitus = us.searchProductbyAttr(this.vitus);

        Gson gson = new Gson();

        String jsonStr = gson.toJson(vitus);
        System.out.println(jsonStr);

        response.getWriter().write(jsonStr);

    }




}
