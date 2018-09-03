package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Page{
	
	private WebElement logOutLink = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
	
	
	public boolean verifyLogOutLink(){
		return this.logOutLink.isDisplayed();
	}
	
	
	
	

}
