package org.suite;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Suiteclass {
	
	@Test
	public void sample() {
		Result r = JUnitCore.runClasses(Tc1.class,Tc2.class,Tc3.class);
		
		int runCount = r.getRunCount();
		System.out.println("Run Count Is"+runCount);
		
		long runTime = r.getRunTime();
		System.out.println("Run Time Is"+runTime);
		int failureCount = r.getFailureCount();
		System.out.println(failureCount);
		
		int ignoreCount = r.getIgnoreCount();
		System.out.println(ignoreCount);
		
		List<Failure> failures = r.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
		}
	}

}
