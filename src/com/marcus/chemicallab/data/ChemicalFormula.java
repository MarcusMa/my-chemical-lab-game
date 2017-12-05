package com.marcus.chemicallab.data;

/**
 * Created by marcus on 2017/12/5.
 */
public class ChemicalFormula {

    private String name;
    private String displayName;

    private int type;

    private ChemicalFormula(){}

    public ChemicalFormula(String name, String displayName, int type){
        this.name = name;
        this.displayName = displayName;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
