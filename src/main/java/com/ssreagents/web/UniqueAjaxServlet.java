package com.ssreagents.web;

import com.ssreagents.dao.impl.BaseDao;
import com.ssreagents.utils.JdbcUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

public class UniqueAjaxServlet extends HttpServlet {

    protected void vitusBasicUnique(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //��ȡ����
        String brand = request.getParameter("brand");
        String product_name = request.getParameter("product_name");
        String goods_num = request.getParameter("goods_num");
        //���ݿ��ѯ
        Connection connection = JdbcUtils.getConnection();
        String sql = "select "
        connection.prepareStatement()
        //������ڷ������ݸ�ǰ��

        //��������������κδ���

    }




}
