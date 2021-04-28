package com.ssreagents.web;

import com.ssreagents.pojo.Chemicalandother;
import com.ssreagents.pojo.ProteinsPeptides;
import com.ssreagents.service.ChemicalandotherService;
import com.ssreagents.service.ProteinsPeptidesService;
import com.ssreagents.service.impl.ChemicalandotherServiceImpl;
import com.ssreagents.service.impl.ProteinsPeptidesServiceImpl;
import com.ssreagents.utils.UUIDGenerator;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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

@WebServlet(name = "ProteinsPeptidesServlet")
public class ProteinsPeptidesServlet extends HttpServlet {

    private ProteinsPeptidesService pps = new ProteinsPeptidesServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        ProteinsPeptides proteinsPeptides = new ProteinsPeptides();
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
                        System.out.println("=================" + fileItem.getName());
                        if (fileItem.getName() != "") {
                            String sufix = fileItem.getName().substring(fileItem.getName().lastIndexOf("."));
                            String rename = UUIDGenerator.getUUID();
                            String imgName = fileItem.getFieldName() + "" + (++imgflag);
                            System.out.println(imgName);
                            kv.put(imgName, "F:\\antibody\\" + rename + sufix);
                            fileItem.write(new File("F:\\antibody\\" + rename + sufix));
                        }

                    }
                }


            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        //id字段自增
        String uid = UUIDGenerator.getUUID();
        proteinsPeptides.setUid(uid);
        proteinsPeptides.setKind(kv.get("kind"));
        proteinsPeptides.setBrand(kv.get("brand"));
        proteinsPeptides.setProductName(kv.get("product_name"));
        proteinsPeptides.setGoodsNum(kv.get("goods_num"));
        proteinsPeptides.setBatchNum(kv.get("batch_num"));
        proteinsPeptides.setSpecifications(kv.get("specifications"));
        proteinsPeptides.setProductType(kv.get("producttype"));
        proteinsPeptides.setProteinTargets(kv.get("Protein_targets"));
        proteinsPeptides.setPurity(kv.get("purity"));
        proteinsPeptides.setPrice(kv.get("price"));
        proteinsPeptides.setGoodsTime(kv.get("goods_time"));
        proteinsPeptides.setPeriodValidity(kv.get("period_validity"));
        proteinsPeptides.setForm(kv.get("form"));
        proteinsPeptides.setSpecies(kv.get("Species"));
        proteinsPeptides.setStorage(kv.get("storage"));
        proteinsPeptides.setConcentration(kv.get("concentration"));
        proteinsPeptides.setStorageSolution(kv.get("Storage_solution"));
        proteinsPeptides.setLiteratureUsed(kv.get("literature_used"));
        proteinsPeptides.setRelatedProducts(kv.get("related_products"));

        proteinsPeptides.setApplication(kv.get("application"));
        proteinsPeptides.setApplicationObjectAtrain(kv.get("application_object_atrain"));
        proteinsPeptides.setBioOrganization(kv.get("bio_organization"));
        proteinsPeptides.setApplicationWay(kv.get("application_way"));
        proteinsPeptides.setVolume(kv.get("volume"));
        proteinsPeptides.setWorkingConcentration(kv.get("working_concentration"));
        proteinsPeptides.setIsAchieveGoal(kv.get("is_achieve_goal"));
        proteinsPeptides.setCostPerformance(kv.get("cost_performance"));
        proteinsPeptides.setOverallEvaluation(kv.get("overall_evaluation"));
        proteinsPeptides.setComments(kv.get("comments"));
        proteinsPeptides.setDrawingsShow(kv.get("drawings_show"));
        proteinsPeptides.setUrl(kv.get("URL"));
        if (kv.get("img1") == null) {
            proteinsPeptides.setImg1(null);
        } else {
            proteinsPeptides.setImg1(kv.get("img1"));
        }

        if (kv.get("img2") == null) {
            proteinsPeptides.setImg2(null);
        } else {
            proteinsPeptides.setImg2(kv.get("img2"));
        }

        if (kv.get("img3") == null) {
            proteinsPeptides.setImg3(null);
        } else {
            proteinsPeptides.setImg3(kv.get("img3"));
        }

        if (kv.get("img4") == null) {
            proteinsPeptides.setImg4(null);
        } else {
            proteinsPeptides.setImg4(kv.get("img4"));
        }

        if (kv.get("img5") == null) {
            proteinsPeptides.setImg5(null);
        } else {
            proteinsPeptides.setImg5(kv.get("img5"));
        }

        String email = request.getSession().getAttribute("email").toString();
        proteinsPeptides.setRecorderemail(email);


        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        proteinsPeptides.setCreatedate(timestamp);


        System.out.println(proteinsPeptides.toString());



        pps.saveProteinsPeptidesBasic(proteinsPeptides);

        pps.saveProteinsPeptidesExtend(proteinsPeptides);

        request.getRequestDispatcher("/pages/major/SuccessSubmit.html").forward(request, response);
    }

}
