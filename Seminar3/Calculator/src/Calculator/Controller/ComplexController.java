package Calculator.Controller;

import Calculator.Model.ComplexArgument;

public class ComplexController extends Controller {
    private iComplexCalculator complexCalc;

    public ComplexController(iCalculator calculator, iGetView view, iComplexCalculator complexCalc) {
        super(calculator, view);

        this.complexCalc = complexCalc;
    }

    public void run() {
        while (true) {
            double realPrimArg = super.getView().promptInt("Введите вещественную часть первого аргумента: ");
            double complexPrimArg = super.getView().promptInt("Введите комплексную часть первого аргумента: ");
            ComplexArgument primaryArg = new ComplexArgument(realPrimArg, complexPrimArg);
            this.complexCalc.complexSum(primaryArg);
            // iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = super.getView().prompt("Введите команду (+, *, /, =) : ");
                if (cmd.equals("*")) {
                    double realArg = super.getView().promptInt("Введите вещественную часть второго аргумента: ");
                    double complexArg = super.getView().promptInt("Введите комплексную часть второго аргумента: ");
                    ComplexArgument arg = new ComplexArgument(realArg, complexArg);
                    complexCalc.complexMulti(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double realArg = super.getView().promptInt("Введите вещественную часть второго аргумента: ");
                    double complexArg = super.getView().promptInt("Введите комплексную часть второго аргумента: ");
                    ComplexArgument arg = new ComplexArgument(realArg, complexArg);

                    complexCalc.complexSum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double realArg = super.getView().promptInt("Введите вещественную часть второго аргумента: ");
                    double complexArg = super.getView().promptInt("Введите комплексную часть второго аргумента: ");
                    ComplexArgument arg = new ComplexArgument(realArg, complexArg);

                    complexCalc.complexDiv(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexArgument result = complexCalc.getResult();
                    System.out.printf("Результат %f + %f*i\n", result.getRealArgument(), result.getComplexPart());
                    break;
                }
            }
            String cmd = super.getView().prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }

    }
}
