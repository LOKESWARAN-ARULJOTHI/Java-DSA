package com.conditionsAndLoops;

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class subtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0, reminder=0;
        while (n>0){
            reminder = n % 10;
            product *= reminder;
            sum += reminder;
            n /= 10;
        }
        return product-sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234) == 15);
    }
}
