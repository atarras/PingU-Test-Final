package com.fdmgroup.webPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement welcomeMessage(WebDriver driver) {
		return driver.findElement(By.xpath("//h1[@class='welcome-header']"));
	}
	
	public static WebElement searchBox(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Search']"));
	}
	
	public static WebElement dropDownMenu(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='input-group-append']//button[@type='button']"));
	}
	
	public static WebElement groupOption(WebDriver driver) {
		return driver.findElement(By.xpath("//a[contains(text(),'Group Search')]"));
	}
	
	public static WebElement userOption(WebDriver driver) {
		return driver.findElement(By.xpath("//a[contains(text(),'User Search')]"));
	}
	
	public static WebElement searchButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	public static WebElement oneMessageButton(WebDriver driver) {
		return driver.findElement(By.xpath("//i[@class='far fa-envelope fa-2x']"));
	}
	
}
