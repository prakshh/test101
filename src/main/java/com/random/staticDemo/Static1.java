package com.random.staticDemo;

public class Static1 {
	
//	public static void main(String[] args) {
	static public void main(String[] args) {
	
//		int marks[] = {40, 50, 60, 70 , 80};
//		average(20, 30);
		Static1 obj = new Static1();
//		System.out.println(obj.average(20, 30));
		obj.average(20, 90);
	}
	
//	static int average(int firstNum, int secondNum) {
//	int average(int firstNum, int secondNum) {
	void average(int firstNum, int secondNum) {
		int sum = firstNum + secondNum;
//		return sum/2;
		System.out.println(sum/2);
	}

}
