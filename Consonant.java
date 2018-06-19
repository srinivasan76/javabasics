package com.guvi;

import java.util.Scanner;

public class Consonant {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		int ch = (int) input;
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
			if (input == 'a' || input == 'A' || input == 'e' || input == 'E' || input == 'i' || input == 'I'
					|| input == 'o' || input == 'O' || input == 'u' || input == 'U')
				System.out.println("Vowel");
			else
				System.out.println("Consonant");

		} else
			System.out.println("Invalid");
	}
}
