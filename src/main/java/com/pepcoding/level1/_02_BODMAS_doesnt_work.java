package com.pepcoding.level1;

public class _02_BODMAS_doesnt_work {
	
	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 10;
		
		int res = num1 * num2 / num1 + num2;
		System.out.println(res);
		
		/*
		 * BODMAS rule does't work here actually
		 * (*, /, %) has equal preference here
		 * (+, -) has equal preference here
		 * (*, /, %) > (+, -)
		 */
	}

}
