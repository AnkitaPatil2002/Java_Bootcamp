package com.Ankita;

import java.util.Scanner;

public class Operator {

        public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                double result;

                if (operator == '+') {
                    result = num1 + num2;
                } else if (operator == '-') {
                    result = num1 - num2;
                } else if (operator == '*') {
                    result = num1 * num2;
                } else if (operator == '/') {
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero!");
                    }
                    result = num1 / num2;
                } else {
                    throw new IllegalArgumentException("Invalid operator! Please use one of the following: '+', '-', '*', '/'");
                }

                System.out.println("The result is: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }



    }
}
