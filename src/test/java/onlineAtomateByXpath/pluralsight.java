package onlineAtomateByXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pluralsight {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https:www.pluralsight.com");
		
		WebElement webFrame=driver.findElement(By.xpath("//iframe[@id='MktoForms2XDIframe']"));
		driver.switchTo().frame(webFrame);
		driver.findElement(By.xpath("//div[@id='transcend-consent-manager']")).click();
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.TAB).build().perform();
		WebElement acceptAll=driver.findElement(By.xpath("//button[@class='button']/child::span[text()='Accept all']"));
		
		ac.click(acceptAll).build().perform();
		
		
		
	}

}
