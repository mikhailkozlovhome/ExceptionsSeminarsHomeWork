package Calculator.Controller;

import Calculator.Model.ComplexArgument;
import Calculator.Model.DivisionByZeroException;
import Calculator.Model.InvalidInputException;
import Calculator.Model.RealArgument;

public class Controller {
    private iCalculator calculator;
    private iGetView view;

    public Controller(iCalculator calculator, iGetView view) {
        this.calculator = calculator;
        this.view = view;
    }

    public void run() {
        while (true) {
            double realPrimArg = view.promptInt("Введите первый аргумент: ");
            RealArgument primaryArg = new RealArgument(realPrimArg);

            calculator.sum(primaryArg);
            // iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = view.prompt("Введите команду (+, *, /, =, ^) : ");
                if (cmd.equals("*")) {
                    double realArg = view.promptInt("Введите второй аргумент: ");

                    RealArgument arg = new RealArgument(realArg);
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double realArg = view.promptInt("Введите второй аргумент: ");
                    RealArgument arg = new RealArgument(realArg);

                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double realArg = view.promptInt("Введите второй аргумент: ");
                    RealArgument arg = new RealArgument(realArg);
                    try {
                        calculator.div(arg);
                        continue;
                    } catch (DivisionByZeroException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (cmd.equals("^")) {
                    double realArg = view.promptInt("Введите второй аргумент: ");
                    RealArgument arg = new RealArgument(realArg);
                    try {
                        calculator.power(arg);
                        continue;
                    } catch (InvalidInputException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (cmd.equals("=")) {
                    RealArgument result = calculator.getResult();
                    System.out.printf("Результат %f\n", result.getRealArgument());
                    break;
                }
            }
            String cmd = view.prompt("Еще посчитать (Y/N)?");
            if (cmd.toUpperCase().equals("Y")) {
                continue;
            }

                break;
            
        }
    }

    public iCalculator getCalculator() {
        return calculator;
    }

    public iGetView getView() {
        return view;
    }

}
