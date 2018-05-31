package com.basic;

public class Date {
	int month;
	int day;
	int year;
	public Date(){
		
	}
	public Date(int day,int month,int year){
		this.month=month;
		this.day=day;
		this.year=year;
		
	}
	
	public void displayDate(){
		System.out.println(day+"/"+month+"/"+year);
	}

	public static void main(String[] args){
		Date d1=new Date(1,6,2018);

	d1.displayDate();
		
		
		
	}
}
