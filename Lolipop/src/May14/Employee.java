package May14;

import java.time.LocalDateTime;

public class Employee {
	//non static variable
	int id;
	String name;
	String dept;
	//static variable
	static String companyName = "Google";
	static int count;
	//non static constructor
	public Employee(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	//static initializer
	static {
		System.out.println("Employee Tracking System");
	}
	//non static initializer
	{
		count++;
	}
	//non static initializer
	{
		System.out.println(LocalDateTime.now());
	}
	//non static method
	public void display() {
		System.out.println("Id : "+id);
		System.out.println("Name : " +name);
		System.out.println("Department : "+dept);
	}
	
}
