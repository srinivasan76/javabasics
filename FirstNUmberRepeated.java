package com.guvi;

import java.util.Scanner;

public class FirstNUmberRepeated {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.nextLine();
		int arr[] = new int[n], i, j, flag = 0;
		if (n >= 1 && n <= 100000) {
			for (i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			for (i = 0; i < arr.length; i++) {
				for (j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j])
						flag = 1;
				}
				if (flag == 1) {
					System.out.println(arr[i]);
					break;
				}

			}
			if (flag == 0)
				System.out.println("unique");
		}
	}
}