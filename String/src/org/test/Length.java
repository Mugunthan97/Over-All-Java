package org.test;

import java.util.Scanner;

public class Length {
public static void main(String[] args) {
	
	String a="Green Technology";
	String a2= "Green technoloGy";
	
	int length = a.length();
	System.out.println(length);
	
	int indexOf = a.indexOf('o');
	System.out.println(indexOf);
	
	char charAt = a.charAt(9);
	System.out.println(charAt);
	
	boolean equalsIgnoreCase = a.equalsIgnoreCase(a2);
	System.out.println(equalsIgnoreCase);
	
	Scanner in=new Scanner(System.in);	

String s1= "mugunthanvgp@gmail.com";

for(int i=0;i<=s1.length();i++)
{
	boolean contains=s1.contains("@");
	System.out.println(contains);
	break;
	
}
	String b="2/46,Iyyampudur Aniyar,Namakkal.";
	
	boolean contains = b.contains("pincode");
	System.out.println(contains);
	
	String d="mugunthanvgp@gmail.com";
	
	boolean contains2 = d.contains("@");
	System.out.println(contains2);
}
}
