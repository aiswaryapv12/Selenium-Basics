package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Commands {
	public void verifyDemoWebshopLogin()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement register_field=driver.findElement(By.className("ico-register"));
		register_field.click();
	}

	public void verifySwapLapLogin()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement user_namefield = driver.findElement(By.id("user-name"));
		user_namefield.sendKeys("standard_user");
		WebElement password_field = driver.findElement(By.id("password"));
		password_field.sendKeys("secret_sauce");
		WebElement login_button= driver.findElement(By.id("login-button"));
		login_button.click();
			
		
		
	}
	 public void verifySwapLoginname()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 WebElement user_namefield =driver.findElement(By.name("user-name"));
		 user_namefield.sendKeys("standard_user");
		 WebElement password_field =driver.findElement(By.name("password"));
		 password_field.sendKeys("secret_sauce");
		 WebElement login_button =driver.findElement(By.name("login-button"));
		 login_button.click();
	 }
	 
	 public void verifySwapLoginClassName()
	 {
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 WebElement user_namefield = driver.findElement(By.className("form_input"));
		 user_namefield.sendKeys("standard_user");
		 WebElement password_field =driver.findElement(By.id("password"));
		 password_field.sendKeys("secret_sauce");
		 WebElement login_button = driver.findElement(By.className("submit-button"));
		 login_button.click();
		 
	 }
	 
	public static void main(String[] args) {
	
		Commands obj = new Commands();
		//obj.verifyDemoWebshopLogin();
	
		//obj.verifySwapLapLogin();
		//obj.verifySwapLoginname();
		obj.verifySwapLoginClassName();

	}

}
