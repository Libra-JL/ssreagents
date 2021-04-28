package com.ssreagents.service.impl;

import com.ssreagents.dao.ProteinsPeptidesDao;
import com.ssreagents.dao.impl.ProteinsPeptidesDaoImpl;
import com.ssreagents.pojo.ProteinsPeptides;
import com.ssreagents.service.ProteinsPeptidesService;

public class ProteinsPeptidesServiceImpl implements ProteinsPeptidesService {

    private ProteinsPeptidesDao ppd =new ProteinsPeptidesDaoImpl();

    @Override
    public int saveProteinsPeptidesBasic(ProteinsPeptides proteinsPeptides) {
        return ppd.saveProteinsPeptidesBasic(proteinsPeptides);
    }

    @Override
    public int saveProteinsPeptidesExtend(ProteinsPeptides proteinsPeptides) {
        return ppd.saveProteinsPeptidesExtend(proteinsPeptides);
    }

    @Override
    public ProteinsPeptides getProteinsPeptidesBasic(ProteinsPeptides proteinsPeptides) {
        return null;
    }
}
