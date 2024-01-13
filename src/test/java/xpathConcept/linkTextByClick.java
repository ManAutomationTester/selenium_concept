package xpathConcept;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class linkTextByClick {

	public static void main(String[] args) {

		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(opt);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://localhost:8888");
		
		Actions act=new Actions(driver);
	
		act.sendKeys("admin", Keys.TAB).sendKeys("admin", Keys.ENTER).build().perform();
		
		List<WebElement> hyperlink=driver.findElements(By.xpath("//td[contains(@class,'Selected')]"));
		
		List<WebElement> sublink=driver.findElements(By.xpath("//td[contains(@class,'level2')]"));
		
		for (int i = 0; i < hyperlink.size(); i++) {
			
			hyperlink=driver.findElements(By.xpath("//td[contains(@class,'Selected')]"));
			
			WebElement oneweb=hyperlink.get(i);
						
			System.out.println("# "+"this is "+oneweb.getText()+" link and it's sublink is given as below the line ");

			System.out.println(i+1+"   ========= "+oneweb.getText()+"==========");
			
			oneweb.click();
			

			for (int j = 0; j < sublink.size(); j++) {
				
				sublink=driver.findElements(By.xpath("//td[contains(@class,'level2')]"));
				
				
				WebElement onesublink=sublink.get(j);
				
				System.out.println(j+1+"."+onesublink.getText());
				
//				onesublink.click();
				
				List<WebElement> serieslinktext =driver.findElements(By.xpath("//td[@class='moduleName']"));

				for (int k = 0; k <serieslinktext.size() ; k++) {
					
					 serieslinktext =driver.findElements(By.xpath("//td[@class='moduleName']"));
				
					 String sereiestext=serieslinktext.get(k).getText();
					
//					System.out.println(sereiestext);
				}
				
			}
		
		}
	
	}

}
