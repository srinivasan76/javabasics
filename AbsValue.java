package com.guvi;

import java.util.Scanner;

public class AbsValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hr1 = scan.nextInt();
		int min1=scan.nextInt();
		int hr2 = scan.nextInt();
		int min2=scan.nextInt();
		System.out.println(Math.abs(hr1-hr2)+" "+Math.abs(min1-min2));

}
}
