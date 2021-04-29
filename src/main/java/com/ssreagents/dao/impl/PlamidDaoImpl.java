package com.ssreagents.dao.impl;

import com.ssreagents.dao.PlamidDao;
import com.ssreagents.pojo.Plamid;

public class PlamidDaoImpl extends BaseDao implements PlamidDao {
    @Override
    public int savePlamidExtend(Plamid plamid) {
        String sql = "insert into t_plasmid_extend(uid,application,application_object_atrain,bio_organization,application_way" +
                ",volume,infection_time,is_achieve_goal,cost_performance,overall_evaluation" +
                ",comments,drawings_show,URL,img1,img2" +
                ",img3,img4,img5,createdate,recorderemail)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return upadate(sql,plamid.getUid(),plamid.getApplication(),plamid.getApplicationObjectAtrain(),plamid.getBioOrganization(),plamid.getApplicationWay(),
                plamid.getVolume(),plamid.getInfectionTime(),plamid.getIsAchieveGoal(),plamid.getCostPerformance(),plamid.getOverallEvaluation(),
                plamid.getComments(),plamid.getDrawingsShow(),plamid.getUrl(),plamid.getImg1(),plamid.getImg2(),
                plamid.getImg3(),plamid.getImg4(),plamid.getImg5(),plamid.getCreatedate(),plamid.getRecorderemail());
    }

    @Override
    public int savePlamidBasic(Plamid plamid) {
        String sql = "insert into t_plasmid_basic(uid,kind,brand,product_name,goods_num" +
                ",batch_num,specifications,price,goods_time,period_validity" +
                ",parasitifer,useapplication,Fragment_type,fragment_species" +
                ",promoter,replicor,plasmid_profile,plasmid_maintenance_sequencecomment,ori_nuclear_resistancecomment" +
                ",selection_marker,fluorescent_mark,regenerating_strain,condition_culture,sequencing_primer5" +
                ",sequencing_primer3,literature_used,related_products)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return upadate(sql,plamid.getUid(),plamid.getKind(),plamid.getBrand(),plamid.getProductName(),plamid.getGoodsNum(),
                plamid.getBatchNum(),plamid.getSpecifications(),plamid.getPrice(),plamid.getGoodsNum(),plamid.getPeriodValidity(),
                plamid.getParasitifer(),plamid.getUseapplication(),plamid.getFragmentType(),plamid.getFragmentSpecies(),
                plamid.getPromoter(),plamid.getReplicor(),plamid.getPlasmidProfile(),plamid.getPlasmidMaintenanceSequencecomment(),plamid.getOriNuclearResistancecomment(),
                plamid.getSelectionMarker(),plamid.getFluorescentMark(),plamid.getRegeneratingStrain(),plamid.getConditionCulture(),plamid.getSequencingPrimer5(),
                plamid.getSequencingPrimer3(),plamid.getLiteratureUsed(),plamid.getRelatedProducts());
    }
}
