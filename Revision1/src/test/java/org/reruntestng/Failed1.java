package org.reruntestng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed1 implements IRetryAnalyzer {

	int min = 0, max = 3;

	public boolean retry(ITestResult arg0) {

		if (min < max) {
			min++;
			return true;
			
		}

		return false;
	}

}
