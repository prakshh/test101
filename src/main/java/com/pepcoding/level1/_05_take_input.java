package com.pepcoding.level1;

import java.util.Scanner;

public class _05_take_input {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.nextLine());
		String name = scn.nextLine();
		
		System.out.println("Dear " + name + ". Here is the counting"); 
		for(int i=0; i<=n; i++)
			System.out.println(i);


		
//		int n = scn.nextInt();
//		for(int i=0; i<=n; i++)
//			System.out.println(i);
		
//		int n = scn.nextInt();
//		String name = scn.nextLine();
//		System.out.println("Hello " +name); // bug, it is not fetching the name value in output
//		                                    // have to convert int to String
//		for(int i=0; i<=n; i++)
//			System.out.println(i);

		
	}

}
