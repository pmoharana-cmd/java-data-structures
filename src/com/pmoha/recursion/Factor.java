package com.pmoha.recursion;

import java.util.Scanner;

public class Factor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();
        System.out.print("Input the power: ");
        int power = input.nextInt();
        System.out.println("Power of the number: " + power(num, power));
    }

    public static int power(int base, int exponent) {
        if(exponent < 0 || (base == 0 && exponent == 0)) {
            return 0;
        }
        if(exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
