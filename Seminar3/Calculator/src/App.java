
import Calculator.Controller.ComplexController;
import Calculator.Controller.Controller;
import Calculator.Controller.iCalculator;
import Calculator.Controller.iComplexCalculator;
import Calculator.Model.ComplexArgument;
import Calculator.Model.ComplexCalculator;
import Calculator.Model.RealArgument;
import Calculator.Model.RealCalculator;
import Calculator.View.ViewCalculator;

public class App {
    public static void main(String[] args) throws Exception {

        ViewCalculator view = new ViewCalculator();

        RealArgument arg = new RealArgument((double) 0);
        iCalculator calculator = new RealCalculator(arg);
        Controller control = new Controller(calculator, view);

        // ComplexArgument complexArg = new ComplexArgument(0, 0);
        // iComplexCalculator complexCalc = new ComplexCalculator(complexArg);
        // ComplexController control = new ComplexController(calculator, view, complexCalc);
        
        control.run();
    }
}
