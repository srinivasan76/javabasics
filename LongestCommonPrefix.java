package com.guvi;

import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		String result="";
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==(ch2[i])) {
				result+=ch1[i];
			}
			else
				break;
		}
		System.out.println(result);
	}
}
