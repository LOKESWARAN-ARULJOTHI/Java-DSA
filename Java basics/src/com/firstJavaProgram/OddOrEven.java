package com.firstJavaProgram;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number % 2 != 0)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
