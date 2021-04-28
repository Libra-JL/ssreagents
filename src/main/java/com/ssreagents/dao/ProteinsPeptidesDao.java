package com.ssreagents.dao;

import com.ssreagents.pojo.ProteinsPeptides;

public interface ProteinsPeptidesDao {
    public int saveProteinsPeptidesExtend(ProteinsPeptides proteinsPeptides);
    public int saveProteinsPeptidesBasic(ProteinsPeptides proteinsPeptides);
}
