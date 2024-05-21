package org.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_MouseAction {
	
	public void mouseOver()
	{
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/menu/");
		 driver.manage().window().maximize();
		 WebElement mouseover= driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		 Actions action = new Actions(driver);
		 action.moveToElement(mouseover).build().perform();
		 WebElement sub_list = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		 Actions acton = new Actions(driver);
		 action.moveToElement(sub_list).build().perform();
		 
	}
	
	
	public void dragAndDrop()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();
		WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop =driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag1, drop).build().perform();
		WebElement drag2 = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		action.dragAndDrop(drag2, drop).build().perform();
		WebElement drag3 = driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		action.dragAndDrop(drag3, drop).build().perform();
		WebElement drag4 = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		action.dragAndDrop(drag4, drop).build().perform();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_MouseAction obj = new Assignment_MouseAction();
		//obj.mouseOver();
		obj.dragAndDrop();
	}

}
