package com.conditionsAndLoops;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}

// O(N) - time complexity
//O(1) - Space complexity