package com.firstJavaProgram;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if (number1 > number2)
            System.out.println(number1 + " is the largest number");
        else
            System.out.println(number2 + " is the largest number");
    }
}
