package org.repository;

import java.util.List;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Fblogin extends BaseClass {

	public Fblogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(id = "email"), @FindBy(xpath = "//input[@name='email']") })
	private List<WebElement> txtemail;

	@FindBys({@FindBy(id = "pass"), @FindBy(xpath = "//input[@name='pass']") })
	private List<WebElement> txtpass;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	public List<WebElement> getTxtemail() {
		return txtemail;
	}

	public void setTxtemail(List<WebElement> txtemail) {
		this.txtemail = txtemail;
	}

	public List<WebElement> getTxtpass() {
		return txtpass;
	}

	public void setTxtpass(List<WebElement> txtpass) {
		this.txtpass = txtpass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
}
