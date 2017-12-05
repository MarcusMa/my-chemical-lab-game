package com.marcus.chemicallab.data;

/**
 * Created by marcus on 2017/12/5.
 */
public class ChemicalFormulaFactory {

    public static ChemicalFormula O2(){
        return new ChemicalFormula("氧气","O_2",1);
    }

    public static ChemicalFormula Mg(){
        return  new ChemicalFormula( "镁","Mg", 2);
    }

    public static ChemicalFormula MgO(){
        return new ChemicalFormula("氧化镁", "MgO", 2);
    }

    public static ChemicalFormula Fe(){
        return new ChemicalFormula("铁", "Fe", 2);
    }

    public static ChemicalFormula Fe3O4(){
        return new ChemicalFormula("四氧化三铁", "Fe_3O_4",2);
    }

    public static ChemicalFormula Cu(){
        return new ChemicalFormula("铜","Cu",2);
    }

    public static ChemicalFormula Al(){
        return new ChemicalFormula("铝", "Al", 3);
    }

}
