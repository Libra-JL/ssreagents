package com.ssreagents.dao.impl;

import com.ssreagents.dao.UniqueDao;
import com.ssreagents.pojo.Vitus;

public class UniqueDaoImpl extends BaseDao implements UniqueDao {

    @Override
    public Vitus searchProductbyAttr(Vitus vitus) {
        String sql = "select * from t_vitus_basic where brand=? and goods_num=? and batch_num=?";
        return queryForOne(Vitus.class, sql, vitus.getBrand(), vitus.getGoods_num(), vitus.getBatch_num());
    }
}
