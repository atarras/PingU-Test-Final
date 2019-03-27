package com.fdmgroup.testScript;

import org.openqa.selenium.WebDriver;
import com.fdmgroup.webPage.HomePage;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitionTest {

	private DriverUtilities driverUtilities = DriverUtilities.getInstanceOfDriverUtilities();
	private WebDriver driver = driverUtilities.getDriver();
	
	@When("^User enters TD bank to search box$") 
	public void searchForGroup(){
		HomePage.searchBox(driver).sendKeys(DataFile.searchGroupName);
	}
	
	@When("^User selects Group Search in the drop down$") 
	public void selectGroup(){
		HomePage.dropDownMenu(driver).click();
		HomePage.groupOption(driver).click();
	}
	
	@Then("^System should display TD Bank group$") 
    public void getGroup(){
		HomePage.searchButton(driver).click();
	}
	
	

	@When("^User enters John Doe to the search box$") 
	public void searchForUser(){
		HomePage.searchBox(driver).sendKeys(DataFile.searchUserName);
	}
	
	@When("^User selects Users Search in the drop down$") 
	public void selectUser(){
		HomePage.dropDownMenu(driver).click();
		HomePage.userOption(driver).click();
	}
	
	@Then("^System should display John Doe$") 
    public void getUser(){
		HomePage.searchButton(driver).click();
	}
	
	
	
	@When("^I click on user message$") 
	public void contactUser(){
		HomePage.oneMessageButton(driver).click();
	}
	
	@Then("^I should be able to send message to others$") 
    public void sendMessage(){
		
	}
	
}
