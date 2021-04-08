package com.ssreagents.web;

import com.ssreagents.pojo.Vitus;
import com.ssreagents.service.VitusService;
import com.ssreagents.service.impl.VitusServiceImpl;
import com.ssreagents.utils.UUIDGenerator;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VitusServlet extends HttpServlet {

    private VitusService vs = new VitusServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        Vitus vitus = new Vitus();
        Map<String, String> kv = new HashMap<>();
        int imgflag = 0;

        if (ServletFileUpload.isMultipartContent(request)) {

            DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
            ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);

            try {
                List<FileItem> fileItems = servletFileUpload.parseRequest(request);

                for (FileItem fileItem : fileItems) {
                    if (fileItem.isFormField()) {
                        //普通表单项
                        kv.put(fileItem.getFieldName(), fileItem.getString("GBK"));
                    } else {
                        //上传文件到指定文件夹并改名
                        //文件表单并获取存放路径
                        System.out.println("================="+fileItem.getName());
                        if (fileItem.getName()!=""){
                            String sufix = fileItem.getName().substring(fileItem.getName().lastIndexOf("."));
                            String rename = UUIDGenerator.getUUID();
                            String imgName = fileItem.getFieldName() + "" + (++imgflag);
                            System.out.println(imgName);
                            kv.put(imgName, "F:\\vitus\\" + rename + sufix);
                            fileItem.write(new File("F:\\vitus\\" + rename + sufix));
                        }

                    }
                }


            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        //id字段自增
        String uid = UUIDGenerator.getUUID();
        vitus.setUid(uid);
        vitus.setBrand(kv.get("brand"));
        vitus.setProduct_name(kv.get("product_name"));
        vitus.setGoods_num(kv.get("goods_num"));
        vitus.setBatch_num(kv.get("batch_num"));
        vitus.setSpecifications(kv.get("specifications"));
        vitus.setPrice(kv.get("price"));
        vitus.setGoods_time(kv.get("goods_time"));
        vitus.setPeriod_validity(kv.get("period_validity"));
        vitus.setSeroytpe(kv.get("seroytpe"));
        vitus.setPromoter(kv.get("promoter"));
        vitus.setElement(kv.get("element"));
        vitus.setFluorescent(kv.get("fluorescent"));
        vitus.setGenetic_code(kv.get("genetic_code"));
        vitus.setGene_name(kv.get("gene_name"));
        vitus.setGene_size(kv.get("gene_size"));
        vitus.setResistance_gene(kv.get("resistance_gene"));
        vitus.setStorage(kv.get("storage"));
        vitus.setQpcr(kv.get("qpcr"));
        vitus.setSilver_stain(kv.get("silver_stain"));
        vitus.setLiterature_used(kv.get("literature_used"));

        vitus.setApplication(kv.get("application"));
        vitus.setApplication_object_atrain(kv.get("application_object_atrain"));
        vitus.setBio_organization(kv.get("bio_organization"));
        vitus.setApplication_way(kv.get("application_way"));
        vitus.setVolume(kv.get("volume"));
        vitus.setInfection_time(kv.get("infection_time"));
        vitus.setIs_achieve_goal(kv.get("is_achieve_goal"));
        vitus.setCost_performance(kv.get("cost_performance"));
        vitus.setOverall_evaluation(kv.get("overall_evaluation"));
        vitus.setComments(kv.get("comments"));
        vitus.setDrawings_show(kv.get("drawings_show"));
        vitus.setURL(kv.get("URL"));
        if (kv.get("img1") == null) {
            vitus.setImg1(null);
        } else {
            vitus.setImg1(kv.get("img1"));
        }

        if (kv.get("img2") == null) {
            vitus.setImg2(null);
        } else {
            vitus.setImg2(kv.get("img2"));
        }

        if (kv.get("img3") == null) {
            vitus.setImg3(null);
        } else {
            vitus.setImg3(kv.get("img3"));
        }

        if (kv.get("img4") == null) {
            vitus.setImg4(null);
        } else {
            vitus.setImg4(kv.get("img4"));
        }

        if (kv.get("img5") == null) {
            vitus.setImg5(null);
        } else {
            vitus.setImg5(kv.get("img5"));
        }

        String email = request.getSession().getAttribute("email").toString();
        vitus.setRecorderemail(email);


        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        vitus.setCreatedate(timestamp);


        System.out.println(vitus.toString());


        vs.saveVitusBasic(vitus);
        vs.saveVitusExtend(vitus);

        request.getRequestDispatcher("/pages/major/SuccessSubmit.html").forward(request, response);

    }


}
