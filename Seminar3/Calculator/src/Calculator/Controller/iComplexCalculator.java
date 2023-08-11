package Calculator.Controller;

import Calculator.Model.ComplexArgument;

public interface iComplexCalculator {
    iCalculator complexSum(ComplexArgument arg);

    iCalculator complexMulti(ComplexArgument arg);

    iCalculator complexDiv(ComplexArgument arg);

    ComplexArgument getResult();
}
