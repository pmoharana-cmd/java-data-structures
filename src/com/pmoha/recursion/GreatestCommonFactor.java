package com.pmoha.recursion;

import java.util.Scanner;

public class GreatestCommonFactor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = input.nextInt();
        System.out.print("Input another number: ");
        int num2 = input.nextInt();
        System.out.println("GCF of two numbers are: " + gcf(num1, num2));
    }

    public static int gcf(int num1, int num2) {
        if(num1 < 0 || num2 < 0) {
            return -1;
        }
        if(num2 == 0) {
            return num1;
        } else {
            return gcf(num2, num1 % num2);
        }
    }
}
