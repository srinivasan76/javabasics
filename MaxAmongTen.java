package com.guvi;

import java.util.Scanner;

public class MaxAmongTen {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input[]=new int[10],i,max=Integer.MIN_VALUE;
		for(i=0;i<10;i++) {
			input[i]=scan.nextInt();
			if(max<input[i]) {
				max=input[i];
			}
		}
		System.out.println(max);
	}
}
