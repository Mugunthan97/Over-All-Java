package org.test;

import java.util.Scanner;

public class Sample {
	
	public static void main(String[] args) {
		
		String value="0000000001";
		System.out.println("Input");
		Scanner s=new Scanner(System.in);
		String s1 = s.next();
		System.out.println("input 2");
		String s2 = s.next();
		System.out.println("input 3");
		String s3 = s.next();
		
		
		String substring1=value.substring(s1.length());
		System.out.println("The value is "+s1+substring1);
		
		String substring2=value.substring(s2.length());
		System.out.println("The value is "+s2+substring2);
		
		String substring3=value.substring(s3.length());
		System.out.println("The value is "+s3+substring3);
		
		
	
	}

}
