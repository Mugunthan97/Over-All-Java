package org.stepdefination;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLogin extends BaseClass {

	@Given("User in amazon home page")
	public void user_in_amazon_home_page() {

		loadUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	@When("User Enter invalid {string}login id")
	public void user_Enter_invalid_login_id(String email) {
		driver.findElement(By.id("ap_email")).sendKeys(email);
	}

	@When("User enter invalid {string} password")
	public void user_enter_invalid_password(String password) {
		driver.findElement(By.id("ap_password")).sendKeys(password);
	}

	@When("User Click the continue button")
	public void user_Click_the_continue_button() throws Exception {

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement btnClick = driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
	//	js.executeScript("arguments[0].click", btnClick);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);

	}

	@Then("User close the browser")
	public void user_close_the_browser() {
		clse();
	}

}
