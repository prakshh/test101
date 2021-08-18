package com.random.exceptionHandling;

public class Exception1 {
	
	public static void main(String[] args) {
		int[] arr1 = {22, 66, 99};
//		System.out.println(arr1[4]);
		try {
			System.out.println(arr1[4]);
		}
		catch(Exception e){
			System.out.println("error aya tha");
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("niche ki line");
		
	}

}
