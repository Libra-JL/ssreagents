package com.ssreagents.dao.impl;

import com.ssreagents.dao.ProteinsPeptidesDao;
import com.ssreagents.pojo.ProteinsPeptides;

public class ProteinsPeptidesDaoImpl extends BaseDao implements ProteinsPeptidesDao {
    @Override
    public int saveProteinsPeptidesExtend(ProteinsPeptides proteinsPeptides) {
        String sql = "insert into t_proteins_peptides_extend(uid,application,application_object_atrain,bio_organization,application_way," +
                "volume,working_concentration,is_achieve_goal,cost_performance,overall_evaluation," +
                "comments ,drawings_show,URL,img1,img2," +
                "img3,img4,img5,createdate,recorderemail)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return upadate(sql,proteinsPeptides.getUid(),proteinsPeptides.getApplication(),proteinsPeptides.getApplicationObjectAtrain(),proteinsPeptides.getBioOrganization(),proteinsPeptides.getApplicationWay(),
                proteinsPeptides.getVolume(),proteinsPeptides.getWorkingConcentration(),proteinsPeptides.getIsAchieveGoal(),proteinsPeptides.getCostPerformance(),proteinsPeptides.getOverallEvaluation(),
                proteinsPeptides.getComments(),proteinsPeptides.getDrawingsShow(),proteinsPeptides.getUrl(),proteinsPeptides.getImg1(),proteinsPeptides.getImg2(),
                proteinsPeptides.getImg3(),proteinsPeptides.getImg4(),proteinsPeptides.getImg5(),proteinsPeptides.getCreatedate(),proteinsPeptides.getRecorderemail());
    }

    @Override
    public int saveProteinsPeptidesBasic(ProteinsPeptides proteinsPeptides) {
        String sql = "insert into t_proteins_peptides_basic(uid,kind,brand,product_name,goods_num" +
                ",batch_num,specifications,product_type,Protein_targets,purity" +
                ",price,goods_time,period_validity,form,Species" +
                ",storage,concentration,Storage_solution,literature_used,related_products)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return upadate(sql,proteinsPeptides.getUid(),proteinsPeptides.getKind(),proteinsPeptides.getBrand(),proteinsPeptides.getProductName(),proteinsPeptides.getGoodsNum(),
                proteinsPeptides.getBatchNum(),proteinsPeptides.getSpecifications(),proteinsPeptides.getProductType(),proteinsPeptides.getProteinTargets(),proteinsPeptides.getPurity(),
                proteinsPeptides.getPrice(),proteinsPeptides.getGoodsTime(),proteinsPeptides.getPeriodValidity(),proteinsPeptides.getForm(),proteinsPeptides.getSpecies(),
                proteinsPeptides.getStorage(),proteinsPeptides.getConcentration(),proteinsPeptides.getStorageSolution(),proteinsPeptides.getLiteratureUsed(),proteinsPeptides.getRelatedProducts());
    }
}
