package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.Excel_Utility;

public class RegistrationPageTest extends Base {
	
	
	
	@Test
	public void  verifyRegistrationPageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register_field = driver.findElement(By.xpath("//a[text()='Register']"));
		register_field.click();
		String actual_title =driver.getTitle();
		System.out.println("Actual title is "+actual_title);
		String expcted_title=Excel_Utility.readStringData(0, 0, "Registration_Page");
		Assert.assertEquals(actual_title, expcted_title, "Invalid title");
		
		
	}
	
	
	@Test
	public void verifyUserRegistration()
	{
		
			
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register_field=driver.findElement(By.xpath("//a[@class='ico-register']")) ;
		register_field.click();
		WebElement genderfemale=driver.findElement(By.xpath("//input[@id='gender-female']"));
		genderfemale.click();
		WebElement first_name=driver.findElement(By.xpath("//input[@id='FirstName']"));
		first_name.sendKeys("Aiswarya");
		WebElement last_name=driver.findElement(By.xpath("//input[@id='LastName']"));
		last_name.sendKeys("P V");
		WebElement email_field=driver.findElement(By.xpath("//input[@id='Email']"));
		email_field.sendKeys("aiswarypva@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("1233444");
		WebElement confirmpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		confirmpassword.sendKeys("1233444");
		WebElement register_button=driver.findElement(By.xpath("//input[@id='register-button']"));
		register_button.click();
		WebElement message=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]"));
		String actualmessage=message.getText();
		System.out.println("Actual Message: " +actualmessage);
		String expectedmessage="Your registration completed";
		Assert.assertEquals(actualmessage, expectedmessage, "Invalid Message");
	}
	
}


