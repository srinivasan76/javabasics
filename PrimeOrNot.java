package com.guvi;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n <= 1000 && n > 1)
			isPrime(n);
	}

	public static void isPrime(int n) {
		int j, flag = 0;
			for (j = 2; j < n / 2; j++) {
				if (n% j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("yes");
			}
			else
				System.out.println("no");
	}
}
