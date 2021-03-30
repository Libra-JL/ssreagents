package com.ssreagents.service.impl;

import com.ssreagents.dao.VitusDao;
import com.ssreagents.dao.impl.VitusDaoImpl;
import com.ssreagents.pojo.Vitus;
import com.ssreagents.service.VitusService;

public class VitusServiceImpl implements VitusService {

    private VitusDao vd = new VitusDaoImpl();

    @Override
    public int saveVitus(Vitus vitus) {

        return vd.saveVitus(vitus);
    }
}
