package org.repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class Select extends BaseClass {

	public Select(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "radiobutton_0"), @FindBy(xpath = "//input[@name='radiobutton_0']") })
	private List<WebElement> btnRadio;

	@FindAll({ @FindBy(id = "continue"), @FindBy(xpath = "//input[@name='continue']") })
	private List<WebElement> btnContinue;

	public List<WebElement> getBtnRadio() {
		return btnRadio;
	}

	public List<WebElement> getBtnContinue() {
		return btnContinue;
	}

}
