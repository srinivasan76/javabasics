package com.basic;

public class MethodOverloading {
	public static void main(String[] args){
		MethodOverloading multiple=new MethodOverloading();
		 MethodOverloading perfectnumber=new MethodOverloading();
		 MethodOverloading even=new MethodOverloading();
		 MethodOverloading convert=new MethodOverloading();
		 System.out.println(multiple.isMultiple(5,8));
		 System.out.println(even.isEven(6));
		 System.out.println(convert.convert(65.78));
		 System.out.println(convert.convert(45));
		  System.out.println(perfectnumber.isPerfectNumber(6));
	}
	
		public boolean isMultiple(int one,int two){
			return (two%one==0)?true:false;
			}
	public boolean isEven(int one){
		return one%2==0 ?true:false;
	}
	public double convert(double celcious){
		return	5.0 / 9.0 * ( celcious - 32 );
	}
	public double convert(int fahrenheit){
		return 9.0 / 5.0 * fahrenheit + 32;
	}
	public boolean isPerfectNumber(int number){
		int sum=0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				sum+=i;
			}
		}
			if(number==sum)
			return true;
			else
				return false;
		
			
			
	}
}

