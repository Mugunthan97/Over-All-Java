package org.test;

public class Consonants {

	public static void main(String[] args) {
		
		String d="Welcome";
		int cn=0,v=0;
		d=d.toLowerCase();
		 int l=d.length();
		for (int i = 0; i <l; i++) {
			char c=d.charAt(i);
			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				v++;
			}
			else {
				cn++;		}
		}
		System.out.println(" Consonants Count Is "+cn);
		System.out.println(" Vowels Count Is "+v);
	}

}
