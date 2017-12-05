import com.marcus.chemicallab.ChemicalEquation;
import com.marcus.chemicallab.ReactionCondition;
import com.marcus.chemicallab.data.ChemicalFormula;
import com.marcus.chemicallab.data.ChemicalFormulaFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello to My Chemical Labs!");



        ChemicalEquation equation = new ChemicalEquation(
                new ChemicalFormula[]{ ChemicalFormulaFactory.Mg(), ChemicalFormulaFactory.O2()},
                new int[]{2,1},
                new ChemicalFormula[]{ ChemicalFormulaFactory.MgO()},
                new int[]{2},
                new ReactionCondition[]{ReactionCondition.LIGHTING});

        System.out.println(equation.getReadableRepresentation());


        ChemicalEquation equation1 = new ChemicalEquation(
                new ChemicalFormula[]{ChemicalFormulaFactory.Fe(), ChemicalFormulaFactory.O2()},
                new int[]{3,2},
                new ChemicalFormula[]{ChemicalFormulaFactory.Fe3O4()},
                new int[]{1},
                new ReactionCondition[]{ReactionCondition.LIGHTING});

        System.out.println(equation1.getReadableRepresentation());

    }

}
