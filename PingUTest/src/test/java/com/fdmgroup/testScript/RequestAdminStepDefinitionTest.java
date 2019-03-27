package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;
import com.fdmgroup.webPage.HomePage;
import com.fdmgroup.webPage.LogInPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RequestAdminStepDefinitionTest {

	public static WebDriver driver;
	
	@When("^Admin receives a new sign up request$")
	public void receiveSignUpRequest() throws InterruptedException{
		
		Thread.sleep(2000);
		driver = DriverUtilities.getInstanceOfDriverUtilities().getDriver(); 
		driver.manage().window().maximize();
		driver.get("http://localhost:8088/PingU/requestAdmin");
		driver.findElement(By.xpath("//td[contains(text(),DataFile.firstName)]")); 
    	driver.findElement(By.xpath("//td[contains(text(),DataFile.lastName)]")); 
		
	}
	
    @When("^Admin approve the reuqest$") 
    public void approveRequest() throws InterruptedException{
    	
    	driver.findElement(By.xpath("//button[contains(text(),'APPROVE')]")).click(); 
    	Thread.sleep(1000);
    }
	
    @Then("^The user should be able to login$")
	public void getApproveAndSuccessLogin() throws InterruptedException{
		
    	driver.get("http://localhost:8088/PingU/");
		LogInPage.usernameField(driver).sendKeys(DataFile.signUpUserName); 
		LogInPage.passwordField(driver).sendKeys(DataFile.signUpPassword);
		LogInPage.submitButton(driver).click();
		Thread.sleep(1000);
		String actualWelcomeMessage = HomePage.welcomeMessage(driver).getText(); 
		assertEquals(DataFile.homePageWelcome,actualWelcomeMessage); 
	
	}
	
	
}
