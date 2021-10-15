package org.test;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

	List<String> a=new ArrayList<>();
	
		
	a.add("ab");
	a.add("cd");
	a.add("ef");
	
	int size = a.size();
	System.out.println(size);
		
		
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		 String set = a.set(2, "MG");
		 System.out.println(a);
		 boolean containsAll = a.contains("cd");
		 System.out.println(containsAll);
	}

}
