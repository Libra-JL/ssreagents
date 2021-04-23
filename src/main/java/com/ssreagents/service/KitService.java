package com.ssreagents.service;

import com.ssreagents.pojo.Kit;
import com.ssreagents.pojo.Vitus;

public interface KitService {
    public int saveKitBasic(Kit kit);
    public int saveKitExtend(Kit kit);

    public Kit getKitBasic(Kit kit);
}
