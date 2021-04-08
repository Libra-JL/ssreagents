package com.ssreagents.service.impl;

import com.ssreagents.dao.VitusDao;
import com.ssreagents.dao.impl.VitusDaoImpl;
import com.ssreagents.pojo.Vitus;
import com.ssreagents.service.VitusService;

public class VitusServiceImpl implements VitusService {

    private VitusDao vd = new VitusDaoImpl();


    @Override
    public int saveVitusBasic(Vitus vitus) {
        return vd.saveVitusBasic(vitus);
    }

    @Override
    public int saveVitusExtend(Vitus vitus) {
        return vd.saveVitusExtend(vitus);
    }
}
