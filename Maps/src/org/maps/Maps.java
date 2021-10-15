package org.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Maps {
	
	public static void main(String[] args) {
//Task 5.4
		Map<String, String> mp=new Hashtable<>();
		
		mp.put("Vel", "Selenium");
		mp.put("Ganesh", "FrameWork");
		mp.put("Dinesh", "Oracle");
		mp.put("Vengat", "CoreJava");
		mp.put("Subash", "Jira");
		
		Set<Entry<String,String>> entrySet = mp.entrySet();
		
		for (Entry<String, String> b : entrySet) {
			System.out.println("Key Is : "+b.getKey());
			System.out.println("Value Is : "+b.getValue());
			
		}
		
	
/*Task 5.3
		Map<String, Integer> mp = new TreeMap<>();
		
		mp.put("!", 10);
		mp.put("@", 20);
		mp.put("#", 30);
		mp.put("$", 40);
		mp.put("%", 50);
		mp.put("^", 60);
		mp.put("&", 10);
		mp.put("*", 50);
		mp.put("(", 40);
		
		Set<Entry<String,Integer>> entrySet = mp.entrySet();
		
		for (Entry<String, Integer> a : entrySet) {
			System.out.println("Key Is : "+a.getKey());
			System.out.println("Value Is : "+a.getValue());
		}
		
		
/*Task 5.2
		Map<Integer, Integer> mp=new LinkedHashMap<Integer, Integer>() ;
		
		mp.put(10,10 );
		mp.put(20,20);
		mp.put(30,30);
		mp.put(40,40);
		mp.put(50,50);
		mp.put(60,60);
		mp.put(10,10);
		mp.put(50,50);
		mp.put(40,40);
		Set<Entry<Integer, Integer>> y = mp.entrySet();
		
		for (Entry<Integer, Integer> r : y) {
			System.out.println("Key Is : "+r.getKey());
			System.out.println("Value Is : "+r.getValue()
			);
		}
		
	
/*Task 5.1	
	Map<Integer,String> mp=new HashMap<Integer, String>();
		
		mp.put(10, "Java");
		mp.put(20, "sql");
		mp.put(30, "oops");
		mp.put(40, "sql");
		mp.put(50, "oracle");
		mp.put(60, "DB");
		mp.put(10, "selenium");
		mp.put(50, "psql");
		mp.put(40, "Hadoop");
		
		
		Set<Integer> keySet = mp.keySet();
		
		
		Collection<String> values = mp.values();
		
		Set<Entry<Integer,String>> entrySet = mp.entrySet();
		for (Entry<Integer, String> x : entrySet) {
			System.out.println("Key Is : "+x.getKey());
			System.out.println("Value Is : "+x.getValue());
		}
		
		
		
	

		
/*Task 4.4
		Map<String, String> mp=new Hashtable<>();
		
		mp.put("Vel", "Selenium");
		mp.put("Ganesh", "FrameWork");
		mp.put("Dinesh", "Oracle");
		mp.put("Vengat", "CoreJava");
		mp.put("Subash", "Jira");
		
		Set<String> keySet = mp.keySet();
		
		for (String g : keySet) {
			System.out.println(g);
		}
	
	
/*Task 4.3
		Map<String, Integer> mp = new TreeMap<>();
		
		mp.put("!", 10);
		mp.put("@", 20);
		mp.put("#", 30);
		mp.put("$", 40);
		mp.put("%", 50);
		mp.put("^", 60);
		mp.put("&", 10);
		mp.put("*", 50);
		mp.put("(", 40);
		
		Set<String> keySet = mp.keySet();
		for (String a : keySet) {
			System.out.println(a);
			
		}
	
		
/*Task 4.2
		Map<Integer, Integer> mp=new LinkedHashMap<Integer, Integer>() ;
		
		mp.put(10,10 );
		mp.put(20,20);
		mp.put(30,30);
		mp.put(40,40);
		mp.put(50,50);
		mp.put(60,60);
		mp.put(10,10);
		mp.put(50,50);
		mp.put(40,40);
		
		Set<Integer> keySet = mp.keySet();
		
		for (Integer r : keySet) {
			System.out.println(r);
			
		}
	
		
/*Task 4.1
	Map<Integer,String> mp=new HashMap<Integer, String>();
		
		mp.put(10, "Java");
		mp.put(20, "sql");
		mp.put(30, "oops");
		mp.put(40, "sql");
		mp.put(50, "oracle");
		mp.put(60, "DB");
		mp.put(10, "selenium");
		mp.put(50, "psql");
		mp.put(40, "Hadoop");
		
		
		Set<Integer> keySet = mp.keySet();
		
		for (Integer x : keySet) {
			System.out.println(x);
		}
		
	
/*Task 3.4
		Map<String, String> mp=new Hashtable<>();
		
		mp.put("Vel", "Selenium");
		mp.put("Ganesh", "FrameWork");
		mp.put("Dinesh", "Oracle");
		mp.put("Vengat", "CoreJava");
		mp.put("Subash", "Jira");
		
		Collection<String> values = mp.values();
		System.out.println(values);
	
	
/* Task 3.3
		Map<String, Integer> mp = new TreeMap<>();
		
		mp.put("!", 10);
		mp.put("@", 20);
		mp.put("#", 30);
		mp.put("$", 40);
		mp.put("%", 50);
		mp.put("^", 60);
		mp.put("&", 10);
		mp.put("*", 50);
		mp.put("(", 40);
		Collection<Integer> values = mp.values();
		System.out.println(values);
		
		
/* task 3.2
		Map<Integer, Integer> mp=new LinkedHashMap<Integer, Integer>() ;
		
		mp.put(10,10 );
		mp.put(20,20);
		mp.put(30,30);
		mp.put(40,40);
		mp.put(50,50);
		mp.put(60,60);
		mp.put(10,10);
		mp.put(50,50);
		mp.put(40,40);
		
		Collection<Integer> values = mp.values();
		System.out.println(values);
		
	
	/*Task 3.1
		Map<Integer,String> mp=new HashMap<Integer, String>();
		
		mp.put(10, "Java");
		mp.put(20, "sql");
		mp.put(30, "oops");
		mp.put(40, "sql");
		mp.put(50, "oracle");
		mp.put(60, "DB");
		mp.put(10, "selenium");
		mp.put(50, "psql");
		mp.put(40, "Hadoop");
		
		Collection<String> values = mp.values();
		System.out.println(values);
		
/* Task 2.4
	Map<String, String> mp=new Hashtable<>();
		
		mp.put("Vel", "Selenium");
		mp.put("Ganesh", "FrameWork");
		mp.put("Dinesh", "Oracle");
		mp.put("Vengat", "CoreJava");
		mp.put("Subash", "Jira");
		
		Set<String> keySet = mp.keySet();
		System.out.println(keySet);
		
		
/*Task 2.3
	Map<String, Integer> mp = new TreeMap<>();
		
		mp.put("!", 10);
		mp.put("@", 20);
		mp.put("#", 30);
		mp.put("$", 40);
		mp.put("%", 50);
		mp.put("^", 60);
		mp.put("&", 10);
		mp.put("*", 50);
		mp.put("(", 40);
		
		Set<String> print = mp.keySet();
		System.out.println(print);
	
	
/*Task 2.2
		Map<Integer, Integer> mp=new LinkedHashMap<Integer, Integer>() ;
		
		mp.put(10,10 );
		mp.put(20,20);
		mp.put(30,30);
		mp.put(40,40);
		mp.put(50,50);
		mp.put(60,60);
		mp.put(10,10);
		mp.put(50,50);
		mp.put(40,40);
		
		Set<Integer> keys = mp.keySet();
		System.out.println(keys);
		
/*Task-2.1	
		Map<Integer,String> mp=new HashMap<Integer, String>();
		
		mp.put(10, "Java");
		mp.put(20, "sql");
		mp.put(30, "oops");
		mp.put(40, "sql");
		mp.put(50, "oracle");
		mp.put(60, "DB");
		mp.put(10, "selenium");
		mp.put(50, "psql");
		mp.put(40, "Hadoop");
		
		Set<Integer> keys = mp.keySet();
		System.out.println(keys);
		
/*Task 1.4
		Map<String, String> mp=new Hashtable<>();
		
		mp.put("Vel", "Selenium");
		mp.put("Ganesh", "FrameWork");
		mp.put("Dinesh", "Oracle");
		mp.put("Vengat", "CoreJava");
		mp.put("Subash", "Jira");
		
		System.out.println(mp);
		
			
/*Task 1.3	
		Map<String, Integer> mp = new TreeMap<>();
		
		mp.put("!", 10);
		mp.put("@", 20);
		mp.put("#", 30);
		mp.put("$", 40);
		mp.put("%", 50);
		mp.put("^", 60);
		mp.put("&", 10);
		mp.put("*", 50);
		mp.put("(", 40);
		
		System.out.println(mp);
		
	
		
/*Task 1.2	
		Map<Integer, Integer> mp=new LinkedHashMap<Integer, Integer>() ;
		
		mp.put(10,10 );
		mp.put(20,20);
		mp.put(30,30);
		mp.put(40,40);
		mp.put(50,50);
		mp.put(60,60);
		mp.put(10,10);
		mp.put(50,50);
		mp.put(40,40);

	System.out.println(mp);
*/		
		
		
	}

}
