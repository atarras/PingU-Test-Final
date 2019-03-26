package com.fdmgroup.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {	
	public static WebElement element;
	
	public static WebElement addTraineeButton(WebDriver driver) {
		element = driver.findElement(By.id("add-trainee-button"));
		return element;
	}
	public static WebElement settingButton(WebDriver driver) {
		element = driver.findElement(By.id("trainee-options"));
		return element;
	}
	public static WebElement consultantsLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Consultants"));
		return element;
	}
	public static WebElement traineesLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Trainees"));
		return element;
	}
	public static WebElement tableScrollBar(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='trainee']/table"));
		return element;
	}
	public static WebElement actionsLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='trainee-actions']/i"));
		return element;
	}
	public static WebElement editConfirmationButton(WebDriver driver) {
		element = driver.findElement(By.id("confirm-edit-trainee"));
		return element;
	}
}
