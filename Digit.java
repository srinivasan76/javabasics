package com.guvi;

import java.util.Scanner;

public class Digit {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		char ch[]=input.toCharArray();
		int i,flag=0;
		for(i=0;i<ch.length;i++) {
			if(!Character.isDigit(ch[i])){
				flag=1;
				break;
			}
			else
				flag=0;
		}
		if(flag==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
