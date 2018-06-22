package com.guvi;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String split[] = s.split(" ");
		int i,j;
		for(i=0;i<split.length;i++) {
		char ch[]=split[i].toCharArray();
			for(j=ch.length-1;j>=0;j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}
