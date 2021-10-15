package org.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class OrderId  extends BaseClass{
	
	public OrderId(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}
	

}
