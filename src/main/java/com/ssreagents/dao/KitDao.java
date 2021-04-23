package com.ssreagents.dao;

import com.ssreagents.pojo.Kit;

public interface KitDao {
    public int saveKitExtend(Kit kit);
    public int saveKitBasic(Kit kit);
}
