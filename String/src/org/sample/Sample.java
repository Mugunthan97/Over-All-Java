package org.sample;

public class Sample {
	
	public static void main(String[] args) {
		
		String a= "Mugunthan Is Selvam College Student";
		
		int length = a.length();
		System.out.println(length);
		
		char charAt = a.charAt(10);
		System.out.println(charAt);
		
		int indexOf = a.indexOf('n');
		System.out.println(indexOf);
		
		int lastIndexOf = a.lastIndexOf('n');
	   System.out.println(lastIndexOf);
	   
	   String upperCase = a.toUpperCase();
	   System.out.println(upperCase);
	   
	   String lowerCase = a.toLowerCase();
	   System.out.println(lowerCase);
	   
	   boolean empty = a.isEmpty();
	   System.out.println(empty);
	   
	   boolean startsWith = a.startsWith("Mugu");
	   System.out.println(startsWith);
	   
	   boolean endsWith = a.endsWith("Student");
	   System.out.println(endsWith);
	   
	   
	}

}
