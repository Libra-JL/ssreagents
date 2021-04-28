package com.ssreagents.web;

import com.ssreagents.pojo.Chemicalandother;
import com.ssreagents.pojo.Plamid;
import com.ssreagents.service.PlamidService;
import com.ssreagents.service.impl.PlamidServiceImpl;
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

@WebServlet(name = "PlamidServlet")
public class PlamidServlet extends HttpServlet {
    private PlamidService ps = new PlamidServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        Plamid plamid = new Plamid();
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
        plamid.setUid(uid);
        plamid.setKind(kv.get("kind"));
        plamid.setBrand(kv.get("brand"));
        plamid.setProductName(kv.get("product_name"));
        plamid.setGoodsNum(kv.get("goods_num"));
        plamid.setBatchNum(kv.get("batch_num"));
        plamid.setSpecifications(kv.get("specifications"));
        plamid.setPrice(kv.get("price"));
        plamid.setPeriodValidity(kv.get("period_validity"));
        plamid.setProteinTargets(kv.get("Protein_targets"));
        plamid.setPurity(kv.get("purity"));
        plamid.setParasitifer(kv.get("parasitifer"));
        plamid.setUseapplication(kv.get("useapplication"));
        plamid.setFragmentType(kv.get("useapplication"));
        plamid.setPromoter(kv.get("promoter"));
        plamid.setReplicor(kv.get("replicor"));
        plamid.setPlasmidProfile(kv.get("plasmid_profile"));
        plamid.setPlasmidMaintenanceSequencecomment(kv.get("plasmid_maintenance_sequencecomment"));
        plamid.setOriNuclearResistancecomment(kv.get("ori_nuclear_resistancecomment"));
        plamid.setSelectionMarker(kv.get("selection_marker"));
        plamid.setFluorescentMark(kv.get("fluorescent_mark"));
        plamid.setConditionCulture(kv.get("condition_culture"));
        plamid.setSequencingPrimer5(kv.get("sequencing_primer5"));
        plamid.setSequencingPrimer3(kv.get("sequencing_primer3"));
        plamid.setLiteratureUsed(kv.get("literature_used"));
        plamid.setRelatedProducts(kv.get("related_products"));
        plamid.setGoodsTime(kv.get("goods_time"));



        plamid.setApplication(kv.get("application"));
        plamid.setApplicationObjectAtrain(kv.get("application_object_atrain"));
        plamid.setBioOrganization(kv.get("bio_organization"));

        plamid.(kv.get("working_concentration"));

        plamid.setIsAchieveGoal(kv.get("is_achieve_goal"));
        plamid.setCostPerformance(kv.get("cost_performance"));
        plamid.setOverallEvaluation(kv.get("overall_evaluation"));
        plamid.setComments(kv.get("comments"));
        plamid.setDrawingsShow(kv.get("drawings_show"));
        plamid.setUrl(kv.get("URL"));
        if (kv.get("img1") == null) {
            plamid.setImg1(null);
        } else {
            plamid.setImg1(kv.get("img1"));
        }

        if (kv.get("img2") == null) {
            plamid.setImg2(null);
        } else {
            plamid.setImg2(kv.get("img2"));
        }

        if (kv.get("img3") == null) {
            plamid.setImg3(null);
        } else {
            plamid.setImg3(kv.get("img3"));
        }

        if (kv.get("img4") == null) {
            plamid.setImg4(null);
        } else {
            plamid.setImg4(kv.get("img4"));
        }

        if (kv.get("img5") == null) {
            plamid.setImg5(null);
        } else {
            plamid.setImg5(kv.get("img5"));
        }

        String email = request.getSession().getAttribute("email").toString();
        plamid.setRecorderemail(email);


        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        plamid.setCreatedate(timestamp);


        System.out.println(plamid.toString());



        ps.savePlamidBasic(plamid);

        ps.savePlamidExtend(plamid);

        request.getRequestDispatcher("/pages/major/SuccessSubmit.html").forward(request, response);
    }

}
