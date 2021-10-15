package org.suite;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.sample.BaseClass;

@RunWith(Suite.class)
@SuiteClasses({Tc1.class,Tc2.class,Tc3.class})
public class Run extends BaseClass {
	
}
