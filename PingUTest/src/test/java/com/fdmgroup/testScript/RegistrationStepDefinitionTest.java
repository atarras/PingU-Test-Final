package com.fdmgroup.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.fdmgroup.webPage.RegistrationPage;
import com.fdmgroup.util.DriverUtilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinitionTest {

	public static WebDriver driver;

	
	@Given("^User open browser and go to pingu, I open pingu sign up page$")
	public void openSignUpPage() throws InterruptedException {
		
		driver = DriverUtilities.getInstanceOfDriverUtilities().getDriver();
		driver.get("http://localhost:8088/PingU/login"); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#signup']")).click();  
		Thread.sleep(1000);
		
	}
	
	@When("^User enter FDM email$") 
	public void enterWithValidEmail() throws InterruptedException{
	
        RegistrationPage.firstNameBox(driver).sendKeys("John"); 
		RegistrationPage.lastNameBox(driver).sendKeys("Doe");
		RegistrationPage.usernameBox(driver).sendKeys("jdoe");
		RegistrationPage.passwordBox(driver).sendKeys("Pass123");
		RegistrationPage.confirmPpasswordBox(driver).sendKeys("Pass123");
		RegistrationPage.emailBox(driver).sendKeys("j.d@fdmgroup.com");
		RegistrationPage.cityBox(driver).sendKeys("toronto");
		RegistrationPage.countryBox(driver).sendKeys("canada");
		RegistrationPage.secuAnswer(driver).sendKeys("saint john");
		RegistrationPage.linkedInBox(driver).sendKeys("www.linkedin/jdoe");
		RegistrationPage.streamBox(driver).sendKeys("java developer");
		
	}
	
	@Then("^User should successfully register$")
	public void successfullRigister() throws InterruptedException{
		RegistrationPage.signUpButton(driver).click();
		Thread.sleep(2000);
	}
	
	@When("^User enter non FDM email$")
	public void enterWithInvalidEmail(){
		
		RegistrationPage.firstNameBox(driver).sendKeys("John");
		RegistrationPage.lastNameBox(driver).sendKeys("Doe");
		RegistrationPage.usernameBox(driver).sendKeys("jdoee");
		RegistrationPage.passwordBox(driver).sendKeys("Pass123");
		RegistrationPage.confirmPpasswordBox(driver).sendKeys("Pass123");
		RegistrationPage.emailBox(driver).sendKeys("j.d@test.com");
		RegistrationPage.cityBox(driver).sendKeys("toronto");
		RegistrationPage.countryBox(driver).sendKeys("canada");
		RegistrationPage.secuAnswer(driver).sendKeys("saint john");
		RegistrationPage.linkedInBox(driver).sendKeys("www.linkedin/jdoe");
		RegistrationPage.streamBox(driver).sendKeys("java developer");
	}
	
	
	@Then("^User fail to register with invalid email$")
	public void failRigister() throws InterruptedException{
		RegistrationPage.signUpButton(driver).click();
		Thread.sleep(2000);
	}
	
	@When("^User enter jdoe to username field$")
	public void enterDuplicateUsername(){
		
		RegistrationPage.firstNameBox(driver).sendKeys("John");
		RegistrationPage.lastNameBox(driver).sendKeys("Doe");
		RegistrationPage.usernameBox(driver).sendKeys("jdoe");
		RegistrationPage.passwordBox(driver).sendKeys("Pass123");
		RegistrationPage.confirmPpasswordBox(driver).sendKeys("Pass123");
		RegistrationPage.emailBox(driver).sendKeys("j.d@fdmgroup.com");
		RegistrationPage.cityBox(driver).sendKeys("toronto");
		RegistrationPage.countryBox(driver).sendKeys("canada");
		RegistrationPage.secuAnswer(driver).sendKeys("saint john");
		RegistrationPage.linkedInBox(driver).sendKeys("www.linkedin/jdoe");
		RegistrationPage.streamBox(driver).sendKeys("java developer");
	}
	
	@Then("^User fail to register with duplicate username$")
	public void failUsername() throws InterruptedException{
		RegistrationPage.signUpButton(driver).click();
		Thread.sleep(2000);
	}

}
