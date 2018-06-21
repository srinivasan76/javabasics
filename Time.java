package com.guvi;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input= scan.nextInt();
		System.out.println(input/60+" "+input%60);
}
}