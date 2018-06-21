package com.guvi;

import java.util.Scanner;

public class SortingMediumArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		sortedArray(arr, size);
	}

	public static void sortedArray(int arr[], int size) {
		int i, j, temp = 0;
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}

		}
		System.out.println(arr[arr.length / 2]);
	}
}
