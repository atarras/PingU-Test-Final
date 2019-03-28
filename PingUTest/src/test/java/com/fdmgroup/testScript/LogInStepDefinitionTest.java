package com.fdmgroup.testScript;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.testData.DataFile;
import com.fdmgroup.util.DriverUtilities;
import com.fdmgroup.webPage.LogInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInStepDefinitionTest {

    private DriverUtilities driverUtilities;
    private WebDriver driver;

    @Given("^User launches web browser$")
    public void launchWebBrowser() {
        driverUtilities = DriverUtilities.getInstanceOfDriverUtilities();
        driver = driverUtilities.getDriver();
        driver.manage().window().maximize();
    }

    @Given("^User navigate to the home page$")
    public void navigateToLogInPage() {
        driver.get(DataFile.homeURL);
    }

    @When("^User enters valid username and valid password$")
    public void enterValidUsernameValidPassword() throws InterruptedException {
        LogInPage.usernameField(driver).sendKeys(DataFile.username);
        LogInPage.passwordField(driver).sendKeys(DataFile.password);
    }

    @When("^User enters valid username but invalid password$")
    public void enterValidUsernameInvalidPassword() {
        LogInPage.usernameField(driver).sendKeys(DataFile.username);
        LogInPage.passwordField(driver).sendKeys(DataFile.invalidPassword);
    }

    @When("^User enters invalid username but valid password$")
    public void enterInvalidUsernameValidPassword() {
        LogInPage.usernameField(driver).sendKeys(DataFile.invalidUsername);
        LogInPage.passwordField(driver).sendKeys(DataFile.password);
    }

    @When("^User enters invalid username and invalid password$")
    public void enterInvalidUsernameInvalidPassword() {
        LogInPage.usernameField(driver).sendKeys(DataFile.invalidUsername);
        LogInPage.passwordField(driver).sendKeys(DataFile.invalidPassword);
    }

    @When("^User clicks on Login button$")
    public void clickLoginButton() {
        LogInPage.submitButton(driver).click();
    }

    @When("^User clicks on Logout button$")
    public void clickLogoutButton() {
        LogInPage.logoutButton(driver).click();
    }

    @Then("^User will be redirected to the home page$")
    public void verifyHomePageLabel() throws InterruptedException {
        Thread.sleep(500);
        assertEquals(LogInPage.welcomeMessage(driver).getText(), DataFile.homePageWelcome);
    }

    @Then("^User will be redirected to the login page$")
    public void verifyLoginPageLabel() {
        assertEquals(LogInPage.loginMessage(driver).getText(), DataFile.expectedLoginMessage);
    }

    @Then("^Invalid username/password error message is displayed$")
    public void verifyErrorMessageLabel() {
        assertEquals(LogInPage.errorMessage(driver).getText(), DataFile.expectedErrorMessage);
    }
}
