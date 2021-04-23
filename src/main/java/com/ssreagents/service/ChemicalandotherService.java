package com.ssreagents.service;

import com.ssreagents.pojo.Chemicalandother;

public interface ChemicalandotherService {
    public int saveChemicalandotherBasic(Chemicalandother chemicalandother);
    public int saveChemicalandotherExtend(Chemicalandother chemicalandother);

    public Chemicalandother getChemicalandotherBasic(Chemicalandother chemicalandother);
}
