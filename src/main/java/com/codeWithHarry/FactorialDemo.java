package com.codeWithHarry;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Find the factorial of n : ");
        int n = scn.nextInt();
        System.out.println("Factorial of n using recursion is : " + factRecursive(n));
        System.out.println("Factorial of n using iteration is : " + factIterative(n));
    }
    static int factRecursive(int n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return n * factRecursive(n-1);
    }
    static int factIterative(int n) {
        if(n == 0 || n == 1)
            return 1;
        else {
            int prod = 1;
            for(int i = 1; i<=n; i++){
                prod = prod * i;
            }
            return prod;
        }

    }
}
