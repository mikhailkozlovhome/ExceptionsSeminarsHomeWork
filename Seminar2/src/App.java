
public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("===================Task 1=======================");
        try {
            Task1.enterNumber();
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("===================Task 2=======================");
        try {
            Task2.divisionOfNumber();
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
