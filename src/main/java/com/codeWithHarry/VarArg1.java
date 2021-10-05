package com.codeWithHarry;

public class VarArg1 {
    static int sum(int ...arr){
        int res = 0;
        for(int a : arr){
            res += a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("sum of 3,4,5 = " +sum(3,4,5));
    }
}
