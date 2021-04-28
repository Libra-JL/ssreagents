package com.ssreagents.service;

import com.ssreagents.pojo.Plamid;
import com.ssreagents.pojo.ProteinsPeptides;

public interface PlamidService {
    public int savePlamidBasic(Plamid plamid);
    public int savePlamidExtend(Plamid plamid);

    public ProteinsPeptides getPlamidsBasic(Plamid plamid);
}
