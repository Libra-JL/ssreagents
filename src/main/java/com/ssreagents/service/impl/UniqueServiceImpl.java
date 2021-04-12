package com.ssreagents.service.impl;

import com.ssreagents.dao.UniqueDao;
import com.ssreagents.dao.impl.UniqueDaoImpl;
import com.ssreagents.pojo.Vitus;
import com.ssreagents.service.UniqueService;


public class UniqueServiceImpl implements UniqueService {

    private UniqueDao ud = new UniqueDaoImpl();

    @Override
    public Vitus searchProductbyAttr(Vitus vitus) {
        return ud.searchProductbyAttr(vitus);
    }
}
