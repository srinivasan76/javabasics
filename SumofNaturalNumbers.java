package com.guvi;

import java.util.Scanner;

public class SumofNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,sum=0;
		for(i=1;i<=n;i++) {
		sum+=i;
		}
		System.out.println(sum);
}
}
