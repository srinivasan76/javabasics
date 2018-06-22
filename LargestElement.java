package com.guvi;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		String s = scan.nextLine();
		int arr[] = new int[n], i, j, flag = 0;
		if (n >= 1 && n <= 100000 && k >= 1 && k <= 100000 && n >= k) {
			for (i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[n-k]);
		}
	}
}
