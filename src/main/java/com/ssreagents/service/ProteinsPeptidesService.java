package com.ssreagents.service;

import com.ssreagents.pojo.ProteinsPeptides;

public interface ProteinsPeptidesService {
    public int saveProteinsPeptidesBasic(ProteinsPeptides proteinsPeptides);
    public int saveProteinsPeptidesExtend(ProteinsPeptides proteinsPeptides);

    public ProteinsPeptides getProteinsPeptidesBasic(ProteinsPeptides proteinsPeptides);
}
