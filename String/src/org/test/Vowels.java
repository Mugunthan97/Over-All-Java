package org.test;

public class Vowels {

	public static void main(String[] args) {
		
		String s="Welcome";
		int count=0;
		for (int i = 0; i <s.length(); i++) {
			
			char ch =s.charAt(i);
			switch(ch) 
			{ case'a':
			  case'e':
			  case'i':
			  case'o':
			  case'u': count++;
			  }
		}
System.out.println("Vowel Letter Is "+count);
	}

}
