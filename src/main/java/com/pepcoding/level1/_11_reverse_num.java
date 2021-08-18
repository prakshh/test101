package com.pepcoding.level1;

import java.util.Scanner;

public class _11_reverse_num {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		while(num > 0) {  // or (n != 0)
			int rem = num % 10; 
			System.out.println(rem); 
			num = num / 10;
//			System.out.println(rem);
		}
	}
	

}
