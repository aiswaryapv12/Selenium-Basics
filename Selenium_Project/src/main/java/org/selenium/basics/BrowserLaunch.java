package org.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/");
			driver.manage().window().maximize();
			String title =driver.getTitle();
			System.out.println(title);
			String currenturl =driver.getCurrentUrl();
			System.out.println(currenturl);
			String windowhandle =driver.getWindowHandle();
			System.out.println(windowhandle );
			String pagesource =driver.getPageSource();
			System.out.println(pagesource);
			driver.close();
			
			

	}

}
