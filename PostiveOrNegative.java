package com.guvi;

import java.util.Scanner;

public class PostiveOrNegative {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n>=1 && n<=100000) {
		if(n>0) {
			System.out.println("Positive");
		}
		else if(n<0) {
			System.out.println("Negative");
		}
		else
			System.out.println("Zero");
	}
}
}
