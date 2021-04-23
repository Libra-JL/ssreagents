package com.ssreagents.service.impl;

import com.ssreagents.dao.AntibodyDao;
import com.ssreagents.dao.impl.AntibodyDaoImpl;
import com.ssreagents.pojo.Antibody;
import com.ssreagents.pojo.Vitus;
import com.ssreagents.service.AntibodyService;

public class AntibodyServiceImpl implements AntibodyService {


    AntibodyDao ad = new AntibodyDaoImpl();


    @Override
    public int saveAntibodyBasic(Antibody antibody) {
        return ad.saveAntibodyBasic(antibody);
    }

    @Override
    public int saveAntibodyExtend(Antibody antibody) {
        return ad.saveAntibodyExtend(antibody);
    }

    @Override
    public Antibody getAntibodyBasic(Antibody antibody) {
        return null;
    }
}
