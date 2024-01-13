package onlineAtomateByXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AutomateGoogle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");

		ChromeOptions opt=new ChromeOptions();
		
//		opt.addArguments("--disable-notifications");
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(opt);
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https:google.com");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB,Keys.TAB).sendKeys(Keys.TAB,Keys.ENTER).build().perform();
		
		////  how to handle pop up......

//		driver.switchTo().alert().dismiss();
//			
//		Navigation nav=driver.navigate();
//		
//		nav.refresh();
		
		
	////  how to handle iframe......
		
		WebElement nothanks =driver.findElement(By.xpath("//iframe[@name='callout']"));
		
		driver.switchTo().frame(nothanks);
		
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		
		
		driver.switchTo().defaultContent();
		
		Actions act1=new Actions(driver);
		
		WebElement websurch=driver.findElement(By.xpath("//input[@name='q']"));

		act1.sendKeys(websurch, "make my trip ",Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//h3[text()='MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights ...']")).click();
	
		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	}

}
