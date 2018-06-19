package com.guvi;

import java.util.Scanner;

public class ToFindArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n],i;
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(arr[k]);
}
}
