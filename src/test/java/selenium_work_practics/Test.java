package selenium_work_practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","All_Driver\\chromedriver.exe" );
		
		
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	
	WebElement d=driver.findElement(By.xpath("//input[@name='q']"));
	
	d.sendKeys("facebook.com");
		
		
	}

}
