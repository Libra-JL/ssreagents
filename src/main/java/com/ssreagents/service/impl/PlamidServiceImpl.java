package com.ssreagents.service.impl;

import com.ssreagents.dao.PlamidDao;
import com.ssreagents.dao.impl.PlamidDaoImpl;
import com.ssreagents.pojo.Plamid;
import com.ssreagents.pojo.ProteinsPeptides;
import com.ssreagents.service.PlamidService;

public class PlamidServiceImpl implements PlamidService {


    private PlamidDao pd = new PlamidDaoImpl();


    @Override
    public int savePlamidBasic(Plamid plamid) {
        return pd.savePlamidBasic(plamid);
    }

    @Override
    public int savePlamidExtend(Plamid plamid) {
        return pd.savePlamidExtend(plamid);
    }

    @Override
    public ProteinsPeptides getPlamidsBasic(Plamid plamid) {
        return null;
    }
}
