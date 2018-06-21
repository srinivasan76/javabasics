package com.guvi;

import java.util.Scanner;

public class NumberOfparagraph {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String input=scan.nextLine();
		if(input.length()>=1 && input.length()<=1000)
		System.out.println(input.split("\\.").length);
	}
}
