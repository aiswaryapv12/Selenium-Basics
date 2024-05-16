package org.selenium.basics;
import java.util.List;

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
	 
	 public void verifyLinkText()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/index.php");
		 driver.manage().window().maximize();
		 WebElement destination_field = driver.findElement(By.linkText("your destination"));
		 destination_field.click();
	 }
	 public void verifyPartialLinkText()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/index.php");
		 driver.manage().window().maximize();
		 WebElement destination_field = driver.findElement(By.partialLinkText(" destination"));
		 destination_field.click();
	 }
	 
	 
	 public void totalNoOfTagInTheApplication()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/index.php");
		 driver.manage().window().maximize();
		 List<WebElement> inputtype =driver.findElements(By.tagName("td"));
		 int inputsize =inputtype.size();
		 System.out.println(" total no input tag is "+inputsize);
	 }
	 
	 public void verifyXpath()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/index.php");
		 driver.manage().window().maximize();
		 WebElement username_field =driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
		 username_field.sendKeys("aiswarya");
		 WebElement password_field =driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
		 password_field.sendKeys("Aiswarya");
		 WebElement submit_button =driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
		 submit_button.click();
	 }
	 
	 public void verifyLoginByCss()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/index.php");
		 driver.manage().window().maximize();
		 WebElement username_field =driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=text] "));
		 username_field.sendKeys("aiswarya");
		 WebElement password_field =driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=password]"));
		 password_field.sendKeys("Aiswarya");
		 WebElement submit_button =driver.findElement(By.cssSelector("body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > input[type=submit]"));
		 submit_button.click();
	 }
	 
	 public void verifyisSelected()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/register");
		 driver.manage().window().maximize();
		 WebElement gender_field = driver.findElement(By.xpath("//input[@id='gender-male']"));
		boolean status = gender_field.isSelected();
		System.out.println(" check button is not selected or not"+status);
		gender_field.click();
		boolean statusonclick =gender_field.isSelected();
		System.out.println(" check whether button is selected  :"+statusonclick);
	 }
	 
	 public void verifyisEnabled()
	 {
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 WebElement subscibe_button = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		 boolean isSubscribeButtonEnabled =subscibe_button.isEnabled();
		 System.out.println("cheeck whether subscribe button enabled for not    :"+isSubscribeButtonEnabled);
	 }
	
	 
	 public void verifyisDisplayed()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 WebElement vote_button= driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		boolean displayedstatus = vote_button.isDisplayed();
		System.out.println(" check whether button is displayed or not "+displayedstatus);
	 }
	public static void main(String[] args) {
	
		Commands obj = new Commands();
		//obj.verifyDemoWebshopLogin();
	
		//obj.verifySwapLapLogin();
		//obj.verifySwapLoginname();
		//obj.verifySwapLoginClassName();
		//obj.verifyLinkText();
		//obj.verifyPartialLinkText();
		//obj.totalNoOfTagInTheApplication();
		//obj.verifyXpath();
		//obj.verifyLoginByCss();
		//obj. verifyisSelected(); 
		//obj.verifyisEnabled();
		obj.verifyisDisplayed();

	}

}
