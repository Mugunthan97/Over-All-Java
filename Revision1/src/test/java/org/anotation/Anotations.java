package org.anotation;

import org.testng.annotations.Test;

public class Anotations {

	@Test(priority=1)
	private void tcl() {
		System.out.println("Test case 1");
	}
	
	@Test(priority=4,invocationCount=3)
	private void tc5() {
		System.out.println("Test case 5>>>>4");
	}
	
	@Test(enabled=false)
	private void tc4() {
		System.out.println("Test case 4");
	}
	
	@Test
	private void tc2() {
		System.out.println("Test case 2");
	}
	
	@Test
	private void tc3() {
		System.out.println("Test case 3");
	}
	
	@Test
	private void tc6() {
		System.out.println("Test case 6");
	}
}
