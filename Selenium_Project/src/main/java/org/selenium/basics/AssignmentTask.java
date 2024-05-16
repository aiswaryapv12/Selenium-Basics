package org.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignmentTask {
	
	public void verifySingleInputField()
	{
			WebDriver driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/simple-form-demo.php");
			driver.manage().window().maximize();
			WebElement message= driver.findElement(By.xpath("//input[@id='single-input-field']"));
			message.sendKeys("hi");
			WebElement show_button=driver.findElement(By.xpath("//button[@id='button-one']"));
			show_button.click();
			WebElement text_field =driver.findElement(By.xpath("//div[@id='message-one']"));
			String text =text_field.getText();
			System.out.println(" value in the show  message    "+text);
			
			
	}
	
	public void verifyTwoInputValue()
	{
			WebDriver driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/simple-form-demo.php");
			driver.manage().window().maximize();
			WebElement input1_field= driver.findElement(By.cssSelector("input#value-a"));
			input1_field.sendKeys("25");
			WebElement input2_field = driver.findElement(By.cssSelector("input#value-b"));
			input2_field.sendKeys("85");
			WebElement gettotal=driver.findElement(By.cssSelector("button[id=button-two]"));
			gettotal.click();
			WebElement text_field =driver.findElement(By.cssSelector("div#message-two"));
			String text =text_field.getText();
			System.out.println(" value in the get total  "+text);
			
	}
	
	public void verifyCheckBox()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement checkbox_field = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		boolean checkenabled=checkbox_field.isSelected();
		System.out.println(" checkbox is enabled or not "+checkenabled);
		checkbox_field.click();
		boolean enabledstatus =checkbox_field.isSelected();
		System.out.println(" check box is enabled or not "+enabledstatus);
		
		
	}
	public void verifyRadioButton()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement female_field= driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean status =female_field.isSelected();
		System.out.println(" check the female field is enabled or not "+status);
		female_field.click();	
		 status =female_field.isSelected();
		System.out.println(" check box is enabled or not "+status);
		WebElement show_selectedvalue= driver.findElement(By.xpath("//button[@id='button-one']"));
		show_selectedvalue.click();
		WebElement selectedtext= driver.findElement(By.xpath("//div[@id='message-one']"));
		String text =selectedtext.getText();
		System.out.println("selected value is "+text);
		
		
	}
	public void verifyForm()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
		WebElement firstname= driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		firstname.sendKeys("Aiswarya");
		WebElement lastname= driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		lastname.sendKeys("P V");
		WebElement city= driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys("Kannur");
		WebElement state= driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		state.sendKeys("Kerala");
		WebElement zip= driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zip.sendKeys("670582");
		WebElement username= driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		username.sendKeys("aiswarya123");
		WebElement agree= driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		agree.click();
		WebElement submit= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submit.click();
		WebElement displayedtext= driver.findElement(By.cssSelector("div[id='message-one']"));
		String text= displayedtext.getText();
		System.out.println(" DISPLAYED TEXT IS "+text);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentTask obj = new AssignmentTask();
		//obj.verifySingleInputField();
		//obj.verifyTwoInputValue();
		//obj.verifyCheckBox();
		//obj.verifyRadioButton();
		//obj.verifyRadioButton();
		obj.verifyForm();

	}

}
