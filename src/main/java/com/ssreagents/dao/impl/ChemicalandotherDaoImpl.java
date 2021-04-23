package com.ssreagents.dao.impl;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import com.mysql.jdbc.UpdatableResultSet;
import com.ssreagents.dao.ChemicalandotherDao;
import com.ssreagents.pojo.Chemicalandother;

public class ChemicalandotherDaoImpl extends BaseDao implements ChemicalandotherDao {
    @Override
    public int saveChemicalandotherExtend(Chemicalandother chemicalandother) {
        String sql = "insert into t_chemicalandother_basic(uid,kind,brand,product_name," +
                "goods_num,batch_num,specifications,form," +
                " purity,price,InChI,InChI_key, " +
                "storage,move_temp,mol_wt,feed_ratio, " +
                "related_products,degradation_time,goods_time,period_validity,literature_used)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return upadate(sql, chemicalandother.getUid(), chemicalandother.getKind(),chemicalandother.getBrand(),chemicalandother.getProductName(),
                chemicalandother.getGoodsNum(),chemicalandother.getBatchNum(),chemicalandother.getSpecifications(), chemicalandother.getForm(),
                chemicalandother.getPurity(),chemicalandother.getPrice(),chemicalandother.getInChI(),chemicalandother.getInChIKey(),
                chemicalandother.getStorage(),chemicalandother.getMoveTemp(),chemicalandother.getMolWt(),chemicalandother.getFeedRatio(),
                chemicalandother.getRelatedProducts(),chemicalandother.getDegradationTime(),chemicalandother.getGoodsTime(),chemicalandother.getPeriodValidity(),chemicalandother.getLiteratureUsed());


    }

    @Override
    public int saveChemicalandotherBasic(Chemicalandother chemicalandother) {
        String sql = "insert into t_chemicalandother_extend(uid,application,application_object_atrain,bio_organization,testing_time," +
                "is_achieve_goal,cost_performance,overall_evaluation,comments," +
                "drawings_show,URL,img1,img2," +
                "img3,img4,img5,createdate,recorderemail)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        return upadate(sql,chemicalandother.getUid(),chemicalandother.getApplication(),chemicalandother.getApplicationObjectAtrain(),chemicalandother.getBioOrganization(),chemicalandother.getTestingTime(),
                chemicalandother.getIsAchieveGoal(),chemicalandother.getCostPerformance(),chemicalandother.getOverallEvaluation(),chemicalandother.getComments(),
                chemicalandother.getDrawingsShow(),chemicalandother.getUrl(),chemicalandother.getImg1(),chemicalandother.getImg2(),
                chemicalandother.getImg3(),chemicalandother.getImg4(),chemicalandother.getImg5(),chemicalandother.getCreatedate(),chemicalandother.getRecorderemail());


    }
}
