package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class LoginPageText extends Base {
	
	@Test
	public void verifyLoginPageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		String actualtitle =driver.getTitle();
		System.out.println("actual title is "+actualtitle);
		String expectedtitle ="Demo Web Shop. Login";
		Assert.assertEquals(actualtitle, expectedtitle, "INVALID TITLE");
		
		
	}
	
	@Test
	public void verifyUserLogin()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login = driver.findElement(By.className("ico-login"));
		login.click();
		WebElement email_field = driver.findElement(By.id("Email"));
		email_field.sendKeys("aiswaryapv25@gmail.com");
		WebElement password_field =driver.findElement(By.id(""));
		password_field.sendKeys("123456789");
		WebElement login_button = driver.findElement(By.className( "login-button"));
		login_button.click();
		WebElement actual_text =driver.findElement(By.xpath("//a[text()='aiswaryapv25@gmail.com']"));
		String actual_mail =actual_text.getText();
		System.out.println("Actual email id is "+actual_mail);
		String expected_email ="aiswaryapv25@gmail.com";
		Assert.assertEquals(actual_mail, expected_email, "invalid email");
	}
	
	
	@Test
	public void verifyUserLoginWithInvalidCredentials()
	{
		
	}

}
