package com.ssreagents.web;

import com.ssreagents.pojo.Chemicalandother;
import com.ssreagents.pojo.Kit;
import com.ssreagents.service.KitService;
import com.ssreagents.service.impl.KitServiceImpl;
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

@WebServlet(name = "KitServlet")
public class KitServlet extends HttpServlet {

    private KitService ks = new KitServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        Kit kit = new Kit();
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
        kit.setUid(uid);
        kit.setKind(kv.get("kind"));
        kit.setBrand(kv.get("brand"));
        kit.setProductName(kv.get("product_name"));
        kit.setGoodsNum(kv.get("goods_num"));
        kit.setBatchNum(kv.get("batch_num"));
        kit.setSpecifications(kv.get("specifications"));
        kit.setPrice(kv.get("price"));
        kit.setSpecies(kv.get("Species"));
        kit.setGoodsTime(kv.get("goods_time"));
        kit.setPeriodValidity(kv.get("period_validity"));
        kit.setRelatedProducts(kv.get("related_products"));
        kit.setSampleType(kv.get("sample_type"));
        kit.setStorage(kv.get("storage"));
        kit.setSensitivity(kv.get("sensitivity"));
        kit.setRangedata(kv.get("rangedata"));
        kit.setRecoveryRate(kv.get("recovery_rate"));
        kit.setAccuracy(kv.get("accuracy"));
        kit.setLiteratureUsed(kv.get("literature_used"));


        kit.setApplication(kv.get("application"));
        kit.setTestingTime(kv.get("testing_time"));
        kit.setTestingWay(kv.get("testing_way"));
        kit.setTestingType(kv.get("testing_type"));
        kit.setIsAchieveGoal(kv.get("is_achieve_goal"));
        kit.setCostPerformance(kv.get("cost_performance"));
        kit.setOverallEvaluation(kv.get("overall_evaluation"));
        kit.setComments(kv.get("comments"));
        kit.setDrawingsShow(kv.get("drawings_show"));
        kit.setUrl(kv.get("URL"));
        if (kv.get("img1") == null) {
            kit.setImg1(null);
        } else {
            kit.setImg1(kv.get("img1"));
        }

        if (kv.get("img2") == null) {
            kit.setImg2(null);
        } else {
            kit.setImg2(kv.get("img2"));
        }

        if (kv.get("img3") == null) {
            kit.setImg3(null);
        } else {
            kit.setImg3(kv.get("img3"));
        }

        if (kv.get("img4") == null) {
            kit.setImg4(null);
        } else {
            kit.setImg4(kv.get("img4"));
        }

        if (kv.get("img5") == null) {
            kit.setImg5(null);
        } else {
            kit.setImg5(kv.get("img5"));
        }

        String email = request.getSession().getAttribute("email").toString();
        kit.setRecorderemail(email);


        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        kit.setCreatedate(timestamp);


        System.out.println(kit.toString());



        ks.saveKitBasic(kit);

        ks.saveKitExtend(kit);

        request.getRequestDispatcher("/pages/major/SuccessSubmit.html").forward(request, response);
    }


}
