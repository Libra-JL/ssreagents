package com.ssreagents.dao;

import com.ssreagents.pojo.Antibody;

public interface AntibodyDao {
    public int saveAntibodyExtend(Antibody antibody);
    public int saveAntibodyBasic(Antibody antibody);
}
