package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClasss;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pojo.AdactinHotel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepDefintion extends BaseClasss {
//
//	@Given("User is in adactin login page")
//	public void userIsInAdactinLoginPage() {
//		LaunchUrl("http://adactinhotelapp.com/");
//
//	}
//
//	@When("User enter valid username and valid password")
//	public void userEnterValidUsernameAndValidPassword(DataTable d){
//	    List<List<String>> a = d.asLists();
//	    List<String> a1 = a.get(0);
//	    String username = a1.get(0);
//	    List<String> a2 = a.get(0);
//	    String password = a1.get(1);
//	    AdactinHotel h=new AdactinHotel();
//	    toPassValue(h.getUsername(),username );
//	    toPassValue(h.getPassword(),password );
//
//	}
//
//	@When("User click login button")
//	public void userClickLoginButton() throws InterruptedException {
//		AdactinHotel h2 = new AdactinHotel();
//		toClick(h2.getLogin());
//		Thread.sleep(3000);
//	}
//
//	@When("User select Location,Hotels,Room Type and Number of rooms")
//	public void userSelectLocationHotelsRoomTypeAndNumberOfRooms() throws Exception {
//		AdactinHotel h=new AdactinHotel();		
//		toSelectByValue(h.getLocation(),excelRead(1,4));
//		toSelectByValue(h.getHotel(),excelRead(1,5));
//		toSelectByValue(h.getRoomType(),excelRead(1,6));
//		toSelectByIndex(h.getRoom(),1);
//
//	}
//
//	@When("User select Check In Date,Check out Date,Adults per Room and Children per Room")
//	public void userSelectCheckInDateCheckOutDateAdultsPerRoomAndChildrenPerRoom(DataTable d) {
//		AdactinHotel h=new AdactinHotel();		
//        List<String> a = d.asList();
//	    String checkin = a.get(0);
//	    String checkout = a.get(1);
//	    toPassValue(h.getDatepickIn(), checkin);
//	    toPassValue(h.getDatepickIn(), checkout);
//	    toSelectByIndex(h.getAdult(), 1);
//     	toSelectByIndex(h.getChildrenRoom(), 1);
//
//	}
//
//	@When("User click Search button")
//	public void userClickSearchButton() {
//		AdactinHotel h7 = new AdactinHotel();
//     	toClick(h7.getSubmit());
//	}
//
//	@When("User select radio button and click the continue button")
//	public void userSelectRadioButtonAndClickTheContinueButton() throws InterruptedException {
//		AdactinHotel h8 = new AdactinHotel();
//     	toClick(h8.getRadio());
//        toClick(h8.getContinue1());
//        impwait();
//        toPageDown(driver,h8.getScrollfirstName());
//	}
//
//	@When("User enter First Name and Last Name,Billing Address and Credit Card No")
//	public void userEnterFirstNameAndLastNameBillingAddressAndCreditCardNo() {
//		AdactinHotel h9 = new AdactinHotel();
//		WebElement firstName = h9.getFirstName();
//		toPassValue(firstName, "preethi");
//		toPassValue(h9.getLastName(), "Nagarajan");
//		toPassValue(h9.getAddress(), "Krishnagiri");
//		toPassValue(h9.getCcNum(), "1234567890123456");
//       
//	}
//
//	@When("User select Credit Card Type and Expiry Date,CVV Number and click Book Now button")
//	public void userSelectCreditCardTypeAndExpiryDateCVVNumberAndClickBookNowButton() {
//		AdactinHotel h9 = new AdactinHotel();
//		 toSelectByIndex(h9.getCcType(), 1);
//			toSelectByIndex(h9.getCcMonth(), 3);
//			toSelectByIndex(h9.getCcYear(), 4);
//			toPassValue(h9.getCvv(), "4567");
//		    toClick(h9.getBook());
//			impwait();
//}
//
//	@Then("User must be in booking confirmation page")
//	public void userMustBeInBookingConfirmationPage() {
//		AdactinHotel h13 = new AdactinHotel();
//	    validpage(h13.getLogout());
//		System.out.println("User is in booking confirmation page");
//
//	}
//
////	@When("User select Check In Date,Check out Date,Adults per Room and Children per Room")
////	public void userSelectCheckInDateCheckOutDateAdultsPerRoomAndChildrenPerRoom() {
////	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
////	}
////
////	@When("User enter First Name and Last Name,Billing Address and Credit Card No")
////	public void userEnterFirstNameAndLastNameBillingAddressAndCreditCardNo(io.cucumber.datatable.DataTable dataTable) {
////	    // Write code here that turns the phrase above into concrete actions
////	    // For automatic transformation, change DataTable to one of
////	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
////	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
////	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
////	    //
////	    // For other transformations you can register a DataTableType.
////	    throw new cucumber.api.PendingException();
////	}
////
////	@Then("User should be in booking confirmation page")
////	public void userShouldBeInBookingConfirmationPage() {
////	    // Write code here that turns the phrase above into concrete actions
////	    throw new cucumber.api.PendingException();
////	}
////-------------------------------------------------------------------------
//}
////	@Given("User is in adactin login page")
////	public void user_is_in_adactin_login_page() {
////		LaunchUrl("http://adactinhotelapp.com/");
////	}
////
////	@When("User enter valid username and valid password")
////	public void user_enter_valid_username_and_valid_password() {
////		AdactinHotel  h = new AdactinHotel();
////		toPassValue(h.getUsername(), "preethi0000");
////		toPassValue(h.getPassword(), "123456789");
////	}
////
////	@When("User click login button")
////	public void user_click_login_button() {
////		AdactinHotel h2 = new AdactinHotel();
////		toClick(h2.getLogin());
////	}
////
////	@When("User select Location,Hotels,Room Type and Number of rooms")
////	public void user_select_Location_Hotels_Room_Type_and_Number_of_rooms() {
////		AdactinHotel h3 = new AdactinHotel();
////		toSelectByValue(h3.getLocation(), "New York");
////	    toSelectByValue(h3.getHotel(), "Hotel Sunshine");
////    	toSelectByValue(h3.getRoomType(), "Standard");
////		toSelectByIndex(h3.getRoom(), 2);
////
////	}
////
////	@When("User select Check In Date,Check out Date,Adults per Room and Children per Room")
////	public void user_select_Check_In_Date_Check_out_Date_Adults_per_Room_and_Children_per_Room() {
////		AdactinHotel h5 = new AdactinHotel();
////    	toPassValue(h5.getDatepickIn(), "18/06/2021");
////		toPassValue(h5.getDatepickOut(), "19/06/2021");
////		toSelectByIndex(h5.getAdult(), 1);
//// 		toSelectByIndex(h5.getChildrenRoom(), 1);
////	}
////
////	@When("User click Search button")
////	public void user_click_Search_button() {
////		AdactinHotel h7 = new AdactinHotel();
////		toClick(h7.getSubmit());
////	}
////
////	@Then("User must be in Select hotel page")
////	public void user_must_be_in_Select_hotel_page() {
////		String url = ToGetCurrentUrl();
////		System.out.println(url);
////		if(url.contains("SelectHotel")) {
////			System.out.println("User is in Select page");
////		}
////	}
////	@When("User select radio button and click the continue button")
////	public void user_select_radio_button_and_click_the_continue_button() {
////		AdactinHotel h8 = new AdactinHotel();
////		toClick(h8.getRadio());
////		toClick(h8.getContinue1());
////	}
////
////	@Then("User must be in Book Hotel page")
////	public void user_must_be_in_Book_Hotel_page() {
////	   String url = ToGetCurrentUrl();
////	   Assert.assertTrue(url.contains("BookHotel"));
////	   System.out.println("User is in Book Hotel page");
////	}
////
////	@When("User enter First Name and Last Name,Billing Address and Credit Card No")
////	public void user_enter_First_Name_and_Last_Name_Billing_Address_and_Credit_Card_No() {
////		AdactinHotel h9 = new AdactinHotel();
////  		toPassValue(h9.getFirstName(), "preethi");
////	    toPassValue(h9.getLastName(), "Nagarajan");
////        toPassValue(h9.getAddress(), "krishnagiri");
////		toPassValue(h9.getCcNum(), "1234567893456789");
////	}
////
////	@When("User select Credit Card Type and Expiry Date,CVV Number and click Book Now button")
////	public void user_select_Credit_Card_Type_and_Expiry_Date_CVV_Number_and_click_Book_Now_button() {
////		AdactinHotel h9 = new AdactinHotel();
////		toPassValue(h9.getFirstName(), "preethi");
////	    toPassValue(h9.getLastName(), "Nagarajan");
////		toPassValue(h9.getAddress(), "krishnagiri");
////		toPassValue(h9.getCcNum(), "1234567893456789");
////        toSelectByIndex(h9.getCcType(), 1);
////		toSelectByIndex(h9.getCcMonth(), 3);
////		toSelectByIndex(h9.getCcYear(), 4);
////		toPassValue(h9.getCvv(), "4567");
////		toClick(h9.getBook());
////		impwait();
////	}
////
////	@Then("User must be in booking confirmation page")
////	public void user_must_be_in_booking_confirmation_page() {
////		AdactinHotel h13 = new AdactinHotel();
////	    validpage(h13.getLogout());
//// 		System.out.println("User is in booking confirmation page");
////	}
////
}