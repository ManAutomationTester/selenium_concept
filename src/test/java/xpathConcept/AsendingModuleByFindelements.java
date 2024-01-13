package xpathConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AsendingModuleByFindelements {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8888");
		
Actions ac=new Actions(driver);
		
		ac.sendKeys("admin", Keys.TAB).sendKeys("admin", Keys.ENTER).build().perform();

		WebElement marketingbutton=driver.findElement(By.xpath("//a[text()='Marketing']"));
		
		ac.moveToElement(marketingbutton).build().perform();
		
List<WebElement> allMarketinglink=driver.findElements(By.xpath("//div[@class='drop_mnu']//a[contains(@href,'Marketing')]"));
		
		int sizeallMarketing=allMarketinglink.size();
			
		for (int j = 0; j < sizeallMarketing; j++) {
			
			WebElement allweblinkMark=allMarketinglink.get(j);
			
			String linkMarketing=allweblinkMark.getText();
			
			System.out.println(j+1+"> "+linkMarketing);
		
			
		}
		
		
	}

}
