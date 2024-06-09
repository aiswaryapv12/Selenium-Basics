package test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import utilities.Excel_Utility;

public class HomePageTest extends Base {
	
	@Test
	public void verifyHomePageTitle() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualtitle =driver.getTitle();
		System.out.println(" title of the page "+actualtitle);
		String expectedtitle=Excel_Utility.readStringData(0, 0,"Home_Page");
		Assert.assertEquals(actualtitle, expectedtitle,"Invalid title");
		
	}
	
	@Test
	public void verifyCommunityPollSelection() throws IOException
	{
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> checkbox_field =driver.findElements(By.xpath("//li[@class='answer']//input[@name ='pollanswers-1']//following-sibling::label"));
		
		
		for(WebElement radiobutton: checkbox_field)
		{
			String text = radiobutton.getText();
			System.out.println("options "+text);
			String data =Excel_Utility.readStringData(0, 1,"Home_Page");
			if(text.equalsIgnoreCase(data))
			{
				radiobutton.click();
				
			}
		}
	   WebElement goodfield =driver.findElement(By.xpath("//input[@id='pollanswers-2']"));  
	   boolean status =goodfield.isSelected();
	   System.out.println(status);
	   Assert.assertTrue(status,"good checkbox is not selected");
	}
}