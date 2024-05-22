package org.selenium.basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Iframe {

	public void verifyFrame()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html#google_vignette");
		driver.manage().window().maximize();
		WebElement text_box = driver.findElement(By.xpath("//input[@id='name']"));
		text_box.sendKeys("hello");
		List<WebElement> frame =driver.findElements(By.tagName("iframe"));
		int no_of_tags = frame.size();
		System.out.println(" no of iframe  "+no_of_tags);
		driver.switchTo().frame("frm1");
		WebElement course = driver.findElement(By.id("course"));
		Select dropdown = new Select(course);
		dropdown.selectByIndex(2);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");
		WebElement basiccontrols = driver.findElement(By.cssSelector("#selectnav1"));
		Select dropdown2 = new Select(basiccontrols);
		dropdown2.selectByIndex(6);
		
		
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_Iframe obj = new Assignment_Iframe();
		obj.verifyFrame();
	}

}
