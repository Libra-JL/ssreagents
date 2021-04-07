package com.ssreagents.web;

import com.ssreagents.pojo.Vitus;
import com.ssreagents.service.UserService;
import com.ssreagents.service.VitusService;
import com.ssreagents.service.impl.UserServiceImpl;
import com.ssreagents.service.impl.VitusServiceImpl;
import com.ssreagents.utils.UUIDGenerator;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VitusServlet extends HttpServlet {

    private VitusService vs = new VitusServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        Vitus vitus = new Vitus();
        List<String> formAttr = new ArrayList<>();

        if (ServletFileUpload.isMultipartContent(request)) {

            DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
            ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);

            try {
                List<FileItem> fileItems = servletFileUpload.parseRequest(request);

                for (FileItem fileItem : fileItems) {
                    if (fileItem.isFormField()) {
                        //普通表单项
                        formAttr.add(fileItem.getString("gbk"));

                    } else {
                        //上传文件到指定文件夹并改名
                        //文件表单并获取存放路径
                        String sufix = fileItem.getName().substring(fileItem.getName().lastIndexOf("."));
                        String rename = UUIDGenerator.getUUID();
                        fileItem.write(new File("F:\\vitus\\"+rename+sufix));
                        formAttr.add("F:\\vitus\\"+rename+sufix);
                    }
                }


            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        //id字段自增
        String uid= UUIDGenerator.getUUID();
        vitus.setUid(uid);
        vitus.setBrand(formAttr.get(0));
        vitus.setProduct_name(formAttr.get(1));
        vitus.setGoods_num(formAttr.get(2));
        vitus.setBatch_num(formAttr.get(0));
        vitus.setSpecifications(formAttr.get(0));
        vitus.setPrice(formAttr.get(0));
        vitus.setGoods_time(formAttr.get(0));
        vitus.setPeriod_validity(formAttr.get(0));
        vitus.setSeroytpe(formAttr.get(0));
        vitus.setPromoter(formAttr.get(0));
        vitus.setFluorescent(formAttr.get(0));
        vitus.setGenetic_code(formAttr.get(0));
        vitus.setGene_name(formAttr.get(0));
        vitus.setGene_size(formAttr.get(0));
        vitus.setResistance_gene(formAttr.get(0));
        vitus.setStorage(formAttr.get(0));
        vitus.setQpcr(formAttr.get(0));
        vitus.setSilver_stain(formAttr.get(0));
        vitus.setLiterature_used(formAttr.get(0));

        vitus.setApplication(formAttr.get(0));
        vitus.setApplication_object_atrain(formAttr.get(0));
        vitus.setBio_organization(formAttr.get(0));
        vitus.setApplication_way(formAttr.get(0));
        vitus.setVolume(formAttr.get(0));
        vitus.setInfection_time(formAttr.get(0));
        vitus.setIs_achieve_goal(formAttr.get(0));
        vitus.setCost_performance(formAttr.get(0));
        vitus.setOverall_evaluation(formAttr.get(0));
        vitus.setComments(formAttr.get(0));
        vitus.setDrawings_show(formAttr.get(0));
        vitus.setURL(formAttr.get(0));
        vitus.setImg(formAttr.get(0));

        vs.saveVitus(vitus);

//        request.getRequestDispatcher("").forward(request, response);

    }


}
