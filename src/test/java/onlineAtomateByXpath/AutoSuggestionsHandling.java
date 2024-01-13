package onlineAtomateByXpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestionsHandling {
	
	public static void main(String[] args) throws InterruptedException{
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--start-maximized");
		
		opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://google.com");
		
		WebElement webFrame=driver.findElement(By.xpath("//iframe[@name='callout']"));
		
		driver.switchTo().frame(webFrame);
		
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		List<WebElement> AutoSugglist=driver.findElements(By.xpath("//div[@id='Alh6id']//li[@class='sbct']"));
		
		for (WebElement weSugg : AutoSugglist) {
			
			String weTextSugg=weSugg.getText();
			
			System.out.println(weTextSugg);
			
			if (weTextSugg.equalsIgnoreCase("selenium tutorial")) {
				
				Thread.sleep(3000);
				
				weSugg.click();
				
				
			}
		}
			
		}
	


}
