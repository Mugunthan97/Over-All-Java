package org.test;

import java.util.Scanner;

public class LowerCaseUpperCase {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String c= "WelcomE";
		char ch;
		for (int i = 0; i <c.length(); i++) {
		ch=c.charAt(i);	
		if (Character.isUpperCase(ch)) 
		System.out.print(Character.toLowerCase(ch));
		
		else
			System.out.print(Character.toUpperCase(ch));
			
	
		}

	}

}
