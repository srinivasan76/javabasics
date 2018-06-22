package com.guvi;

import java.util.Arrays;
import java.util.Scanner;

public class IndexValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.nextLine();
		int arr[] = new int[n];
		if (n >= 1 && n <= 100000) {
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			indexValue(arr);
		}
	}

	public static void indexValue(int arr[]) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] != i) {
				arr[i] = 0;
			}
		}
		Arrays.sort(arr);
		for (i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				System.out.print(arr[i]+" ");
		}
	}
}
