package onlineAtomateByXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class foundItChalenge {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 driver.findElement(By.xpath("//a[contains(@href,'javascript:void(0);')]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[text()=' Years']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='2 Years']")).click();
/*
 * First of all we inspect the Element and press ctrl+shift+p then run commond(Developer tool)
 * will open and search "focus" in run commond
 * >Emulate a focus page(click here)
 * then we easily inspect the disapearing element
 */
		 
	}
	

}
