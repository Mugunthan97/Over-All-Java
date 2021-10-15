package org.suite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class loginFb extends BaseClass {

	public loginFb() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstname")
	private WebElement fName;

	@FindBy(name = "lastname")
	private WebElement lName;

	@FindBy(name= "reg_email__")
	private WebElement email;
	
	@FindBy(name = "reg_passwd__")
	private WebElement pass;
	
	@FindBy(name = "birthday_day")
	private WebElement date;
	
	@FindBy(name = "birthday_month")
	private WebElement month;
	
	@FindBy(name = "birthday_year")
	private WebElement year;
	
	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	@FindBy (name="sex")
	private WebElement gender;
	
	@FindBy (name="websubmit")
	private WebElement signup;

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignup() {
		return signup;
	}

	

	
	

}
