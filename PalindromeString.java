package com.guvi;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i;
		String reverse = "";
		for (i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);

		}
		if (s.equals(reverse))
			System.out.println("yes");
		else {
			System.out.println("no");
		}
	}

}