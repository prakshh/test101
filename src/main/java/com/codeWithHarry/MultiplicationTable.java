package com.codeWithHarry;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scn.nextInt();
        System.out.println("Multiplication Table of " + n + " is : ");
        multi(n);

    }

    static void multi(int n) {
        for(int i =1 ; i <= 10; i++)
            System.out.format("%d X %d = %d\n", n, i, n*i);
    }
}
