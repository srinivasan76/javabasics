package com.guvi;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input1= scan.nextInt();
		int input2=scan.nextInt();
		swap(input1,input2);
}
	public static void swap(int input1,int input2) {
		int temp=0;
		temp=input1;
		input1=input2;
		input2=temp;
		System.out.println(input1+" "+input2);
	}
}
