package com.firstJavaProgram;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers and an operator:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        char operator = input.next().charAt(0);
        if (operator == '+')
            System.out.println(number1 + number2);
        else if (operator == '-')
            System.out.println(number1 - number2);
        else if (operator == '*')
            System.out.println(number1 * number2);
        else if (operator == '/')
            System.out.println(number1 / number2);
        else if (operator == '%')
            System.out.println(number1 % number2);
    }
}
