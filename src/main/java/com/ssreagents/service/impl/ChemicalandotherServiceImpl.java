package com.ssreagents.service.impl;

import com.ssreagents.dao.ChemicalandotherDao;
import com.ssreagents.dao.impl.ChemicalandotherDaoImpl;
import com.ssreagents.pojo.Chemicalandother;
import com.ssreagents.service.ChemicalandotherService;

public class ChemicalandotherServiceImpl implements ChemicalandotherService {

    private ChemicalandotherDao cd = new ChemicalandotherDaoImpl();

    @Override
    public int saveChemicalandotherBasic(Chemicalandother chemicalandother) {
        return cd.saveChemicalandotherBasic(chemicalandother);
    }

    @Override
    public int saveChemicalandotherExtend(Chemicalandother chemicalandother) {
        return cd.saveChemicalandotherExtend(chemicalandother);
    }

    @Override
    public Chemicalandother getChemicalandotherBasic(Chemicalandother chemicalandother) {
        return null;
    }
}
