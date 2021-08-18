package com.pepcoding.level1;

public class _01_print_Z_and_pre_post_increment {
	
	public static void main(String[] args) {
		System.out.println("*****");
		System.out.println("   *");
		System.out.println("  *");
		System.out.println(" *");
		System.out.println("*****");
		
	    int i = 10; 
	    if(i++ == i) {
	 	 System.out.println(i + " is good");
	 	 System.out.println(i++ == i);
	    }else
	 	 System.out.println(i + " is bad");
	 
	    int j = 20;
	    if(++j == j)
	 	 System.out.println(j + " is good");
	    else
	 	 System.out.println(j + " is bad");
	}

}
