package com.basic;

public class Array {
	public static void main(String[] args) {
		int N = 12345, i, remainder;
		int array[] = new int[10];

		for(i = 0; i < array.length; i++){
			remainder = N % 10;
			array[i] = remainder;
			N = N / 10;
			System.out.print(array[i]);
			
		
}
		
}
}
