package com.pmoha.recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to find sum of digits: ");
        System.out.println("Sum of digits: " + sum(input.nextInt()));
    }

    public static int sum(int num) {
        if(num < 0) {
            return -1;
        }
        if(num == 0) {
            return 0; //Do this instead of if(num < 10) { return num; } to allow for negative check
        } else {
            return num % 10 + sum(num / 10);
        }
    }
}
