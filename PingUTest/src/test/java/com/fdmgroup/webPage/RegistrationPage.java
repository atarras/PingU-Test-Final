package com.fdmgroup.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	
	
	public static WebElement firstNameBox(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='signup-firstname-field']"));
	}
	
	public static WebElement lastNameBox(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='signup-lastname-field']"));
	}
	
	public static WebElement usernameBox(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='signup-username-field']"));
	}
	
	public static WebElement passwordBox(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='signup-password-field']"));
	}
	
	public static WebElement confirmPpasswordBox(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='signup-confirm-password-field']"));
	}
	
	public static WebElement emailBox(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='signup-email-field']"));
	}
	public static WebElement cityBox(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='signup-city-field']"));
	}
	public static WebElement countryBox(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='signup-country-field']"));
	}
	
	public static WebElement secuQuestionDropdown(WebDriver driver) {
		return driver.findElement(By.xpath(""));
	}
	
	public static WebElement secuAnswer(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='signup-security-answer-field']"));
	}
	
	public static WebElement linkedInBox(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='signup-linkedin-field']"));
	}
    
	public static WebElement userTypeDropdown(WebDriver driver) {
		return driver.findElement(By.xpath(""));
	}
	
	public static WebElement streamBox(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='signup-stream-field']"));
	}
	
	public static WebElement signUpButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='sign-up-button']"));
	}
}
