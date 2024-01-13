package To_Handle_Mouse_And_Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String...args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");

ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);

		driver.get("http://localhost:8888");
		
		
		Thread.sleep(3000);
//Navigation n=driver.navigate(); 

//		Actions ac=	  new Actions(driver);
		
//						ac.sendKeys("admin",Keys.TAB).build().perform();
//						ac.sendKeys("janu",Keys.TAB).build().perform();
//						ac.sendKeys("woodspice",Keys.TAB).build().perform();
//				ac.sendKeys("woodspice",Keys.TAB).build().perform();
//				ac.sendKeys("ES Spanish",Keys.TAB).build().perform();
////				ac.sendKeys(Keys.ENTER).build().perform();
 
		//		                  =======OR=====

//		ac.sendKeys("admin", Keys.TAB).sendKeys("janu", Keys.TAB).sendKeys("woodspice", Keys.TAB).sendKeys("ES Spanish",Keys.TAB).sendKeys(Keys.ENTER).build().perform();

		Actions mouseoverAct=new Actions(driver);
		
		
		WebElement theme=driver.findElement(By.xpath("//select[@name='login_theme']"));
		
		mouseoverAct.sendKeys(theme,Keys.ARROW_DOWN).click().build().perform();

//				WebElement uname=driver.findElement(By.xpath("//input[@name='user_name']"));
//		
//				uname.sendKeys("admin");
//				String tagname=uname.getTagName();
//	System.out.println(tagname);
//		
//		mouseoverAct.contextClick(uname).build().perform();
//		
//		driver.manage().window().maximize();
//		WebElement ui=driver.findElement( By.xpath("//body"));
//		
//		ui.click();
		
 //		Thread.sleep(10000);
//				WebElement pass=driver.findElement(By.xpath("//input[@name=\"user_password\"]"));
//		
//				pass.sendKeys("janu");
//				
//				pass.click();
//
//                driver.navigate().refresh();
//
//				WebElement buttonlog=driver.findElement(By.xpath("//input[@name=\"Login\"]"));
//				
//				mouseoverAct.contextClick(buttonlog).build(). perform();			
//				buttonlog.click();

		//		driver.navigate().refresh();

		//		driver.manage().window().fullscreen();


		////   clickAndHold ,moveToElement , release
		//		WebElement weDrag=driver.findElement(By.xpath("//b[contains(text(),'Top Invoices')]"));
		//
		//		WebElement weDrop=driver.findElement(By.xpath("//b[contains(text(),'Top Quotes')]"));
		//
		//		mouseoverAct.clickAndHold(weDrag).moveToElement(weDrop).release().build().perform();
		//
		//		mouseoverAct.dragAndDrop(weDrag, weDrop).build().perform();
		//
		//		WebElement marktingbutton=driver.findElement(By.xpath("//a[text()='Marketing']"));
		//
		//		mouseoverAct.moveToElement(marktingbutton).build().perform();
		//
		//		WebElement leadsbutton=driver.findElement(By.linkText("Leads"));
		//
		//		mouseoverAct.contextClick(leadsbutton).build().perform();
		//		Thread.sleep(5000);
		//	driver.navigate().refresh();


		//mouseoverAct.moveToElement(markbutton).doubleClick().build().perform();
		//driver.navigate().back();

		//		  WebElement Toolsbutton=driver.findElement(By.xpath("//a[text()='Tools']"));
		//		  
		//		  mouseoverAct.doubleClick(Toolsbutton).build().perform();
		//		  
		//		  WebElement
		//		  allmenubutton=driver.findElement(By.xpath("//img[@title='Open All Menu...']")
		//		  );mouseoverAct.moveToElement(allmenubutton).doubleClick().build().perform();
		//		  Thread.sleep(3000); WebElement
		//		  Commentsbutton=driver.findElement(By.linkText("Comments"));
		//		  mouseoverAct.moveToElement(Commentsbutton).click().build().perform();
		//		  
		//		  WebElement
		//		  plusebutton=driver.findElement(By.xpath("//img[@alt='Create Comment...']"));
		//		  mouseoverAct.moveToElement(plusebutton).doubleClick().build().perform();
		//		  WebElement commentbutton=driver.findElement(By.xpath(
		//		  "//textarea[@name='commentcontent']"));
		//		  mouseoverAct.moveToElement(commentbutton).click(commentbutton).
		//		  sendKeys("Comments Information by man singh").build().perform();
		//		  
		//		  
		//		  WebElement groupbutton=driver.findElement(By.xpath("//input[@value='T']"));
		//		  
		//		  mouseoverAct.moveToElement(groupbutton).click(groupbutton).build().perform();
		//		  Point locationcomment=commentbutton.getLocation();
		//		  System.out.println(locationcomment);
		//		  driver.findElement(By.xpath("(//input[@name='button'])[4]")).click();
		//		  
		//		  WebElement
		//		  searchforbutton=driver.findElement(By.xpath("//input[@name='search_text']"));
		//		  Point searchbutton=searchforbutton.getLocation();
		//		  System.out.println(searchbutton);
		//		 
		//	WebElement selectallbutton=driver.findElement(By.xpath("//input[@name='selectall']"));
		//	mouseoverAct.contextClick(selectallbutton).build().perform();
		//
		//	WebElement newbutton =driver.findElement(By.linkText("New"));
		//		mouseoverAct.click(newbutton).build().perform();
		//
		//	WebElement viewnamebutton=driver.findElement(By.xpath("//input[@name='viewName']"));
		//Point cordviewname=viewnamebutton.getLocation();	
		//	System.out.println(cordviewname);
		//	mouseoverAct.sendKeys(viewnamebutton, "Er. Man Singh").build().perform();
		//	WebElement setDefaultbutton=driver.findElement(By.xpath("//input[@name='setDefault']"));
		//mouseoverAct.click(setDefaultbutton).build().perform();
		//
		//WebElement setMetricstbutton=driver.findElement(By.xpath("//input[@name='setMetrics']"));
		//mouseoverAct.click(setMetricstbutton).build().perform();
		//
		//WebElement setStatusbutton=driver.findElement(By.xpath("//input[@name='setStatus']"));
		//mouseoverAct.click(setStatusbutton).build().perform();
		//
		//driver.findElement(By.linkText("My Home Page")).click();
		//WebElement toppurchasebutton=driver.findElement(By.xpath("//b[contains(text(),'Top Purchase Orders')]"));
		//WebElement myrecentbutton=driver.findElement(By.xpath("//b[contains(text(),'My Recent FAQs')]"));
		//Point cordrecentbutton=myrecentbutton.getLocation();
		//System.out.println(cordrecentbutton);
		//Thread.sleep(3000);
		//mouseoverAct.clickAndHold(toppurchasebutton).moveToElement(toppurchasebutton).release(myrecentbutton).build().perform(); 
		//mouseoverAct.scrollByAmount(150, 120).build().perform();









	}

}
