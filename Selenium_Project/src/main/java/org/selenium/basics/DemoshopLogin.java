package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoshopLogin {
	
	public void Login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.className("ico-login"));
		login.click();
		WebElement email_field =driver.findElement(By.id("Email"));
		email_field.sendKeys("aiswaryapv25@gmail.com");
		WebElement password_field = driver.findElement(By.id("Password"));
		password_field.sendKeys("123456789");
		WebElement login_button = driver.findElement(By.className( "login-button"));
		login_button.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoshopLogin obj = new DemoshopLogin();
		obj.Login();

	}

}
