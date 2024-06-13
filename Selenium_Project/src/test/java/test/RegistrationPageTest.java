package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.Excel_Utility;
import utilities.RandomData_Utility;

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
		String first_name =RandomData_Utility.getFirtName();
		String last_name = RandomData_Utility.getLastName();
		String email =first_name+"."+last_name+"@gmail.com";
		String password =first_name+"."+last_name;
		
		WebElement register_field=driver.findElement(By.xpath("//a[@class='ico-register']")) ;
		register_field.click();
		
		WebElement genderfemale=driver.findElement(By.xpath("//input[@id='gender-female']"));
		genderfemale.click();
		
		WebElement first_namefield=driver.findElement(By.xpath("//input[@id='FirstName']"));
		first_namefield.sendKeys(first_name);
		
		WebElement last_namefield=driver.findElement(By.xpath("//input[@id='LastName']"));
		last_namefield.sendKeys(last_name);
		
		WebElement email_field=driver.findElement(By.xpath("//input[@id='Email']"));
		email_field.sendKeys(email);
		
		WebElement password_field=driver.findElement(By.xpath("//input[@id='Password']"));
		password_field.sendKeys(password);
		
	
		WebElement confirmpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		confirmpassword.sendKeys(password);
		
		WebElement register_button=driver.findElement(By.xpath("//input[@id='register-button']"));
		register_button.click();
		WebElement message=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]"));
		String actualmessage=message.getText();
		//System.out.println("Actual Message: " +actualmessage);
		String expectedmessage=Excel_Utility.readStringData(0, 1,"Registration_Page");
		Assert.assertEquals(actualmessage, expectedmessage, "Invalid Message");
	}
	
}


