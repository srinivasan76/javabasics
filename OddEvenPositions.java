package com.guvi;

import java.util.Scanner;

public class OddEvenPositions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.nextLine();
		int arr[] = new int[n], i, j, flag = 0;
		if (n >= 1 && n <= 100000) {
			for (i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
				if(arr[i]%2==0 && i%2==1 || arr[i]%2==1 && i%2==0) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}