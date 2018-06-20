package com.guvi;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		isArmstrongNumber(number);
	}
	public static void isArmstrongNumber(int number) {
		int num=number,remainder=0,result=0;
		while(number!=0) {
			remainder=number%10;
			result+=Math.pow(remainder, 3);
			number=number/10;
						
		}
		if(num==result) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
}
