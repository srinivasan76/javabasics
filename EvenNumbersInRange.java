package com.guvi;

import java.util.Scanner;

public class EvenNumbersInRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q=scan.nextInt();
		if(n<=100000 && q<=100000)
			evenNumbers(n,q);
}
	public static void evenNumbers(int n,int q) {
		int i;
		for(i=n+1;i<q;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}
