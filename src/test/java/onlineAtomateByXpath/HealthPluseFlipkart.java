package onlineAtomateByXpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HealthPluseFlipkart {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--remote-allow-origins=*");
opt.addArguments("--disable-notifications");
ChromeDriver driver=new ChromeDriver(opt);
driver.get("https://healthplus.flipkart.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
Actions ac=new Actions(driver);
ac.sendKeys(Keys.ESCAPE).build().perform();
Thread.sleep(4000);
WebElement search=driver.findElement(By.xpath("//input[@id='searchTextForTop']"));
ac.sendKeys(search,"cream").build().perform();

Thread.sleep(5000);
ac.sendKeys(search, Keys.ENTER).build().perform();

List<WebElement> allCreamName=driver.findElements(By.xpath("//div[@class='name_qview']"));
List<WebElement> allCreamRate=driver.findElements(By.xpath("//big"));


for (int i = 0; i <allCreamName.size(); i++) {
	String creamNameText=allCreamName.get(i).getText();
	String creamRateText=allCreamRate.get(i).getText();
	System.out.println(i+1+". "+creamNameText+"= "+creamRateText);

	
	allCreamName=driver.findElements(By.xpath("//div[@class='name_qview']"));
      allCreamRate=driver.findElements(By.xpath("//big"));
  
  	WebElement youtube=driver.findElement(By.xpath("//a[@title='Youtube']"));
      ac.scrollToElement(youtube).build().perform();
	
}
	}

}
