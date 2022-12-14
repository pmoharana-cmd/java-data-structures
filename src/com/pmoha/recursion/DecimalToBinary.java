package com.pmoha.recursion;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to convert to binary: ");
        System.out.println("Number in binary: " + decToBin(input.nextInt()));
    }

    public static int decToBin(int decimal) {
        if(decimal < 0) {
            return -1;
        }
        if(decimal == 0) {
            return 0;
        }
        return  decimal % 2 + 10 * decToBin(decimal / 2);
    }
}
