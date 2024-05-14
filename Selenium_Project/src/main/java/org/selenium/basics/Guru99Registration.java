package org.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Registration {
	
	
	public void verifyguru99Registration()
	{

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/index.php");
		 driver.manage().window().maximize();
		 WebElement register_link = driver.findElement(By.linkText("REGISTER"));
		 register_link.click();
		 WebElement firstname_field = driver.findElement(By.name("firstName"));
		 firstname_field.sendKeys("Aiswarya");
		 WebElement lastname_field = driver.findElement(By.name("lastName"));
		 lastname_field.sendKeys("P V");
		 WebElement phonenumber_field = driver.findElement(By.name("phone"));
		 phonenumber_field.sendKeys("9556666455");
		 WebElement email_field = driver.findElement(By.name("userName"));
		 email_field.sendKeys("aiswaryapv25@gmail.com");
		 WebElement address_field = driver.findElement(By.name("address1"));
		 address_field.sendKeys("dssaffhouse");
		 WebElement city_field = driver.findElement(By.name("city"));
		 city_field.sendKeys("tailparamba");
		 WebElement state_field = driver.findElement(By.name("state"));
		 state_field .sendKeys("kerala");
		 WebElement postal_field = driver.findElement(By.name("postalCode"));
		 postal_field.sendKeys("670582");
		 WebElement username_field = driver.findElement(By.name("email"));
		 username_field.sendKeys("aiswaryapv");
		 WebElement password_field = driver.findElement(By.name("password"));
		 password_field.sendKeys("aiswarya");
		 WebElement confirmPassword_field = driver.findElement(By.name("confirmPassword"));
		 confirmPassword_field.sendKeys("aiswarya");
		 WebElement submit_button = driver.findElement(By.name("submit"));
		 submit_button.click();
		 
	
		 
		 
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guru99Registration obj = new Guru99Registration();
		obj.verifyguru99Registration();

	}

}
