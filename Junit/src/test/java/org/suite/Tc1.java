package org.suite;

import org.junit.Test;
import org.repository.Login;
import org.sample.BaseClass;

public class Tc1 extends BaseClass {
	
	@Test
	public void tcl1() throws Exception {
		openBroswer();
		broswerMaximize();
		openUrl("https://adactinhotelapp.com/");
		
		Login l=new Login();
		fill(l.getUser().get(0), excelRead(1, 0));
		fill(l.getPass().get(0), excelRead(1, 1));
		btnClick(l.getBtnLogin().get(0));
		
	}

}
