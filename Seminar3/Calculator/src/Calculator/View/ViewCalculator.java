package Calculator.View;

import java.util.Scanner;

import Calculator.Controller.iGetView;

public class ViewCalculator implements iGetView {

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}