package com.fdmgroup.testScript;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;
import com.fdmgroup.webPage.LogInPage;
import com.fdmgroup.webPage.NaveBarPage;
import com.fdmgroup.webPage.UserProfilePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserProfileStepDefinitionTest {
	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Given("^Click on profile icon$")
	public void profileIcon() {
		driverUtilities = DriverUtilities.getInstanceOfDriverUtilities();
        driver = driverUtilities.getDriver();
		NaveBarPage.profileIcon(driver).click();
	}
	
	@When("^Enter 'Germany' in country field$")
	public void enterCountryName() {
		UserProfilePage.countryField(driver).sendKeys("Germany");
	}
	
	@Then("^Click on submit button$")
	public void clickSubmitButton() {
		UserProfilePage.submitButton(driver).click();
	}
	
	@Then("^User should get appropriate success message$")
	public void successMessageForCountryUpdat() {
		
	}
	
	@When("^Enter 'Frankfurt' in city field$")
	public void enterCityName() {
		UserProfilePage.countryField(driver).sendKeys("Frankfurt");
	}
	
	@When("Leave country  city and phonenumber empty$")
	public void CountryAndCItyFieldEmpty() {
		
	}
	
	@Then("^User should get appropriate error message$")
	public void errorMessageForEmptyField() {
		
	}
	
	@Given("^Click on Password and security Link$")
	public void clickPasswordSecurityLink() {
		UserProfilePage.passwordSecurityLink(driver).click();
	}
	
	@When("^Enter current password$")
	public void enterCurrentPassword() {
		UserProfilePage.oldPasswordField(driver).sendKeys(DataFile.oldPassword);
	}
	
	@When("^Enter new password$")
	public void enterNewPassword() {
		UserProfilePage.newPasswordField(driver).sendKeys(DataFile.newPassword);
	}
	
	@When("^Confirm new password$")
	public void confirmNewPassword() {
		
	}
}
