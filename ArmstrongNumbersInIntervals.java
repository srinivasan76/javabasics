package com.guvi;

import java.util.Scanner;

public class ArmstrongNumbersInIntervals {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();
		isArmstrongNumber(start, end);
	}

	public static void isArmstrongNumber(int start, int end) {
		int num, i, remainder = 0,result;
		for (i = start; i < end; i++) {
			num = i;
			result=0;
			int j=i;
			while (j != 0) {
				remainder = j% 10;
				result += Math.pow(remainder, 3);
				j= j / 10;
				//System.out.println(result);
			}
			if (num == result) {
				System.out.print(num + " ");
			}
			//else
				//System.out.println(num);
		}

	}
}
