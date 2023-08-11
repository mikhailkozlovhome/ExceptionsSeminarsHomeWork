package Calculator.Model;

import Calculator.Controller.iCalculator;

public class RealCalculator implements iCalculator {

    private RealArgument primaryArg;

    public RealCalculator(RealArgument primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public iCalculator sum(RealArgument arg) {
        this.primaryArg.setRealArgument(this.primaryArg.getRealArgument() + arg.getRealArgument());
        return this;
    }

    @Override
    public iCalculator multi(RealArgument arg) {
        this.primaryArg.setRealArgument(this.primaryArg.getRealArgument() * arg.getRealArgument());
        return this;
    }

    @Override
    public RealArgument getResult() {
        return primaryArg;
    }

    @Override
    public iCalculator div(RealArgument arg) throws DivisionByZeroException {
        if (arg.getRealArgument() == 0) {
            throw new DivisionByZeroException("Деление на ноль запрещено!");
        }
        this.primaryArg.setRealArgument(this.primaryArg.getRealArgument() / arg.getRealArgument());

        return this;
    }

    @Override
    public iCalculator power(RealArgument arg) throws InvalidInputException {
        if (arg.getRealArgument() < 0) {
            throw new InvalidInputException("Степень числа не может быть отрицательной!");
        } else if (this.primaryArg.getRealArgument() == 0) {
            throw new InvalidInputException("Основание степени не может равняться нулю!");
        }

        this.primaryArg.setRealArgument(Math.pow(this.primaryArg.getRealArgument(), arg.getRealArgument()));
        return this;
    }
}
