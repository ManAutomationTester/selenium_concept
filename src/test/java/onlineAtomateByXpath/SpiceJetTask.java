package onlineAtomateByXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJetTask {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--start-maximized");

//		opt.addArguments("--incognito");

		opt.addArguments("--guest");

		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(opt);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Navigation nav = driver.navigate();

		nav.to("https://www.spicejet.com/");
		
		WebElement startTrip=driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].value='Agra'", startTrip);
		
		Thread.sleep(3000);
		WebElement destination=driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input"));
		
		jse.executeScript("arguments[0].value='DElhi'", destination);
	}

}
