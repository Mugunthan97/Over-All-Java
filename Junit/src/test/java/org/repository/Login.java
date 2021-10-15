package org.repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class Login extends BaseClass {
	
	public Login() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBys({
		@FindBy(xpath="//input[@id='username']"),
		@FindBy(xpath="//input[@name='username']")
	})
	private List<WebElement> user;

	@FindBys({
		@FindBy(id="password"),
		@FindBy(xpath="//input[@name='password']")
	})
	private List<WebElement> pass;
	
	@FindBys({
		@FindBy(id="login"),
		@FindBy(xpath="//input[@name='login']")
	})
	private List<WebElement> btnLogin;

	public List<WebElement> getUser() {
		return user;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public List<WebElement> getBtnLogin() {
		return btnLogin;
	}
	
	

}
