package com.basic;

public class Loop {
	public static void main(String[] args){
		int i=1;
		while(i<10){
			System.out.println(i);
			i++;
		}
		for(i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		do{
			System.out.println(i);
			i++;
			
		}while(i<10);
	}

}
