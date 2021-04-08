package com.ssreagents.service;

import com.ssreagents.pojo.Vitus;

public interface VitusService {
    public int saveVitusBasic(Vitus vitus);
    public int saveVitusExtend(Vitus vitus);

    public Vitus getVitusBasic(Vitus vitus);

}
