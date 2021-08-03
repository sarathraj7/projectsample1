package org.pojo;

import org.baseclass.BaseClasss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotel extends BaseClasss{
	
	public AdactinHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	

	@FindBy(id="login")
	private WebElement login;


	@FindBy(id="location")
	private WebElement location;

	@FindBy(id="hotels")
	private WebElement hotel;
	
	//@FindBy(//select[@name='room_type'])
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
    @FindBy(id="room_nos")
	private WebElement room;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement datepickIn;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement datepickOut;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement childrenRoom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement continue1;
	
	@FindBy(xpath="//a[contains(text(),'Adactin')]")
	private WebElement scrollfirstName;
	
	public WebElement getScrollfirstName() {
		return scrollfirstName;
	}


	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccNum;
	
	@FindBy(id="cc_type")
	private WebElement ccType;
	
	@FindBy(name="cc_exp_month")
	private WebElement ccMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement ccYear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement scroll;
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement fetch;
	
	@FindBy(xpath="//b[contains(text(),'Invalid Login details')]")
	private WebElement errorPage;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getErrorPage() {
		return errorPage;
	}

	public WebElement getScroll() {
		return scroll;
	}
	
	public WebElement getFetch() {
		return fetch;
	}
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getDatepickIn() {
		return datepickIn;
	}

	public WebElement getDatepickOut() {
		return datepickOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildrenRoom() {
		return childrenRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	


}
