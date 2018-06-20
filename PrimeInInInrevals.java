package com.guvi;

import java.util.Scanner;

public class PrimeInInInrevals {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		primrNumbers(start, end);
	}

	public static void primrNumbers(int start, int end) {
		int i, j, flag = 0;
		for (i = start+1; i < end; i++) {
			for (j = 2; j <=i / 2; j++) {
				if (i% j == 0) {
					flag = 1;
					break;
				}
				else
					flag=0;
			}
			if (flag == 0) {
				System.out.print(i+" ");
			}
		}

	}
}
