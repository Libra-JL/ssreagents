package com.ssreagents.service.impl;

import com.ssreagents.dao.KitDao;
import com.ssreagents.dao.impl.KitDaoImpl;
import com.ssreagents.pojo.Kit;
import com.ssreagents.service.KitService;

public class KitServiceImpl implements KitService {

    private KitDao kd = new KitDaoImpl();

    @Override
    public int saveKitBasic(Kit kit) {
        return kd.saveKitBasic(kit);
    }

    @Override
    public int saveKitExtend(Kit kit) {
        return kd.saveKitExtend(kit);
    }

    @Override
    public Kit getKitBasic(Kit kit) {
        return null;
    }
}
