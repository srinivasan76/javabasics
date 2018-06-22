package com.guvi;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer str = new StringBuffer();
		str.append(s);
		if (s.length() >= 1 && s.length() <= 100000) {
			System.out.println(str.reverse());
		}
	}
}
