package onlineAtomateByXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");
		
		SearchContext driver1=new ChromeDriver();// searchContext
		
		WebDriver driver2=new ChromeDriver();/// parent
		
		ChromeDriver driver=new ChromeDriver();  /// child
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		Actions act=new Actions(driver);
		
		act.sendKeys(search, "mobile").sendKeys(Keys.ENTER).build().perform();
		
		WebElement firstMobile=driver.findElement(By.xpath("//div[@data-component-id='2']//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		String textFirstMobile=firstMobile.getText();
		
		System.out.println(textFirstMobile);
		
		WebElement searchagain=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		searchagain.clear();
		
		act.sendKeys(searchagain, textFirstMobile).sendKeys(Keys.ENTER).build().perform();
		 
		WebElement secondMobile=driver.findElement(By.xpath("//div[@data-component-id='2']//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		String textsecondMobile=secondMobile.getText();
		
		if (textsecondMobile.contains(textFirstMobile)) {
			
			System.out.println("your first and second mobile text is same so your test case is pass");
		} else {
			System.out.println("your first and second mobile text is not same so your test case is fail");
			
			System.out.println("because your of this :-  "+textsecondMobile);
 		}
		
		
	}

}
