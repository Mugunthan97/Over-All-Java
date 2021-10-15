package org.test;

import java.util.Scanner;

public class Equality {
	
public static void main(String[] args) {
	

		
	Scanner a=new Scanner(System.in);	
	System.out.println("Enter the string s1");
	String s1= a.nextLine();
	System.out.println("Enter the string s2");
	String s2=a.nextLine();
	boolean equals=s1.equals(s2);
	System.out.println(equals);


}
}


