package com.basic;

public class Employee {
	private String firstNmae;
	private String lastName;
	private double salary;
	public String getFirstNmae() {
		return firstNmae;
	}
	public void setFirstNmae(String firstNmae) {
		this.firstNmae = firstNmae;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setFirstNmae("srini");
		e2.setFirstNmae("yogesh");
		e1.setLastName("vasan");
		e2.setLastName("87");
		
		e1.setSalary(1000);
		e2.setSalary(1500);
		double salary=e1.getSalary();
		salary=salary*10;
		e1.setSalary(salary);
	    double salary1=e2.getSalary();
	    salary1=salary1*10;
	    e2.setSalary(salary1);
	    System.out.println("Employee1 Name is" +" " +e1.getFirstNmae() +e1.getLastName());
	    
	    System.out.println("Employee1 increment salary is" +" " +e1.getSalary());
	    System.out.println("Emplyee2 Name is" +" " +e2.getFirstNmae() +e2.getLastName());


	    System.out.println("Employee2 increment salary is" +" " +e2.getSalary());
	    
		}

	

}
