package com.guvi;

import java.util.Scanner;

public class ArrayWithPosition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size], i;
		if (size >= 1 && size <= 100000) {
			for (i = 0; i < size; i++) {
				arr[i] = scan.nextInt();
			}
			for (i = 0; i < size; i++) {
				System.out.println(arr[i] + " " + i);
			}
		}
	}
}
