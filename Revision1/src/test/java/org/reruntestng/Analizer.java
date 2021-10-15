package org.reruntestng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Analizer implements IAnnotationTransformer{

	public void transform(ITestAnnotation r, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer rz = r.getRetryAnalyzer();
		
		if (rz==null) {
			r.setRetryAnalyzer(Failed1.class);
		}
		
	}

}
