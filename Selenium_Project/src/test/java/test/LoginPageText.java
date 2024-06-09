package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.Excel_Utility;

public class LoginPageText extends Base {
	
	@Test
	public void verifyLoginPageTitle() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/login");
		String actualtitle =driver.getTitle();
		System.out.println("actual title is "+actualtitle);
		String expectedtitle =Excel_Utility.readStringData(0, 0,"Login_Page");
		Assert.assertEquals(actualtitle, expectedtitle, "INVALID TITLE");
		
		
	}
	
	@Test
	public void verifyUserLogin() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login = driver.findElement(By.className("ico-login"));
		login.click();
		WebElement email_field = driver.findElement(By.id("Email"));
		String email_value =Excel_Utility.readStringData(0, 1,"Login_Page");
		email_field.sendKeys(email_value);
		WebElement password_field =driver.findElement(By.id("Password"));
		String password_value =Excel_Utility.readIntegerData(1, 1,"Login_Page");
		password_field.sendKeys(password_value);
		WebElement login_button = driver.findElement(By.className( "login-button"));
		login_button.click();
		WebElement actual_text =driver.findElement(By.xpath("//a[text()='aiswaryapv25@gmail.com']"));
		String actual_mail =actual_text.getText();
		System.out.println("Actual email id is "+actual_mail);
		String expected_email =email_value;
		Assert.assertEquals(actual_mail, expected_email, "invalid email");
	}
	
	
	@Test
	public void verifyUserLoginWithInvalidCredentials()
	{
		
	}

}
