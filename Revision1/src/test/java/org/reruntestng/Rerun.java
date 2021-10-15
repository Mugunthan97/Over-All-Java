package org.reruntestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun {

	@Test
	private void tc1() {
		System.out.println("Test case 1");
	}
	
	@Test
	private void tc2() {
		System.out.println("Test case 2");
		Assert.assertTrue(false);
	}
	
	@Test
	private void tc3() {
		System.out.println("Test case 3");
	}
	
	@Test
	private void tc4() {
		System.out.println("Test case 4");
	}

}
