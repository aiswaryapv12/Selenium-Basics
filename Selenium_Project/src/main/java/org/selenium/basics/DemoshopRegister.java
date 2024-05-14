package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoshopRegister {
	
	public void verifyRegister()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement register_field =driver.findElement(By.className("ico-register"));
		register_field.click();
		WebElement gender_field =driver.findElement(By.id("gender-female"));
		gender_field.click();
		WebElement firstname_field =driver.findElement(By.className("single-line"));
		firstname_field.sendKeys("Aiswarya");
		WebElement lastname_field =driver.findElement(By.id("LastName"));
		lastname_field.sendKeys("P V");
		WebElement email_field =driver.findElement(By.id("Email"));
		email_field.sendKeys("aiswaryasankaran123@gmail.com");
		WebElement password_field =driver.findElement(By.id("Password"));
		password_field.sendKeys("aiswarya");
		WebElement confirmpassword_field =driver.findElement(By.id("ConfirmPassword"));
		confirmpassword_field.sendKeys("aiswarya");
		WebElement register_button =driver.findElement(By.id("register-button"));
		register_button.click();
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoshopRegister  obj = new DemoshopRegister();
		obj.verifyRegister();

	}

}
