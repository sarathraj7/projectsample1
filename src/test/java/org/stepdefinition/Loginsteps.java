package org.stepdefinition;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginsteps  {
	WebDriver driver;
	
	@Given("The user has to be im faebook page")
	public void the_user_has_to_be_im_faebook_page() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	}
	@When("The user has  to fill username{string} and password {string}")
	public void the_user_has_to_fill_username_and_password(String username, String password) {
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys(username);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(password);
		
		
	}

	

	@When("The user has to click the login button")
	public void the_user_has_to_click_the_login_button() {
	    WebElement UserLogin = driver.findElement(By.name("login"));
	    UserLogin.click();
	}

	@Then("The user navigate to the invalid login page")
	public void the_user_navigate_to_the_invalid_login_page() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue("Verify user in invalid page",driver.getCurrentUrl().contains("privacy_mutation_token"));
		driver.quit();
	   
	}

	

}
