package navigation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

      class Navigate {
    	  
    	  
	public void login() throws InterruptedException, MalformedURLException {
		
		ChromeDriver drvr=new ChromeDriver();
		
//		drvr.get("https://mansingh13114.netlify.app/");
		
		
//		drvr.get("http://omayo.blogspot.com");

		Navigation navi=drvr.navigate();
	
		navi.to("http://localhost:8888");
		drvr.manage().window().maximize();
		
WebElement username=drvr.findElement(By.xpath("///input[@name='user_name']"));
		
		username.sendKeys("admin");
		
		Actions mousemove=new Actions(drvr);
		
		mousemove.keyDown(Keys.SHIFT).build().perform();
		mousemove.sendKeys(username,"admin").keyUp(Keys.SHIFT).build().perform();
	
//		
//		
//		mousemove.contextClick(username).build().perform();
//		Thread.sleep(4000);
//		
//		drvr.findElement(By.xpath("//input[@name='user_password']")).sendKeys(Keys.ESCAPE);
//		drvr.findElement(By.xpath("//input[@name='user_password']")).click();
////		drvr.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
//		
//		WebElement password=drvr.findElement(By.xpath("//input[@name='user_password']"));
//		
//		password.sendKeys("janu");
//		
//		drvr.findElement(By.xpath("//input[@title='Login [Alt+L]']")).click();
////		drvr.findElement(By.xpath("//img[@title='Open Calculator...']")).click();
//		drvr.navigate().refresh();
//
//
//Thread.sleep(3000);
//
//WebElement button7=drvr.findElement(By.name("calc7"));
//
//mousemove.keyUp(button7, Keys.ENTER).build().perform();
//
//Thread.sleep(3000);
//
//WebElement buttonpluse=drvr.findElement(By.name("plus"));
//
//mousemove.keyUp(buttonpluse, Keys.ENTER).build().perform();
//
//Thread.sleep(3000);
//
//WebElement button6=drvr.findElement(By.name("calc6"));
//
//mousemove.keyUp(button6, Keys.ENTER).build().perform();
//
//Thread.sleep(3000);
//
//WebElement buttonequal=drvr.findElement(By.name("equal"));
//
//mousemove.keyUp(buttonequal, Keys.ENTER).build().perform();
//
//WebElement cutbutton=drvr.findElement(By.xpath("//img[@hspace='5']"));
//		
//mousemove.keyDown(cutbutton, Keys.ENTER).build().perform();
//mousemove.scrollByAmount(0, 800).build().perform();
//
//WebElement Marketingbutton=drvr.findElement(By.linkText("Marketing"));
//Thread.sleep(3000);
//ScrollOrigin scrllorigin=ScrollOrigin.fromElement(Marketingbutton);
// 
//	mousemove.scrollFromOrigin(scrllorigin, 0, 0).build().perform();
//	
//drvr.navigate().back();
//String backtital=drvr.getCurrentUrl();
//System.out.printf(backtital);
//
//drvr.navigate().forward();
//
//drvr.navigate().refresh();
//
//String refreshtitle=drvr.getCurrentUrl();
//System.out.println(refreshtitle);
////drvr.navigate().to("https://www.google.com");
//URL refreshUrl=new URL(refreshtitle);
//drvr.navigate().to(refreshUrl);


	

	
	
	
	
	
	
	
		
		
	}

}
