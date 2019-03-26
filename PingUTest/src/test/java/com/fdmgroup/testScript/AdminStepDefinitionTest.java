package com.fdmgroup.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;
import com.fdmgroup.webPage.AdminPage;
import com.fdmgroup.webPage.LogInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDefinitionTest {
	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Given("^Admin navigate to the trainee page$")
	public void navigateToTraineePage() {
		driverUtilities = DriverUtilities.getInstanceOfDriverUtilities();
        driver = driverUtilities.getDriver();
		driver.get("http://localhost:8088/PingU/users");
		AdminPage.traineesLink(driver).click();
	}
	
	@When("^Admin moves scroll bar of table$")
	public void scrollTable() throws InterruptedException {
		WebElement tableScrollBar = AdminPage.tableScrollBar(driver);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", tableScrollBar);
		Thread.sleep(3000);
	}
	
	@When("^Clik on actions tab$")
	public void actionsButton() {
		AdminPage.actionsLink(driver).click();
	}
	
	@Then("^click on lock icon to unlock it$")
	public void unloackTraineeAccount() {
		WebElement lock = driver.findElement(By.id("trainee-status-close"));
		WebElement unlock = driver.findElement(By.id("trainee-status-open"));
		if(lock.isEnabled()) {
			lock.click();
		}else {
			
		}
		AdminPage.editConfirmationButton(driver).click();
	}
	
	@Then("^user should be able to login into account with valid credentials$")
	public void userShouldBeAbleToLoginUsingValidCredentatials() {
		driver.get(DataFile.homeURL);
		LogInPage.usernameField(driver).sendKeys(DataFile.username);
        LogInPage.passwordField(driver).sendKeys(DataFile.password);
        LogInPage.submitButton(driver).submit();
	}
	
}
