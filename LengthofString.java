package com.guvi;

import java.util.Scanner;

public class LengthofString {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String input=scan.nextLine().replaceAll(" ","");
		System.out.println(input.length());
	}
}
