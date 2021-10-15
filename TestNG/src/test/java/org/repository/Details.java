package org.repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class Details extends BaseClass {
	
	public Details(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(id="first_name"),
		@FindBy(xpath="//input[@name='first_name']")
	})
	private List<WebElement> nameFirst;
	
	@FindAll({
		@FindBy(id="last_name"),
		@FindBy(xpath="//input[@name='last_name']")
	})
	private List<WebElement> nameLast;
	
	@FindAll({
		@FindBy(id="address"),
		@FindBy(xpath="//textarea[@name='address']")
	})
	private List<WebElement> address;
	
	@FindAll({
		@FindBy(id="cc_num"),
		@FindBy(xpath="//input[@name='cc_num']")
	})
	private List<WebElement> cardNo;
	
	@FindAll({
		@FindBy(id="cc_type"),
		@FindBy(xpath="//select[@name='cc_type']")
	})
	private List<WebElement> cardType;
	
	@FindAll({
		@FindBy(id="cc_exp_month"),
		@FindBy(xpath="//select[@name='cc_exp_month']")
	})
	private List<WebElement> exMonth;
	
	@FindAll({
		@FindBy(id="cc_exp_year"),
		@FindBy(xpath="//select[@name='cc_exp_year']")
	})
	private List<WebElement> exYear;
	
	@FindAll({
		@FindBy(id="cc_cvv"),
		@FindBy(xpath="//input[@name='cc_cvv']")
	})
	private List<WebElement> cvv;
	
	@FindAll({
		@FindBy(id="book_now"),
		@FindBy(xpath="//input[@name='book_now']")
	})
	private List<WebElement> btnSubmit;

	public List<WebElement> getNameFirst() {
		return nameFirst;
	}

	public List<WebElement> getNameLast() {
		return nameLast;
	}

	public List<WebElement> getAddress() {
		return address;
	}

	public List<WebElement> getCardNo() {
		return cardNo;
	}

	public List<WebElement> getCardType() {
		return cardType;
	}

	public List<WebElement> getExMonth() {
		return exMonth;
	}

	public List<WebElement> getExYear() {
		return exYear;
	}

	public List<WebElement> getCvv() {
		return cvv;
	}

	public List<WebElement> getBtnSubmit() {
		return btnSubmit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
