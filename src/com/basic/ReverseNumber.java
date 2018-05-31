package com.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		ReverseNumber answer=new ReverseNumber();
		System.out.println("Reverse of 7316:"+ +answer.reversed(7316));

	}
	public int reversed(int number){
		int remainder,reversedNumber=0;
		while(number!=0){
			remainder=number%10;
			reversedNumber=reversedNumber*10+remainder;
			number=number/10;
		}
		return reversedNumber;
	}

}
