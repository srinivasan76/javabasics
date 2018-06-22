package com.guvi;

import java.util.Scanner;

public class SumOfArrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.nextLine();
		int arr[] = new int[n], i, sum = 0;
		if (n >= 1 && n <= 100000) {
			for (i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
				sum += arr[i];
			}
			System.out.println(sum);
		}
	}
}
