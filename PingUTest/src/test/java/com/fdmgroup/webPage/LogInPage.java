package com.fdmgroup.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    private static WebElement element;

    public static WebElement usernameField(WebDriver driver) {
        element = driver.findElement(By.name("username"));
        return element;
    }

    public static WebElement passwordField(WebDriver driver) {
        element = driver.findElement(By.name("password"));
        return element;
    }

    public static WebElement submitButton(WebDriver driver) {
        element = driver.findElement(By.id("login-button"));
        return element;
    }

    public static WebElement welcomeMessage(WebDriver driver) {
        element = driver.findElement(By.className("welcome-header"));
        return element;
    }

    public static WebElement errorMessage(WebDriver driver) {
        element = driver.findElement(By.className("error-message"));
        return element;
    }
}
