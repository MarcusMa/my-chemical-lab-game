package com.marcus.chemicallab;

import com.marcus.chemicallab.data.ChemicalFormula;

/**
 * Created by marcus on 2017/12/5.
 */
public class ChemicalEquation {

    private int[] inProportionFactors; // 配比因子
    private ChemicalFormula[] inChemicalFormulas; // 化学式
    private ReactionCondition[] conditions; // 反应条件
    private int[] outProportionFactors;
    private ChemicalFormula[] outChemicalFormulas; // 化学式

    private ChemicalEquation(){

    }

    public ChemicalEquation(ChemicalFormula[] in, int[] inFactor, ChemicalFormula[] out, int[] outFactor, ReactionCondition[] cond){
        // 反应物
        inChemicalFormulas = new ChemicalFormula[in.length];
        inProportionFactors = new int[in.length];
        for(int i=0;i<in.length;i++){
            inChemicalFormulas[i] = in[i];
            inProportionFactors[i] = inFactor[i];
        }
        // 生成物
        outChemicalFormulas = new ChemicalFormula[out.length];
        outProportionFactors = new int[out.length];
        for(int i=0;i<out.length;i++){
            outChemicalFormulas[i] = out[i];
            outProportionFactors[i] = outFactor[i];
        }
        // 反应条件
        if(null != cond){
            conditions = new ReactionCondition[cond.length];
            for(int i=0;i<cond.length;i++){
                conditions[i] = cond[i];
            }
        }
    }

    public ChemicalEquation(ChemicalFormula[] in, int[] inFactor, ChemicalFormula[] out, int[] outFactor){
        this(in,inFactor,out,outFactor,null);
    }

    public String getReadableRepresentation(){
        StringBuilder builder = new StringBuilder();

        getReadableExpression(builder,inChemicalFormulas,inProportionFactors);
        builder.append(" ==== ");
        getReadableExpression(builder,outChemicalFormulas,outProportionFactors);

        builder.append(" [ ");
        for(int i=0;i<conditions.length;i++){
            builder.append(conditions[i].getDisplayName());
            if(i!=conditions.length-1){
                builder.append(",");
            }
        }
        builder.append(" ]");
        return builder.toString();
    }

    private void getReadableExpression(StringBuilder builder, ChemicalFormula[] formulas, int[] factors) {
        for(int i = 0;i<formulas.length;i++){
            if(factors[i]>1){
                builder.append(factors[i]);
            }
            builder.append(formulas[i].getDisplayName());
            if(i!=formulas.length-1){
                builder.append(" + ");
            }
        }
    }
}
