package org.repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class Search extends BaseClass {
	
	public Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({
		@FindBy(id="location"),
		@FindBy(xpath="//select[@name='location']")
	})
	private List<WebElement> location;
	
	
	@FindBys({
		@FindBy(id="hotels"),
		@FindBy(xpath="//select[@name='hotels']")
	})
	private List<WebElement> hotel;
	
	@FindBys({
		@FindBy(id="room_type"),
		@FindBy(xpath="//select[@name='room_type']")
	})
	private List<WebElement> roomType;
	
	@FindBys({
		@FindBy(id="room_nos"),
		@FindBy(xpath="//select[@name='room_nos']")
	})
	private List<WebElement> noOfRoom;
	
	@FindBys({
		@FindBy(id="datepick_in"),
		@FindBy(xpath="//input[@name='datepick_in']")
	})
	private List<WebElement> checkIn;
	
	@FindBys({
		@FindBy(id="datepick_out"),
		@FindBy(xpath="//input[@name='datepick_out']")
	})
	private List<WebElement> checkOut;
	
	@FindBys({
		@FindBy(id="adult_room"),
		@FindBy(xpath="//select[@name='adult_room']")
	})
	private List<WebElement> adults;
	
	@FindBys({
		@FindBy(id="child_room"),
		@FindBy(xpath="//select[@name='child_room']")
	})
	private List<WebElement> child;
	
	@FindBys({
		@FindBy(id="Submit"),
		@FindBy(xpath="//input[@name='Submit']")
	})
	private List<WebElement> btnSubmit;
	
	public List<WebElement> getLocation() {
		return location;
	}

	public List<WebElement> getHotel() {
		return hotel;
	}

	public List<WebElement> getRoomType() {
		return roomType;
	}

	public List<WebElement> getNoOfRoom() {
		return noOfRoom;
	}

	public List<WebElement> getCheckIn() {
		return checkIn;
	}

	public List<WebElement> getCheckOut() {
		return checkOut;
	}

	public List<WebElement> getAdults() {
		return adults;
	}

	public List<WebElement> getChild() {
		return child;
	}

	public List<WebElement> getBtnSubmit() {
		return btnSubmit;
	}



}
