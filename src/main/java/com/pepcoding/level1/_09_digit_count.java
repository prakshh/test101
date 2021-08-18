package com.pepcoding.level1;

import java.util.Scanner;

public class _09_digit_count {
	
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 int num = scn.nextInt();
		 int digCtr = 0;
		 while(num != 0) {
			 num = num / 10;
			 digCtr++;
		 }

		 System.out.println(digCtr);
		 
	}

}
