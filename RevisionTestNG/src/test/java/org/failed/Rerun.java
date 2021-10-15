package org.failed;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun {


	@Test
	private void tc1() {
		System.out.println("1");
	}
	
	@Test
	private void tc2() {
		System.out.println("2");
	}
	
	@Test
	private void tc3() {
		System.out.println("3");
		Assert.assertTrue(false);
	}
	
	@Test
	private void tc4() {
		System.out.println("4");
	}
	
	

}
