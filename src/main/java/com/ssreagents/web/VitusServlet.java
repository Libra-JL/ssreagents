package com.ssreagents.web;

import com.ssreagents.pojo.Vitus;
import com.ssreagents.service.UserService;
import com.ssreagents.service.VitusService;
import com.ssreagents.service.impl.UserServiceImpl;
import com.ssreagents.service.impl.VitusServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class VitusServlet extends HttpServlet {

    private VitusService vs = new VitusServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String brand = request.getParameter("brand");
        String product_name = request.getParameter("product_name");
        String goods_num = request.getParameter("goods_num");
        String batch_num = request.getParameter("batch_num");
        String specifications = request.getParameter("specifications");
        String price = request.getParameter("price");
        String goods_time = request.getParameter("goods_time");
        String period_validity = request.getParameter("period_validity");
        String seroytpe = request.getParameter("seroytpe");
        String promoter = request.getParameter("promoter");
        String element = request.getParameter("element");
        String fluorescent = request.getParameter("fluorescent");
        String genetic_code = request.getParameter("genetic_code");
        String gene_name = request.getParameter("gene_name");
        String gene_size = request.getParameter("gene_size");
        String resistance_gene = request.getParameter("resistance_gene");
        String qpcr = request.getParameter("qpcr");
        String silver_stain = request.getParameter("silver_stain");
        String literature_used = request.getParameter("literature_used");
        String application = request.getParameter("application");
        String application_object_atrain = request.getParameter("application_object_atrain");
        String bio_organization = request.getParameter("bio_organization");
        String application_way = request.getParameter("application_way");
        String volume = request.getParameter("volume");
        String infection_time = request.getParameter("infection_time");
        String is_achieve_goal = request.getParameter("is_achieve_goal");
        String cost_performance = request.getParameter("cost_performance");
        String overall_evaluation = request.getParameter("overall_evaluation");
        String comments = request.getParameter("comments");
        String drawings_show = request.getParameter("drawings_show");
        String url = request.getParameter("URL");
        String img = request.getParameter("img");


        vs.saveVitus(new Vitus(null,username,brand,product_name,goods_num,batch_num,specifications,price,goods_time,
                period_validity,seroytpe,promoter,element,fluorescent,genetic_code,gene_name,gene_size,resistance_gene,
                qpcr,silver_stain,literature_used,application,application_object_atrain,bio_organization,application_way,
                volume,infection_time,is_achieve_goal,cost_performance,overall_evaluation,comments,drawings_show,url,img));

        request.getRequestDispatcher("").forward(request,response);

    }


}
