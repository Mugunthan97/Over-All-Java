package org.test;

public class Test {

	public static void main(String[] args) {
		String s="Hello";
		
		String r="";
		
		for (int i = s.length(); i>0; i--) {
			if (i==0) {
				break;
			}
			else { 
				r=r.concat(Character.toString(s.charAt(i-1)));
		}

	}
           System.out.println(r);
}
}
