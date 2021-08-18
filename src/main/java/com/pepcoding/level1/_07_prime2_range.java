package com.pepcoding.level1;

import java.util.Scanner;

public class _07_prime2_range {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();
		
		for(int num=low; num <= high; num++) {
			int count=0; 
			for(int div=2; div * div <= high; div++) {
				if(num % div == 0) {
					count++;
					break; 
				}
			}
			
			boolean isPrime = false;
			if(num == 1)
				isPrime = false;
			else if(num == 2)
				isPrime = true;
			else if(count == 0)
				isPrime = true;
			
			if(isPrime)
				System.out.println(num);
			
		}
		
	      
	}

}
