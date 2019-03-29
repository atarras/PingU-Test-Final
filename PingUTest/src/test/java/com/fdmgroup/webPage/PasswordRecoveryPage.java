package com.fdmgroup.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordRecoveryPage {

    private static WebElement element;

    public static WebElement forgotPasswordLink(WebDriver driver) {
        element = driver.findElement(By.partialLinkText("Forgot Password"));
        return element;
    }

    public static WebElement usernameField(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='recover-password-username']"));
        return element;
    }

    public static WebElement securityQuestionDropDown(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='recover-password-security-question']/div/select"));
        return element;
    }

    public static WebElement securityAnswerField(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='rp-security-answer']"));
        return element;
    }

    public static WebElement newPasswordField(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='rp-new-password']"));
        return element;
    }

    public static WebElement confirmNewPasswordField(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='rp-confirm-new-password']"));
        return element;
    }

    public static WebElement submitButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='recover-password-button']"));
        return element;
    }
}
