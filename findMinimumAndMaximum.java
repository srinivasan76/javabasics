package com.basic;

public class findMinimumAndMaximum {
	
								
	public static void main(String[] args) {
		int a[] = {3,4,5,2,33,24,2},temp,i=0;
		for(i = 0; i < a.length-1; i++) {
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			
		}
		System.out.println("The maximum number in the array " +a[i]);
		for(i = 0; i < a.length-1; i++) {
			if(a[i]<a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			
		}
		System.out.println("The minimum number in the array " +a[i]);
	
	}

}
