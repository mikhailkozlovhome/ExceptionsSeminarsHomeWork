package Calculator.Controller;

import Calculator.Model.DivisionByZeroException;
import Calculator.Model.InvalidInputException;
import Calculator.Model.RealArgument;

public interface iCalculator {
    iCalculator sum(RealArgument arg);

    iCalculator multi(RealArgument arg);

    iCalculator div(RealArgument arg) throws DivisionByZeroException;

    iCalculator power(RealArgument arg) throws InvalidInputException;

    RealArgument getResult();
}
