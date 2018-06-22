package com.guvi;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		// String a[] = new String[n];
		if (n >= 1 && n <= 100000) {
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			repeatedElements(arr);
		}
	}

	public static void repeatedElements(int arr[]) {
		Arrays.sort(arr);
		int a[] = new int[10];
		int flag = 0, i;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				flag = 1;
				a[arr[i]]++;
			}
		}
		for (i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.print(i + " ");
			}
		}
		if (flag == 0)
			System.out.println("unique");
	}
}
