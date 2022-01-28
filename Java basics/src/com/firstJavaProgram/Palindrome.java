package com.firstJavaProgram;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String word = input.next();
        int halfLength = (int)word.length()/2;
//        System.out.println(halfLength + " " + word.length());
        int i = 0, j = word.length()-1;
        boolean isPalindrome = true;
        while (i<j){
            if (word.charAt(i) != word.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
