package org.testngcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends BrowserLaunch{
	
	@Test
	public void verifyHomePageTitle() 
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualtitle =driver.getTitle();
		System.out.println(" title of the page "+actualtitle);
		String expectedtitle= "Demo Web Shop";
		Assert.assertEquals(actualtitle, expectedtitle,"INVALID TITLE");
	}

	

	@Test
	public void verifyDemoUserLogin()
	{
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login = driver.findElement(By.className("ico-login"));
		login.click();
		WebElement email_field =driver.findElement(By.id("Email"));
		email_field.sendKeys("aiswaryapv25@gmail.com");
		WebElement password_field = driver.findElement(By.id("Password"));
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
	public void verifyisSelected()
	{
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender_field = driver.findElement(By.xpath("//input[@id='gender-male']"));
		boolean actual_status = gender_field.isSelected();
		System.out.println(" status of radio button is selected or not"+actual_status);
		Assert.assertFalse(actual_status, "GENDER FIELD IS SELECTED");
		gender_field.click();
		boolean statusonclick =gender_field.isSelected();
		System.out.println(" check whether radio button is selected  :"+statusonclick);
		Assert.assertTrue(statusonclick, "Gender field is not selected");
	}
	
	
	@Test
	 public void verifyisEnabled()
	 {
		
		 driver.get("https://demowebshop.tricentis.com/");
		 WebElement subscibe_button = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
		 boolean subscribebutton =subscibe_button.isEnabled();
		 System.out.println("cheeck whether subscribe button enabled for not    :"+subscribebutton);
		 Assert.assertTrue(subscribebutton, "SUBSCRIBE BUTTON IS NOT ENABLED");
	 }
	
	@Test
	 public void verifyisDisplayed()
	 {
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 WebElement vote_button= driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		 boolean displayedstatus = vote_button.isDisplayed();
		 System.out.println(" check whether button is displayed or not "+displayedstatus);
		 Assert.assertTrue(displayedstatus, "Button is not displayed");
	 }
	
	@Test
	public void verifyJavascriptExecutor()
	{
		 driver.get("https://demowebshop.tricentis.com/");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("document.getElementById(\"newsletter-email\").value='aiwaryaankaran123@gmail.com'");
		 js.executeScript("document.getElementById(\"newsletter-subscribe-button\").click()");
		 
		
	}
	@Test
	
		public void verifyVerticalScroll()
		{
			 driver.get("https://demowebshop.tricentis.com/");
			 JavascriptExecutor js =(JavascriptExecutor)driver;
			 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
	
	@Test
	public void verifyJavascriptDemoLogin()
	{
		driver.get("https://demowebshop.tricentis.com/login");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"Email\").value ='aiswaryapv25@gmail.com'");
		js.executeScript("document.getElementById(\"Password\").value='123456789'");
		js.executeScript("document.querySelector('.login-button').click()");
		
	}
	@Test
	
	public void verifyJavascriptScroll()
	{
		 driver.get("https://demoqa.com/dragabble");
		 WebElement drag =driver.findElement(By.xpath("//div[@id='dragBox']"));
		
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,150)");
		 Actions action = new Actions(driver);
		 action.dragAndDropBy(drag, 50, 100).build().perform();
		
	}

	
}  

