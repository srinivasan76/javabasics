package com.guvi;

import java.util.Scanner;

public class NumberOfSplChars {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		char ch[] = input.toCharArray();
		int i, count = 0;
		if (input.length() >= 1 && input.length() <= 1000) {
			for (i = 0; i < ch.length; i++) {
				if (!Character.isDigit(ch[i])&&!Character.isAlphabetic(ch[i])&&!Character.isWhitespace(ch[i]))
					count++;
			}
			System.out.println(count);
		}
}
}
