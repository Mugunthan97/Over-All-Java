package org.run;

public class Test extends Sample {

	@Override
	public void empid() {
		System.out.println("Employee Id 123");
		
	}

	@Override
	public void savings() {
		System.out.println("Savings 10%");
		
	}
	public static void main(String[] args) {
		
		Test t=new Test();
				
		t.empid();
		t.savings();
		
	}

}
