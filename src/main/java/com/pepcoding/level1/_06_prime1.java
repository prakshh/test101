package com.pepcoding.level1;

import java.util.Scanner;

public class _06_prime1 {
	
	public static void main(String[] args) {	
		
		// time complexity : t * (sq.root of n)
		
		Scanner scn = new Scanner(System.in);
		int testCase = scn.nextInt();

		for(int i = 0; i < testCase; i++ ) {
			int num = scn.nextInt();
			int count = 0;
			for(int divisor=2; divisor * divisor <= num; divisor++) {
				if(num % divisor == 0) {
					count++;
					break;
				}
			}
			
			if(num == 0 || num == 1)
				System.out.println("not prime");
			else if(count == 0)
				System.out.println("prime");
			else
				System.out.println("not prime");
		}

		// time complexity : t * n
//		Scanner scn = new Scanner(System.in);
//		int testCase = scn.nextInt();
//		for(int i = 0; i < testCase; i++ ) {
//			int num = scn.nextInt();
//			int count = 0;
//			for(int divisor=1; divisor <= num; divisor++) {
//				if(num % divisor == 0)
//					count++;
//			}
//			if(count == 2)
//				System.out.println("prime");
//			else
//				System.out.println("not prime");		
//		}
		

		
		
		
	}

}
