package com.guvi;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		int ch = (int) input;
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
			System.out.println("Alphabet");
		}
			else
				System.out.println("No");
	}
}

