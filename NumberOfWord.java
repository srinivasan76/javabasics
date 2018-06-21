package com.guvi;

import java.util.Scanner;

public class NumberOfWord {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String input=scan.nextLine();
		System.out.println(input.split(" ").length);
	}
}
