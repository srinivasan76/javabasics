package com.guvi;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println(isPalindrome(input));
	}
	public static String isPalindrome(int input) {
		int i,remainder=0,result=0,number=input;
		for(i=0;input!=0;i++) {
			remainder=input%10;
			result=(result*10)+remainder;
			input=input/10;
			
		}
		if(result==number)
			return "yes";
		else
			return "no";
	}
}
