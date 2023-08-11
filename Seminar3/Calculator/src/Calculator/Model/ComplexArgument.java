package Calculator.Model;

public class ComplexArgument extends RealArgument {

    private double complexPart;

    public ComplexArgument(double realPart, double complexPart) {
        super(realPart);
        this.complexPart = complexPart;
    }

    public double getComplexPart() {
        return complexPart;
    }

    public double getRealPart() {
        return super.getRealArgument();
    }

    public void setComplexPart(double complexPart) {
        this.complexPart = complexPart;
    }

    public void setRealPart(double realPart) {
        super.setRealArgument(realPart);
    }

}
