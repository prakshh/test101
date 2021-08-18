package com.pepcoding.level1;

import java.util.Scanner;

public class _95_find_element_of_array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++) {
            System.out.println("Enter element arr[" + i + "] : ");
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter element you want to find");
        int indexValue = -1;
        int f = scn.nextInt();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == f) {
                indexValue = i;
                break;
            }
        }
        System.out.println(f + " is in index " +indexValue);
    }
}



        /*

        int counter = 0;

        boolean flag;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == f) flag=true;
//                System.out.println(f + " is in index " + i);
            else flag=false;
//                System.out.println(f + " not found");

            if(flag=true)
                System.out.println(f + " is in index " + i);
            else
                System.out.println(f + " not found");


  //        System.out.println("Loop ran " + counter +" times");

            */