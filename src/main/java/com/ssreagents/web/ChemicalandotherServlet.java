package com.ssreagents.web;

import com.ssreagents.pojo.Antibody;
import com.ssreagents.pojo.Chemicalandother;
import com.ssreagents.service.AntibodyService;
import com.ssreagents.service.ChemicalandotherService;
import com.ssreagents.service.impl.AntibodyServiceImpl;
import com.ssreagents.service.impl.ChemicalandotherServiceImpl;
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

@WebServlet(name = "ChemicalandotherServlet")
public class ChemicalandotherServlet extends HttpServlet {

    private ChemicalandotherService cs = new ChemicalandotherServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        Chemicalandother chemicalandother = new Chemicalandother();
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
        chemicalandother.setUid(uid);
        chemicalandother.setKind(kv.get("kind"));
        chemicalandother.setBrand(kv.get("brand"));
        chemicalandother.setProductName(kv.get("product_name"));
        chemicalandother.setGoodsNum(kv.get("goods_num"));
        chemicalandother.setBatchNum(kv.get("batch_num"));
        chemicalandother.setSpecifications(kv.get("specifications"));
        chemicalandother.setForm(kv.get("form"));
        chemicalandother.setPurity(kv.get("purity"));
        chemicalandother.setPrice(kv.get("price"));
        chemicalandother.setInChI(kv.get("InChI"));
        chemicalandother.setInChIKey(kv.get("InChI_key"));
        chemicalandother.setStorage(kv.get("storage"));
        chemicalandother.setMoveTemp(kv.get("move_temp"));
        chemicalandother.setMolWt(kv.get("mol_wt"));
        chemicalandother.setFeedRatio(kv.get("feed_ratio"));
        chemicalandother.setRelatedProducts(kv.get("related_products"));
        chemicalandother.setDegradationTime(kv.get("degradation_time"));
        chemicalandother.setGoodsTime(kv.get("goods_time"));
        chemicalandother.setPeriodValidity(kv.get("period_validity"));
        chemicalandother.setLiteratureUsed(kv.get("literature_used"));


        chemicalandother.setApplication(kv.get("application"));
        chemicalandother.setApplicationObjectAtrain(kv.get("application_object_atrain"));
        chemicalandother.setBioOrganization(kv.get("bio_organization"));

        chemicalandother.setTestingTime(kv.get("testing_time"));

        chemicalandother.setIsAchieveGoal(kv.get("is_achieve_goal"));
        chemicalandother.setCostPerformance(kv.get("cost_performance"));
        chemicalandother.setOverallEvaluation(kv.get("overall_evaluation"));
        chemicalandother.setComments(kv.get("comments"));
        chemicalandother.setDrawingsShow(kv.get("drawings_show"));
        chemicalandother.setUrl(kv.get("URL"));
        if (kv.get("img1") == null) {
            chemicalandother.setImg1(null);
        } else {
            chemicalandother.setImg1(kv.get("img1"));
        }

        if (kv.get("img2") == null) {
            chemicalandother.setImg2(null);
        } else {
            chemicalandother.setImg2(kv.get("img2"));
        }

        if (kv.get("img3") == null) {
            chemicalandother.setImg3(null);
        } else {
            chemicalandother.setImg3(kv.get("img3"));
        }

        if (kv.get("img4") == null) {
            chemicalandother.setImg4(null);
        } else {
            chemicalandother.setImg4(kv.get("img4"));
        }

        if (kv.get("img5") == null) {
            chemicalandother.setImg5(null);
        } else {
            chemicalandother.setImg5(kv.get("img5"));
        }

        String email = request.getSession().getAttribute("email").toString();
        chemicalandother.setRecorderemail(email);


        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        chemicalandother.setCreatedate(timestamp);


        System.out.println(chemicalandother.toString());



        cs.saveChemicalandotherBasic(chemicalandother);

        cs.saveChemicalandotherExtend(chemicalandother);

        request.getRequestDispatcher("/pages/major/SuccessSubmit.html").forward(request, response);
    }

}
