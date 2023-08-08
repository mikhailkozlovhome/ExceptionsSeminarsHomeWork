// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". 
// В противном случае, программа должна выводить результат деления.

import java.util.Scanner;

public class Task2 {
    public static void divisionOfNumber() throws DivisionByZeroException {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите делимое: ");
        int a = iScanner.nextInt();

        System.out.print("Введите делитель: ");
        int b = iScanner.nextInt();

        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }

        System.out.println(a + " разделить на " + b + " равно " + (double)a/b);
    }
}
