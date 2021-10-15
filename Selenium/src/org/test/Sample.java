package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sample extends BaseClass {

	public static void main(String[] args) throws Exception {

		openbrowser();
		maximize();
		loadurl("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebElement table = driver.findElement(By.xpath("//table[@id='product' and @name='courses']"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		for (int i = 0; i <= allRows.size(); i++) {
			WebElement row = allRows.get(i);

			List<WebElement> allDatas = table.findElements(By.tagName("td"));
			for (int j = 1; j <= allDatas.size(); j++) {
				WebElement data = allDatas.get(j);
				String text = data.getText();
				System.out.println(text);
			}

		}

	}
}
