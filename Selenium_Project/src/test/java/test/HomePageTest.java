package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

public class HomePageTest extends Base {
	
	@Test
	public void verifyHomePageTitle()
	{
		driver.get("https://demowebshop.tricentis.com/");
		String actualtitle =driver.getTitle();
		System.out.println(" title of the page "+actualtitle);
		String expectedtitle= "Demo Web Shop";
		Assert.assertEquals(actualtitle, expectedtitle,"Invalid title");
		
	}
	
	@Test
	public void verifyCommunityPollSelection()
	{
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> checkbox_field =driver.findElements(By.xpath("//li[@class='answer']//input[@name ='pollanswers-1']//following-sibling::label"));
		for(WebElement radiobutton: checkbox_field)
		{
			String text = radiobutton.getText();
			System.out.println("options "+text);
			
			if(text.equalsIgnoreCase("Good"))
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