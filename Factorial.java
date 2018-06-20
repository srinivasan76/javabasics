package com.guvi;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input_Number=scan.nextInt();
		if(input_Number>0)
		factorial(input_Number);
	}
	public static void factorial(int n) {
		int i,result=1;
		for(i=1;i<=n;i++) {
			result*=i;
		}
		System.out.println(result);
	}
}
