package com.firstJavaProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int count = input.nextInt();
        int i;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);
        int fib = 0;
        for (i = 2; i <= count; i++){
            fib = n1 + n2;
            System.out.print(" "+fib);
            n1 = n2;
            n2 = fib;
        }
    }
}
