package com.guvi;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		if(n>=1 && n<=100000) {
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			}
			reversedNumbers(arr);
		}
	}
		public static void reversedNumbers(int arr[]) {
			int i;
			Arrays.sort(arr);
			for(i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]);
			}
		}
	}


