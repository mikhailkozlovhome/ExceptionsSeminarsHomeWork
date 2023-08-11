package Calculator.Model;

import Calculator.Controller.iCalculator;
import Calculator.Controller.iComplexCalculator;

public class ComplexCalculator extends RealCalculator implements iComplexCalculator {

    private ComplexArgument primaryArg;

    public ComplexCalculator(RealArgument realPrimArg, ComplexArgument complexPrimaryArg) {
        super(realPrimArg);
        this.primaryArg = complexPrimaryArg;
    }

    public ComplexCalculator(ComplexArgument complexPrimaryArg) {
        super(null);
        this.primaryArg = complexPrimaryArg;
    }

    // public ComplexCalculator(RealArgument realPrimArg) {
    //     super(realPrimArg);
    // }

    @Override
    public iCalculator complexSum(ComplexArgument arg) {
        primaryArg.setRealArgument(primaryArg.getRealArgument() + arg.getRealArgument());
        primaryArg.setComplexPart(primaryArg.getComplexPart() + arg.getComplexPart());
        return this;
    }

    @Override
    public iCalculator complexMulti(ComplexArgument arg) {
        primaryArg.setRealArgument(
                primaryArg.getRealArgument() * arg.getRealArgument()
                        - primaryArg.getComplexPart() * arg.getComplexPart());
        primaryArg.setComplexPart(
                primaryArg.getRealArgument() * arg.getRealArgument()
                        + primaryArg.getComplexPart() * arg.getComplexPart());
        return this;
    }

    @Override
    public ComplexArgument getResult() {
        return primaryArg;
    }

    @Override
    public iCalculator complexDiv(ComplexArgument arg) {
        primaryArg.setRealArgument(
                (primaryArg.getRealArgument() * arg.getRealArgument()
                        + primaryArg.getComplexPart() * arg.getComplexPart())
                        / (Math.pow(arg.getRealArgument(), 2) + Math.pow(arg.getComplexPart(), 2)));

        primaryArg.setComplexPart(
                (primaryArg.getComplexPart() * arg.getRealArgument()
                        + primaryArg.getRealArgument() * arg.getComplexPart())
                        / (Math.pow(arg.getRealArgument(), 2) + Math.pow(arg.getComplexPart(), 2)));

        return this;
    }
}
