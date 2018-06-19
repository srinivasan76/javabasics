package com.guvi;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int arr[]= {number1,number2,number3};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
}
}
