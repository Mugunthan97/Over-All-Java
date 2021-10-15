package org.test;

import java.util.Scanner;

public class Scnr {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Employee id ");
		s.nextInt();
		
		System.out.println("Employee Name ");
		String next = s.next();
		System.out.println(next);
		
//		System.out.println("Employee Mailid");
//		s.next();
	}

}
