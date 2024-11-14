package ch1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = scanner.nextInt();
        System.out.print("num2: ");
        int num2 = scanner.nextInt();

        System.out.println(CreateOperator.createOperator("+").operate(num1, num2));
        System.out.println(CreateOperator.createOperator("-").operate(num1, num2));
        System.out.println(CreateOperator.createOperator("*").operate(num1, num2));
        System.out.println(CreateOperator.createOperator("/").operate(num1, num2));
    }
}
