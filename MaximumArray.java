package com.guvi;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumArray {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int i,arr[]=new int[size];
	for(i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println(arr[size-1]);
}
}
