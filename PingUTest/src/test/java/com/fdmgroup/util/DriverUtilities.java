package com.fdmgroup.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtilities {
	
	private static DriverUtilities driverUtilities;
	private WebDriver driver;

	private DriverUtilities() {
		super();
	}
	
	public static DriverUtilities getInstanceOfDriverUtilities(){
		if(driverUtilities == null){
			driverUtilities = new DriverUtilities();
		}
		return driverUtilities;
	}
	
	public WebDriver getDriver(){
		if(driver == null){
			createDriver();
		}
		return driver;
	}

	private void createDriver() {
		//String driverName = getDriverName();
		int driverName = 1;
		switch(driverName){
		case 1 :
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			this.driver = new ChromeDriver();
			break;
		case 2 :
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			this.driver = new FirefoxDriver();
			break;
		default :
			System.out.println("Not an appropriate browser!!");
			break;
		}
		
	}

	private String getDriverName() {
		String driverName = "";	
		Properties config = new Properties();
		try {
			config.load(new FileInputStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}		
		for (String key : config.stringPropertyNames()) {
			if(key.equals("browser")){
				driverName = config.getProperty(key);
			}
		}		
		return driverName;
	}
	
}
