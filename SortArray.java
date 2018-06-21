package com.guvi;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size],i;
		if(size>=1 && size<=100000) {
		for (i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for(i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		}
}
}
