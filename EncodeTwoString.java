package com.guvi;

import java.util.Scanner;

public class EncodeTwoString {
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	String s1=scan.next().toLowerCase();
	String s2=scan.next().toLowerCase();
	byte ch1[]=s1.getBytes();
	byte ch2[]=s2.getBytes();
	for(int i=0;i<s1.length();i++)
	System.out.print((char) ((ch1[i]+ch2[i])-96)+"");
	}
}
