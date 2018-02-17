package com.spr.MSRTCTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Annonation {
	WebDriver driver = null;

	@Given("^I am on MSRTC login page$")
	public void goToFacebook() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://public.msrtcors.com/");
	}

	@When("^I enter username as \"(.*)\"$")
	public void enterUsername(String arg1) {
		// driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.name("username")).sendKeys(arg1);
	}

	@When("^I enter password as \"(.*)\"$")
	public void enterPassword(String arg1) throws InterruptedException {
		// driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.name("pwd")).sendKeys(arg1);
		
	}

	@When("^I enter captcha as \"(.*)\"$")
	public void enterCaptcha(String arg1) {
		// driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.name("security")).sendKeys(arg1);
		driver.findElement(By.name("login12")).click(); 
	}

	@Then("^Login should fail$")
	public void checkFail() throws InterruptedException {
			Thread.sleep(20000);
		if (driver.getCurrentUrl().equalsIgnoreCase("https://public.msrtcors.com/ticket_booking/index.php?msg=4")) {
			System.out.println("Test1 Pass");
		} else {
			System.out.println("Test1 Failed");
		}
		driver.close();
	}
}
