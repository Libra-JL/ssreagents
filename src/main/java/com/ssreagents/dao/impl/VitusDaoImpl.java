package com.ssreagents.dao.impl;

import com.ssreagents.dao.VitusDao;
import com.ssreagents.pojo.Vitus;

public class VitusDaoImpl extends BaseDao implements VitusDao {


    @Override
    public int saveVitusBasic(Vitus vitus) {

        String sqlBasic = "insert into t_vitus_basic(uid,brand,product_name,goods_num,batch_num," +
                "specifications,price,goods_time,period_validity,seroytpe," +
                "promoter,element,fluorescent,genetic_code,gene_name," +
                "gene_size,resistance_gene,storage,qpcr,silver_stain," +
                "literature_used)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        return upadate(sqlBasic, vitus.getUid(), vitus.getBrand(), vitus.getProduct_name(), vitus.getGoods_num(), vitus.getBatch_num(),
                vitus.getSpecifications(), vitus.getPrice(), vitus.getGoods_time(), vitus.getPeriod_validity(), vitus.getSeroytpe(),
                vitus.getPromoter(), vitus.getElement(), vitus.getFluorescent(), vitus.getGenetic_code(), vitus.getGene_name(),
                vitus.getGene_size(), vitus.getResistance_gene(), vitus.getStorage(), vitus.getQpcr(), vitus.getSilver_stain(),
                vitus.getLiterature_used());

    }

    @Override
    public int saveVitusExtend(Vitus vitus) {
        String sqlExtend = "insert into t_vitus_extend(uid,application,application_object_atrain,bio_organization,application_way," +
                "volume,infection_time,is_achieve_goal,cost_performance,overall_evaluation," +
                "comments ,drawings_show,URL,img1,img2," +
                "img3,img4,img5,createdate,recorderemail) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";


        return upadate(sqlExtend, vitus.getUid(), vitus.getApplication(), vitus.getApplication_object_atrain(), vitus.getBio_organization(), vitus.getApplication_way(),
                vitus.getVolume(),vitus.getInfection_time(), vitus.getIs_achieve_goal(), vitus.getCost_performance(), vitus.getOverall_evaluation(),
                vitus.getComments(),vitus.getDrawings_show(), vitus.getURL(), vitus.getImg1(), vitus.getImg2(),
                vitus.getImg3(), vitus.getImg4(), vitus.getImg5(),vitus.getCreatedate(), vitus.getRecorderemail());

    }
}
