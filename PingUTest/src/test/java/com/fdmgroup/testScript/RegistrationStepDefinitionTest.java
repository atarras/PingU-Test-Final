package com.fdmgroup.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.fdmgroup.webPage.RegistrationPage;
import com.fdmgroup.testData.DataFile;
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
	
        RegistrationPage.firstNameBox(driver).sendKeys(DataFile.firstName); 
		RegistrationPage.lastNameBox(driver).sendKeys(DataFile.lastName);
		RegistrationPage.usernameBox(driver).sendKeys(DataFile.signUpUserName);
		RegistrationPage.passwordBox(driver).sendKeys(DataFile.signUpPassword);
		RegistrationPage.confirmPpasswordBox(driver).sendKeys(DataFile.confirmPassword);
		RegistrationPage.emailBox(driver).sendKeys(DataFile.signUpEmail);
		RegistrationPage.cityBox(driver).sendKeys(DataFile.city);
		RegistrationPage.countryBox(driver).sendKeys(DataFile.country);
		RegistrationPage.secuAnswer(driver).sendKeys(DataFile.secuAnswer);
		RegistrationPage.linkedInBox(driver).sendKeys(DataFile.linkedInUrl);
		RegistrationPage.streamBox(driver).sendKeys(DataFile.stream);
		
	}
	
	@Then("^User should successfully register$")
	public void successfullRigister() throws InterruptedException{
		RegistrationPage.signUpButton(driver).click();
		Thread.sleep(2000);
	}
	
	@When("^User enter non FDM email$")
	public void enterWithInvalidEmail(){
		
		RegistrationPage.firstNameBox(driver).sendKeys(DataFile.firstName);
		RegistrationPage.lastNameBox(driver).sendKeys(DataFile.lastName);
		RegistrationPage.usernameBox(driver).sendKeys(DataFile.signUpUserNameSecond);
		RegistrationPage.passwordBox(driver).sendKeys(DataFile.signUpPassword);
		RegistrationPage.confirmPpasswordBox(driver).sendKeys(DataFile.confirmPassword);
		RegistrationPage.emailBox(driver).sendKeys(DataFile.signUpInvalidEmail);
		RegistrationPage.cityBox(driver).sendKeys(DataFile.city);
		RegistrationPage.countryBox(driver).sendKeys(DataFile.country);
		RegistrationPage.secuAnswer(driver).sendKeys(DataFile.secuAnswer);
		RegistrationPage.linkedInBox(driver).sendKeys(DataFile.linkedInUrl);
		RegistrationPage.streamBox(driver).sendKeys(DataFile.stream);
	}
	
	
	@Then("^User fail to register with invalid email$")
	public void failRigister() throws InterruptedException{
		RegistrationPage.signUpButton(driver).click();
		Thread.sleep(2000);
	}
	
	@When("^User enter jdoe to username field$")
	public void enterDuplicateUsername(){
		
		RegistrationPage.firstNameBox(driver).sendKeys(DataFile.firstName);
		RegistrationPage.lastNameBox(driver).sendKeys(DataFile.lastName);
		RegistrationPage.usernameBox(driver).sendKeys(DataFile.signUpUserName);
		RegistrationPage.passwordBox(driver).sendKeys(DataFile.signUpPassword);
		RegistrationPage.confirmPpasswordBox(driver).sendKeys(DataFile.confirmPassword);
		RegistrationPage.emailBox(driver).sendKeys(DataFile.signUpEmail);
		RegistrationPage.cityBox(driver).sendKeys(DataFile.city);
		RegistrationPage.countryBox(driver).sendKeys(DataFile.country);
		RegistrationPage.secuAnswer(driver).sendKeys(DataFile.secuAnswer);
		RegistrationPage.linkedInBox(driver).sendKeys(DataFile.linkedInUrl);
		RegistrationPage.streamBox(driver).sendKeys(DataFile.stream);
	}
	
	@Then("^User fail to register with duplicate username$")
	public void failUsername() throws InterruptedException{
		RegistrationPage.signUpButton(driver).click();
		Thread.sleep(2000);
	}

}
