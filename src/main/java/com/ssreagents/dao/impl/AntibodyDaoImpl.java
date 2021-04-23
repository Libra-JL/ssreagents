package com.ssreagents.dao.impl;

import com.ssreagents.dao.AntibodyDao;
import com.ssreagents.pojo.Antibody;

public class AntibodyDaoImpl  extends BaseDao implements AntibodyDao{
    @Override
    public int saveAntibodyExtend(Antibody antibody) {

        String sql = "insert into t_antibody_basic(uid,brand,kind,product_name,goods_num," +
                "batch_num,specifications,concentration,price,parasitifer," +
                "cloned,Protein_targets,applied_range,conjugate,goods_time," +
                "period_validity,Clone_number,Species_reactivity,literatur,related_products," +
                "immunogen,form,storage ,Storage_solution)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        return upadate(sql,antibody.getUid(),antibody.getBrand(),antibody.getKind(),antibody.getGoodsNum(),
                antibody.getBatchNum(),antibody.getSpecifications(),antibody.getConcentration(),antibody.getPrice(),antibody.getParasitifer(),
                antibody.getCloned(),antibody.getProteinTargets(),antibody.getAppliedRange(),antibody.getConjugate(),antibody.getGoodsTime(),
                antibody.getPeriodValidity(),antibody.getCloneNumber(),antibody.getSpeciesReactivity(),antibody.getRelatedProducts(),
                antibody.getImmunogen(),antibody.getForm(),antibody.getStorage(),antibody.getStorageSolution());
    }

    @Override
    public int saveAntibodyBasic(Antibody antibody) {
        String sql = "insert into t_antibody_extend(application,working_concentration,application_object_atrain,bio_organization," +
                "is_achieve_goal,cost_performance,overall_evaluation,comments," +
                "drawings_show,URL,img1,img2," +
                "img3,img4,img5,createdate,recorderemail)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return upadate(sql,antibody.getApplication(),antibody.getWorkingConcentration(),antibody.getApplicationObjectAtrain(),antibody.getBioOrganization(),
                antibody.getIsAchieveGoal(),antibody.getCostPerformance(),antibody.getOverallEvaluation(),antibody.getComments(),
                antibody.getDrawingsShow(),antibody.getUrl(),antibody.getImg1(),antibody.getImg2(),
                antibody.getImg3(),antibody.getImg4(),antibody.getImg5(),antibody.getCreatedate(),antibody.getRecorderemail());
    }
}
