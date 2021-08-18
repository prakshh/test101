package com.pepcoding.level1;

import java.util.Scanner;

public class _12_inverseNum {
	
	public static void main(String[] args) {
		
		// input : output
		// 21453 : 23154 
		// 613254 : 621435
		
		Scanner scn =new Scanner(System.in);
		int num = scn.nextInt();
		
		int inv = 0;
		int originalPosition = 1;
		
		while(num != 0) {
			int originalDigit = num % 10;
			int inversePosition = originalDigit;
			int inverseDigit = originalPosition;
			
			inv = inv + inverseDigit * (int)Math.pow(10, inversePosition - 1);
			num = num / 10;
			originalPosition++;
		}
		System.out.println(inv);
	}

}
