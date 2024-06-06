package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class RegistrationPageTest extends Base {
	
	
	
	@Test
	public void  verifyRegistrationPageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register_field = driver.findElement(By.xpath("//a[text()='Register']"));
		register_field.click();
		String actual_title =driver.getTitle();
		System.out.println("Actual title is "+actual_title);
		String expcted_title="Demo Web Shop. Register";
		Assert.assertEquals(actual_title, expcted_title, "Invalid title");
		
		
	}
	
	
	@Test
	public void verifyUserRegistration()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register_field =driver.findElement(By.className("ico-register"));
		register_field.click();
		WebElement gender_field =driver.findElement(By.id("gender-female"));
		gender_field.click();
		WebElement firstname_field =driver.findElement(By.className("single-line"));
		firstname_field.sendKeys("Aiswarya");
		WebElement lastname_field =driver.findElement(By.id("LastName"));
		lastname_field.sendKeys("P V");
		WebElement email_field =driver.findElement(By.id("Email"));
		email_field.sendKeys("aiswaryas12g3@gmail.com");
		WebElement password_field =driver.findElement(By.id("Password"));
		password_field.sendKeys("aiswarya");
		WebElement confirmpassword_field =driver.findElement(By.id("ConfirmPassword"));
		confirmpassword_field.sendKeys("aiswarya");
		WebElement register_button =driver.findElement(By.id("register-button"));
		register_button.click();
		WebElement result = driver.findElement(By.className("result"));
		String actual_result =result.getText();
		System.out.println(" Actual result is "+actual_result);
		String expected_result ="Your registration completed";
		Assert.assertEquals(actual_result, expected_result,"Invalid registerationuser");
			
		
	
	}

}
