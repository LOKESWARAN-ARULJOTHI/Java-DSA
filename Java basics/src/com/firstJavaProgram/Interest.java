package com.firstJavaProgram;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal, time, rate: ");
        int principal = input.nextInt();
        int time = input.nextInt();
        float rate = input.nextFloat();
        float simpleInterest = (principal * rate * time) / 100;
        System.out.println(simpleInterest);
    }
}
