package basic;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class Sample {
	
	public void browserCommand()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(" title"+title);
		
		 String  url =driver.getCurrentUrl();
		 System.out.println(" url "+url);
		 String pagesource = driver.getPageSource();
		 System.out.println("pagesource"+pagesource);
		 String windowhandle =driver.getWindowHandle();
		 System.out.println(" window handle "+windowhandle);
		 
		
		}
	public void navigateCommand()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.flipkart.com/");
	}
	public void webElementid()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement id = driver.findElement(By.id("user-name"));
		id.sendKeys("aiisi");
		WebElement name = driver.findElement(By.id("password"));
		name.sendKeys("hhhfdjhj");
		WebElement login =driver.findElement(By.className("submit-button btn_action"));
		login.click();
		
		
	
	}
	
	public void PartiaLinkText()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		 List<WebElement> nooftag =driver.findElements(By.tagName("a"));
		 int total = nooftag.size();
		 System.out.println(" total tag"+total);
		 
	
		
	}
	
	public void webElementMethod()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement username =driver.findElement(By.name("userName"));
		username.sendKeys("aiiaia");
		WebElement pasword = driver.findElement(By.name("password"));
		pasword.sendKeys("sajsajd");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		WebElement submitenabled  = driver.findElement(By.name("submit"));
		 boolean enabled =submitenabled.isEnabled();
		System.out.println("enabled status " +enabled);
	    WebElement link = driver.findElement(By.linkText("your destination"));
	    boolean display =link.isDisplayed();
	    System.out.println(" check selected or not"+display);
	   
	    
	 	}
		public void dropDownProgram()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			driver.manage().window().maximize();
			WebElement countrydropdown = driver.findElement(By.xpath("//select[@name='country']"));
			Select dropdown =new Select(countrydropdown);
				List<WebElement> texts_llist= dropdown.getOptions();
				int sizeoftext =texts_llist.size();
				System.out.println("size is "+sizeoftext);
				
				
				
			 //dropdown.selectByIndex(2);
			// dropdown.selectByValue("ANDORRA");
			// dropdown.selectByVisibleText("ARGENTINA");
			
			//WebElement text = dropdown.getFirstSelectedOption();
			//String text_result = text.getText();
			//System.out.println(" FIRST SELECTED TEXT IS "+text_result);
			
			 
		}
		
		public void multipledropdown()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/select-input.php");
			driver.manage().window().maximize();
			WebElement drop_list = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
			Select dropdown = new Select(drop_list);
			dropdown.selectByValue("Red");
			dropdown.selectByIndex(1);
			dropdown.selectByVisibleText("Green");
			List<WebElement> dropdown_list =dropdown.getAllSelectedOptions();
			for(WebElement e: dropdown_list)
			{
				System.out.println(e.getText());
			}
			
		}
		
		
		public void simpleAlert()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			WebElement clickme =driver.findElement(By.xpath("//button[@id='alertButton']"));
			clickme.click();
			Alert alert =driver.switchTo().alert();
			alert.accept();
			
		}
		
		public void confimation()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			WebElement clickme =driver.findElement(By.xpath("//button[@id='confirmButton']"));
			clickme.click();
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			String alerttxt =alert.getText();
			System.out.println("alrt text "+alerttxt); 
			
			
			
		}
		
		public void promptalet()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			WebElement clickme =driver.findElement(By.xpath("//button[@id='promtButton']"));
			clickme.click();
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("jdj");
			alert.accept();
			
		}
		
		public void rightclick()
		{
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			 driver.manage().window().maximize();
			 WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			 Actions action = new Actions(driver);
			 action.contextClick(rightclick).build().perform();
					 
		}
		public void doublecl()
		{
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			 driver.manage().window().maximize();
			 WebElement doubleclick= driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
			 Actions action = new Actions(driver);
			 action.doubleClick(doubleclick).build().perform();
			 Alert alert = driver.switchTo().alert();
			 String text =alert.getText();
			 System.out.println(text);
			 
			
		}
		public void draganddop()
		{
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://demoqa.com/droppable");
			 driver.manage().window().maximize();
			 WebElement draganddop = driver.findElement(By.xpath("//div[@id='draggable']"));
			 WebElement drop = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
			 Actions action = new Actions(driver);
			 action.dragAndDrop(draganddop, drop).build().perform();
			 
			 
		}
		
		public void dragsff()
		{
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://demoqa.com/dragabble");
			 driver.manage().window().maximize();
			 WebElement drag = driver.findElement(By.xpath("//div[@id='dragBox']"));
			 Actions action = new Actions(driver);
			 action.dragAndDropBy(drag, 50, 100).build().perform();
			 
			 
			
		}
		 
		public void moseover()
		{
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://demoqa.com/menu/");
			 driver.manage().window().maximize();
			 WebElement mouseover =driver.findElement(By.xpath("//a[text()='Main Item 2']"));
			 Actions action = new Actions(driver);
			 action.moveToElement(mouseover).build().perform();
			 WebElement itesm = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
			 itesm.click();
			 
		}
		
		public void fileupload()
		{
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.guru99.com/test/upload/");
			 driver.manage().window().maximize();
			 WebElement choosefile =driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
			 choosefile.sendKeys("C:\\\\Users\\\\user\\\\git\\\\Selenium-Basics\\\\Selenium_Project\\\\src\\\\main\\\\resources\\\\Whatsapp my profile.docx");
			 
	
		}
		public void iframenoo()
		{
			WebDriver driver = new ChromeDriver();
			   driver.get("https://demoqa.com/frames");
			   driver.manage().window().maximize();
			   List<WebElement> noof =driver.findElements(By.tagName("iframe"));
			   int sizeof = noof.size();
			   System.out.println(" no of iframe "+sizeof);
			   driver.switchTo().frame(1);
			   WebElement text =driver.findElement(By.xpath("h1[@id='sampleHeading']"));
			   String text_value = text.getText();
			   System.out.println(" thhis text"+text_value);
			   
		}
		
		/*public void multiplewindowhandle()
		{
				WebDriver driver = new ChromeDriver();
			   driver.get("https://demo.guru99.com/popup.php");
			   driver.manage().window().maximize();
			   String windowhandle1 =driver.getWindowHandle();
			   WebElement clickme = driver.findElement(By.xpath("//a[text()='Click Here']"));
			   clickme.click();
			   Set<String> totalwindow =driver.getWindowHandles();
			   
			  Iterator<String> itr = totalwindow.iterator();
			   while(itr.hasNext())
			   {
				  String ids = itr.next();
				   if(!ids.equals(windowhandle1))
				   {
					   driver.switchTo().window(ids);
					   WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
					  email.sendKeys("aiswaq@gmail.com");
					  
				   }
			   }
			   
			   
			 //a[text()='Click Here']"));
			"//input[@name='emailid']"));   
			   
			
		}*/
		
		public void multiplewindow()
		{
				WebDriver driver = new ChromeDriver();
			   driver.get("https://demo.guru99.com/popup.php");
			   driver.manage().window().maximize();
			  String parentwindow= driver.getWindowHandle();
			  WebElement clickhere= driver.findElement(By.xpath("//a[text()='Click Here']"));
			  clickhere.click();
			  Set<String> totalwindow =driver.getWindowHandles();
			  Iterator<String> itr =totalwindow.iterator();
			  while(itr.hasNext())
			  {
				  String ids =itr.next();
				  if(!ids.equals(parentwindow))
				  {
					  driver.switchTo().window(ids);
					  WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
					  email.sendKeys("aiswaq@gmail.com");
				  }
				  
				  
			  }
			  
			  
			  
		}
		public void tableex()
		{
				WebDriver driver = new ChromeDriver();
			   driver.get("https://money.rediff.com/indices");
			   driver.manage().window().maximize();
			   WebElement webtable =driver.findElement(By.xpath("//table[@id ='dataTable']//tbody"));
			   List<WebElement> row = webtable.findElements(By.tagName("tr"));
			   int rowsize =row.size();
			   for(int i=0;i<rowsize;i++)
			   {
				   List<WebElement> column =row.get(i).findElements(By.tagName("td"));
				   int columnsize= column.size();
				   for(int j= 0;j<columnsize;j++)
				   {
					   String celltext =column.get(j).getText();
					   if(celltext.equals("S&P BSE 200"))
					   {
						   System.out.println(column.get(1).getText());
					   }
				   }
			   }
			    
			         
		}
		
		public void multipleWindow()
		{
			 WebDriver driver = new ChromeDriver();
			  driver.get("https://demo.guru99.com/popup.php");
			  driver.manage().window().maximize();
			  String parentwindow =driver.getWindowHandle();
			  WebElement clickhere =driver.findElement(By.xpath("//a[text()='Click Here')"));
			  clickhere.click();
			  Set<String> totalwindowid = driver.getWindowHandles();
			  Iterator<String> itr = totalwindowid.iterator();
			  while(itr.hasNext())
			  {
				  String handleid =itr.next();
				  if(!handleid.equals(parentwindow))
				  {
					  driver.switchTo().window(handleid);
					  WebElement emnai= driver.findElement(By.xpath("//input[@name='emailid']"));
					  emnai.sendKeys("dsdsadsa@gmail.com");
					  
				  }
			 }
		}
		public void tagNamess()
		{
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				List<WebElement> tagn =driver.findElements(By.tagName("dd"  ));
				int  no = tagn.size();
				System.out.println(no);
				
		}

		public void dropdowmn()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			driver.manage().window().maximize();
			WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
			Select dropdown = new Select(country);
			//dropdown.selectByValue("ALGERIA");
			dropdown.selectByIndex(0);
			dropdown.selectByIndex(2);
			List<WebElement> value =dropdown.getAllSelectedOptions();
			for(WebElement e :value)
			{
				System.out.println(e.getText());
			}
	
	}
		public void window()
		{
			 WebDriver driver = new ChromeDriver();
			  driver.get("https://demo.guru99.com/popup.php");
			  driver.manage().window().maximize();
			  String parentwindow =driver.getWindowHandle();
			  WebElement clicked = driver.findElement(By.xpath("//a[text()='Click Here']"));
			  clicked.click();
			  Set<String>totalwindow =driver.getWindowHandles();
			  
			  Iterator<String> itr =totalwindow.iterator();
			  while(itr.hasNext())
			  {
				  String handleid = itr.next();
				  if(!handleid.equals(parentwindow))
				  {
					  driver.switchTo().window(handleid);
					  WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
					  email.sendKeys("dhsdh");
				  }
				  
			  }
		}
		
		public void webtable()
		{
			WebDriver driver = new ChromeDriver();
			   driver.get("https://money.rediff.com/indices");
			   driver.manage().window().maximize();
			  WebElement webtable = driver.findElement(By.xpath("//table[@id='dataTable']//tbody"));
			  List<WebElement> row=	webtable.findElements(By.tagName("tr"));
			  int rowsize = row.size();
			  for(int i =0;i<rowsize;i++)
			  {
				 List<WebElement> column =row.get(i).findElements(By.tagName("td"));
				 int columnsize = column.size();
				 for(int j=0;j<columnsize;j++)
				 {
					 String celltext =column.get(j).getText();
				 
					 if(celltext.equals("S&P BSE 200"))
					{
						 System.out.println("valluee"+column.get(1).getText());
						 
					 }
				 }
			  }
		}  
		
//System.out.println(" valiue is "+column.get(1).getText());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample();
		//obj.browserCommand();
		//obj.navigateCommand();
	
		//obj.PartiaLinkText();
		//obj.webElementMethod();
		//obj.webElementMethod();
		//obj.dropDownProgram();
		//obj.multipledropdown();
		//obj.simpleAlert();
		//obj.confimation();
		//obj.promptalet();
		//obj.rightclick();
		//obj.doublecl();
		//obj.draganddop();
		//obj.dragsff();
		//obj.moseover();
		//obj.fileupload();
		//obj. iframenoo();
		//obj.multiplewindow();
		//obj.tableex();
		//obj.multiplewindow();
		//obj.tagNamess();
		//obj.dropdowmn();
		//obj.window();
		obj.webtable();
	}

}
