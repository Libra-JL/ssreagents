package com.ssreagents.dao.impl;

import com.ssreagents.dao.KitDao;
import com.ssreagents.pojo.Kit;

public class KitDaoImpl extends BaseDao implements KitDao {




    @Override
    public int saveKitExtend(Kit kit) {
        String sql = "insert into t_kit_extend(uid,application,testing_time,testing_way,testing_type," +
                "is_achieve_goal,cost_performance,overall_evaluation,comments," +
                "drawings_show,URL,img1,img2," +
                "img3,img4,img5,createdate,recorderemail)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        return upadate(sql,kit.getUid(),kit.getApplication(),kit.getTestingTime(),kit.getTestingWay(),kit.getTestingType(),
                kit.getIsAchieveGoal(),kit.getCostPerformance(),kit.getOverallEvaluation(),kit.getComments(),
                kit.getDrawingsShow(),kit.getUrl(),kit.getImg1(),kit.getImg2(),
                kit.getImg3(),kit.getImg4(),kit.getImg5(),kit.getCreatedate(),kit.getRecorderemail());


    }

    @Override
    public int saveKitBasic(Kit kit) {
        String sql = "insert into t_kit_basic(uid,kind,brand,product_name,goods_num," +
                "batch_num,specifications,price,Species,goods_time," +
                "period_validity,related_products,sample_type,storage,sensitivity," +
                "rangedata,recovery_rate,accuracy,literature_used)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        return upadate(sql,kit.getUid(),kit.getKind(),kit.getBrand(),kit.getProductName(),kit.getGoodsNum(),
                kit.getBatchNum(),kit.getSpecifications(),kit.getPrice(),kit.getSpecies(),kit.getGoodsTime(),
                kit.getPeriodValidity(),kit.getRelatedProducts(),kit.getSampleType(),kit.getStorage(),kit.getSensitivity(),
                kit.getRangedata(),kit.getRecoveryRate(),kit.getAccuracy(),kit.getLiteratureUsed());
    }
}
