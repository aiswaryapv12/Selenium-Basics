package org.selenium.basics;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


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
		 boolean subscribebutton =subscibe_button.isEnabled();
		 System.out.println("cheeck whether subscribe button enabled for not    :"+subscribebutton);
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
	 
	 public void verifyValueFromDropDown()
	 {
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize();
		 WebElement country_dropdown= driver.findElement(By.xpath("//select[@name='country']"));
		 Select select = new Select( country_dropdown);
		//select.selectByVisibleText("ANDORRA");
		// select.selectByIndex(6);
		 //select.selectByValue("AUSTRIA");
		WebElement first_selection= select.getFirstSelectedOption();
		System.out.println(first_selection.getText());
				 
		 
	 }
	 
	 public void verifyTotalNoOfValue()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize();
		 WebElement country_dropdown= driver.findElement(By.xpath("//select[@name='country']"));
		 Select select = new Select(country_dropdown);
		 List <WebElement> dropdownlist=select.getOptions();
		 System.out.println(" total no of drop down "+dropdownlist.size());
		 
	 }
	 
	 public void verifyMultipleOptionFromDropDown()
	 {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement dropdown_multiselect =driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select = new Select(dropdown_multiselect);
		boolean selectd_values=select.isMultiple();
		System.out.println(" check whether value are selected "+selectd_values);
		select.selectByIndex(2);
		select.selectByIndex(0);
		List<WebElement> listofselectedoption =select.getAllSelectedOptions();
		
		for(WebElement e:listofselectedoption)
		{
			System.out.println(e.getText());
		}
		
		  /* int size = listofselectedoption.size();
			for(int i = 0; i < size; i++) 
			{
            	String options =listofselectedoption.get(i).getText();
                 System.out.println(options);
			}*/
		
		select.deselectByIndex(0);
		
	 }
	 
	 
	 
	 public void verifyColourFromDropDown()
	 {
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://selenium.qabible.in/select-input.php");
		 driver.manage().window().maximize();
		 WebElement color = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		 Select select =  new Select(color);
		 select.selectByIndex(2);
		// select.selectByValue("Red");
		//select.selectByVisibleText("Green");
		WebElement selected_text =select.getFirstSelectedOption();
		System.out.println("selected value"+selected_text.getText());
		List<WebElement> alldrop =select.getOptions();
		int noofoption=  alldrop.size();
		System.out.println(" no of drop down "+noofoption);
			
		 
		 }
	 
	 public void verifySimpleAlert()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 WebElement simplealert =driver.findElement(By.xpath("//button[@id='alertButton']"));
		 simplealert.click();
		 Alert alert =driver.switchTo().alert();
		 alert.accept();
		 driver.close();
		 
	 }
	 public void verifyConfimationAlert()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 WebElement confirm_button = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		 confirm_button.click();
		 Alert alert =driver.switchTo().alert();
		 String text = alert.getText();
		 System.out.println("confimation message "+text);
		 alert.accept();
		 WebElement confirmation_text =driver.findElement(By.xpath("//span[@id='confirmResult']")); 
		 String text_result =confirmation_text.getText();
		 System.out.println("confimation meassge result "+ text_result);
		 
		 
		 
		 
	 }
	 
	 public void verifyPromptAlert()
	 {
		 
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 WebElement prompt_button = driver.findElement(By.cssSelector("button#promtButton"));
		 prompt_button.click();
		 Alert alert = driver.switchTo().alert();
		 String alert_text =alert.getText();
		 System.out.println("alert text "+alert_text);
		 alert.sendKeys("AISWARYA");
		 alert.accept();
		 WebElement result_message = driver.findElement(By.xpath("//span[@id='promptResult']"));
		 String result_text =result_message.getText();
		 System.out.println("result message "+result_text);
		 
	 }
	 
	 
	 public void verifyCustomerDelete()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 driver.manage().window().maximize();
		 WebElement customerid = driver.findElement(By.xpath("//input[@name='cusid']"));
		 customerid.sendKeys("455");
		 WebElement submit_button =driver.findElement(By.xpath("//input[@name='submit']"));
		 submit_button.click();
		 Alert alert = driver.switchTo().alert();
		 String alert_message =alert.getText();
		 System.out.println(" alert message "+alert_message);
		 alert.accept();
		 String success_msg =alert.getText();
		 System.out.println("success mesaage "+success_msg );
		 alert.accept();
		 
		  }
	   public void verifyRightClick()
	   {
		   WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			 driver.manage().window().maximize();
			 WebElement rightclick_button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			 Actions action =new Actions(driver);
			 action.contextClick(rightclick_button).build().perform();
			 driver.close();
			 
			 
			 
	   }

	   public void verifyDoubleClick()
	   {
		   WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			 driver.manage().window().maximize(); 
			 WebElement doubleclick_button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			 Actions action = new Actions(driver);
			 action.doubleClick(doubleclick_button).build().perform();
			 Alert alert = driver.switchTo().alert();
			String alert_message = alert.getText();
			System.out.println("alert message  "+alert_message);
			alert.accept();
			driver.close();
			 
	   }
	 
	   public void verifyDragAndDrop() {
		   
		   WebDriver driver = new ChromeDriver();
			 driver.get("https://demoqa.com/droppable");
			 driver.manage().window().maximize(); 
			 WebElement drag_me = driver.findElement(By.xpath("//div[@id='draggable']"));
			 WebElement drop_here= driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
			 Actions action = new Actions(driver);
			 action.dragAndDrop(drag_me, drop_here).build().perform();
			 driver.close();
			 
			 
		   }
	   
	   
	   public void verifyDragAndOffset()
	   {
		   WebDriver driver = new ChromeDriver();
			 driver.get("https://demoqa.com/dragabble");
			 driver.manage().window().maximize(); 
			 WebElement dragme =driver.findElement(By.xpath("//div[@id='dragBox']"));
			 Actions action = new Actions(driver);
			 action.dragAndDropBy(dragme, 50, 100).build().perform();
			 driver.close();
			 
		   
			 
	   }
	   public void verifyMouseover()
	   {
		   	 WebDriver driver = new ChromeDriver();
			 driver.get("https://demoqa.com/menu/");
			 driver.manage().window().maximize(); 
			 WebElement mouseover= driver.findElement(By.xpath("//a[text()='Main Item 2']"));
			 Actions action = new Actions(driver);
			 action.moveToElement(mouseover).build().perform();
		   
	   }
	   
	   
	   public void verifyFileUpload()
	   {
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.guru99.com/test/upload/");
		   driver.manage().window().maximize();
		   WebElement choose_field = driver.findElement(By.xpath("//input[@id=\"uploadfile_0\"]"));
		   choose_field.sendKeys("C:\\Users\\user\\git\\Selenium-Basics\\Selenium_Project\\src\\main\\resources\\Whatsapp my profile.docx");
		   WebElement accept =driver.findElement(By.xpath("//input[@id=\"terms\"]"));
		  accept.click();
		  WebElement submit_button = driver.findElement(By.xpath("//button[@id=\"submitbutton\"]"));
		  submit_button.click();
	   }
	   
	   
	   public void verifyFrames()
	   {
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/frames");
		   driver.manage().window().maximize();
		    List<WebElement> nooframes= driver.findElements(By.tagName("iframe"));
		    int  tags = nooframes.size();
		    System.out.println(" no of tags "+tags );
		  //  driver.switchTo().frame(1); 
		   // driver.switchTo().frame("frame1");
		    WebElement Frame1 = driver.findElement(By.cssSelector("#frame1"));
		    driver.switchTo().frame(Frame1);
		    WebElement textofframes= driver.findElement(By.id("sampleHeading"));
		     String text =textofframes.getText();
		     System.out.println(" text out is "+text);
		   
		   
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
		//obj.verifyisDisplayed();
		//obj.verifyValueFromDropDown();
		//obj.verifyTotalNoOfValue();
		//obj.verifyMultipleOptionFromDropDown();
		//obj.verifyColourFromDropDown();
	
		//obj.verifySimpleAlert();
		//obj.verifyConfimationAlert();
		//obj.verifyPromptAlert();
		//obj.verifyCustomerDelete();
		//obj.verifyRightClick();
		//obj.verifyDoubleClick();
		//obj.verifyDragAndDrop();
		//obj.verifyDragAndOffset();
		//obj.verifyMouseover();
		//obj. verifyFileUpload();
		obj.verifyFrames();
		

	}

}
