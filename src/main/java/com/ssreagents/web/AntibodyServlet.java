package com.ssreagents.web;

import com.ssreagents.pojo.Antibody;
import com.ssreagents.pojo.Vitus;
import com.ssreagents.service.AntibodyService;
import com.ssreagents.service.impl.AntibodyServiceImpl;
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


public class AntibodyServlet extends HttpServlet {

    private AntibodyService as = new AntibodyServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        Antibody antibody = new Antibody();
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
        antibody.setUid(uid);
        antibody.setBrand(kv.get("brand"));
        antibody.setKind(kv.get("kind"));
        antibody.setProductName(kv.get("product_name"));
        antibody.setGoodsNum(kv.get("goods_num"));
        antibody.setBatchNum(kv.get("batch_num"));
        antibody.setSpecifications(kv.get("specifications"));
        antibody.setConcentration(kv.get("concentration"));
        antibody.setPrice(kv.get("price"));
        antibody.setParasitifer(kv.get("parasitifer"));
        antibody.setCloned(kv.get("cloned"));
        antibody.setProteinTargets(kv.get("Protein_targets"));
        antibody.setAppliedRange(kv.get("applied_range"));
        antibody.setConjugate(kv.get("conjugate"));
        antibody.setGoodsTime(kv.get("goods_time"));
        antibody.setPeriodValidity(kv.get("period_validity"));
        antibody.setCloneNumber(kv.get("Clone_number"));
        antibody.setSpeciesReactivity(kv.get("Species_reactivity"));
        antibody.setLiteratureUsed(kv.get("literature_used"));
        antibody.setRelatedProducts(kv.get("related_products"));
        antibody.setImmunogen(kv.get("immunogen"));
        antibody.setForm(kv.get("form"));
        antibody.setStorage(kv.get("storage"));
        antibody.setStorageSolution(kv.get("Storage_solution"));

        antibody.setApplication(kv.get("application"));
        antibody.setApplicationObjectAtrain(kv.get("application_object_atrain"));
        antibody.setBioOrganization(kv.get("bio_organization"));
        antibody.setApplication(kv.get("application"));
        antibody.setIsAchieveGoal(kv.get("is_achieve_goal"));
        antibody.setCostPerformance(kv.get("cost_performance"));
        antibody.setOverallEvaluation(kv.get("overall_evaluation"));
        antibody.setComments(kv.get("comments"));
        antibody.setDrawingsShow(kv.get("drawings_show"));
        antibody.setUrl(kv.get("URL"));
        if (kv.get("img1") == null) {
            antibody.setImg1(null);
        } else {
            antibody.setImg1(kv.get("img1"));
        }

        if (kv.get("img2") == null) {
            antibody.setImg2(null);
        } else {
            antibody.setImg2(kv.get("img2"));
        }

        if (kv.get("img3") == null) {
            antibody.setImg3(null);
        } else {
            antibody.setImg3(kv.get("img3"));
        }

        if (kv.get("img4") == null) {
            antibody.setImg4(null);
        } else {
            antibody.setImg4(kv.get("img4"));
        }

        if (kv.get("img5") == null) {
            antibody.setImg5(null);
        } else {
            antibody.setImg5(kv.get("img5"));
        }

        String email = request.getSession().getAttribute("email").toString();
        antibody.setRecorderemail(email);


        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        antibody.setCreatedate(timestamp);


        System.out.println(antibody.toString());


        /**
         * 如果ajax中设置的标志存在为true
         *         vs.saveVitusExtend(vitus);
         * 为false
         *         vs.saveVitusBasic(vitus);
         *         vs.saveVitusExtend(vitus);
         */

        as.saveAntibodyBasic(antibody);

        as.saveAntibodyExtend(antibody);

        request.getRequestDispatcher("/pages/major/SuccessSubmit.html").forward(request, response);
    }

}
