package org.repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class Login extends BaseClass {

	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(id = "username"), @FindBy(xpath = "//input[@name='username']") })
	private List<WebElement> txtuser;

	@FindBys({ @FindBy(id = "password"), @FindBy(xpath = "//input[@name='password']") })
	private List<WebElement> txtpass;

	@FindBys({ @FindBy(id = "login"), @FindBy(xpath = "//input[@name='login']") })
	private List<WebElement> btnSubmit;

	public List<WebElement> getTxtuser() {
		return txtuser;
	}

	public List<WebElement> getTxtpass() {
		return txtpass;
	}

	public List<WebElement> getBtnSubmit() {
		return btnSubmit;
	}
}
