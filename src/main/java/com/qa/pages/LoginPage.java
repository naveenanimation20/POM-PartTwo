package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page {
	
	public LoginPage(WebDriver driver){
		System.out.println("login page cost");
		this.driver = driver;
	}

	private WebElement username = driver.findElement(By.name("username"));
	private WebElement password = driver.findElement(By.name("password"));
	private WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	

	

	public HomePage login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

		return new HomePage();

	}

	public String getloginPageTitle() {
		return driver.getTitle();
	}

}
