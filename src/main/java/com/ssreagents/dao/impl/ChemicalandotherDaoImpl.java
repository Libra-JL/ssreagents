package com.ssreagents.dao.impl;

import com.ssreagents.dao.ChemicalandotherDao;
import com.ssreagents.pojo.Chemicalandother;

public class ChemicalandotherDaoImpl extends BaseDao implements ChemicalandotherDao {
    @Override
    public int saveAntibodyExtend(Chemicalandother chemicalandother) {
        String sql ="insert into t_chemicalandother_basic(uid,kind,brand,product_name," +
                "goods_num,batch_num,specifications,form," +
                " purity,price,InChI,InChI_key, " +
                "storage,move_temp,mol_wt,feed_ratio, " +
                "related_products,degradation_time,goods_time,period_validity,literature_used)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";



    }

    @Override
    public int saveAntibodyBasic(Chemicalandother chemicalandother) {
        String sql ="insert into t_chemicalandother_extend()values(application,application_object_atrain,bio_organization,testing_time," +
                "is_achieve_goal,cost_performance,overall_evaluation,comments," +
                "drawings_show,URL,img1,img2," +
                "img3,img4,img5,createdate,recorderemail)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";



    }
}
