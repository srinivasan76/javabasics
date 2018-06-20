package com.guvi;

import java.util.Scanner;

public class FirstMultiples {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		multiples(n);
}	
	public static void multiples(int n) {
		int i;
		for(i=1;i<=5;i++) {
			System.out.print(i*n+" ");
		}
	}
}

