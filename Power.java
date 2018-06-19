package com.guvi;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pow=sc.nextInt();
		int a=(int)Math.pow(n,pow);
		System.out.println(a);

}
}
