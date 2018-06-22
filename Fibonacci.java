package com.guvi;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		int result=0,i,a=0,b=1;
		System.out.print(b);
		for(i=0;i<input-1;i++) {
			result=a+b;
			a=b;
			b=result;
			System.out.print(" "+result);
		}
		
	}
}
