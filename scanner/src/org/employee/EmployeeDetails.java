package org.employee;

import java.util.Scanner;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Employee Id Is ");
		byte empId = s.nextByte();
		
		System.out.println("Employee Name Is ");
		String empName = s.next();
		
		System.out.println("Employee Phone Number Is ");
		int empPhoneNumber = s.nextInt();
		
		System.out.println("Employee Mail Id");
		String empMailId = s.next();
		
		System.out.println("Employee Salary Is");
		double empSalary = s.nextDouble();
		
		System.out.println("Employee Is Present or Not");
		boolean empPresentOrNot = s.nextBoolean();
		
		System.out.println("Employee Id "+empId);
		System.out.println("Employee Name "+empName);
		System.out.println("Employee Mail Id"+empMailId);
		System.out.println("Employee Phone Number"+empPhoneNumber);
		System.out.println("Employee Salary "+empSalary);
		System.out.println("Employee Present Or Not"+empPresentOrNot);
		
	}

}
