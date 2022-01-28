package com.firstJavaProgram;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        float rupees = input.nextFloat();
        float usd = (float) (rupees * 0.013);
        System.out.println(usd);
    }
}
