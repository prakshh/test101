package com.pepcoding.level1;

import java.util.Scanner;

public class _10_digitsOfaNumber {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int temp = num;
		int digitCount = 0;
		while(temp != 0) {
			temp = temp / 10;
			digitCount++;
		}
//		System.out.println(digitCount); // want it to know div value to divide the num and get the quotient
//		System.out.println(temp);
//		System.out.println(num);
		
		int div = (int) Math.pow(10,  digitCount - 1);
//		while(num != 0) {		// doesn't work for numbers that has 0 at end, like 223300
		while(div != 0) {
			int quotient = num / div;
			System.out.println(quotient);
			num = num % div;
			div = div / 10;
		}
		
		
		
		
	}

}
