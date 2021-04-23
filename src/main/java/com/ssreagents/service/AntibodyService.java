package com.ssreagents.service;

import com.ssreagents.pojo.Antibody;
import com.ssreagents.pojo.Vitus;

public interface AntibodyService {
    public int saveAntibodyBasic(Antibody antibody);
    public int saveAntibodyExtend(Antibody antibody);

    public Antibody getAntibodyBasic(Antibody antibody);
}
