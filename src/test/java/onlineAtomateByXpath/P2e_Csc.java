package onlineAtomateByXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2e_Csc {

	public static void main(String[] args) {
System.setProperty("wedriver.chrome.driver", "All_Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://csc.myp2e.org/#/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("scccsccompu.ter@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rahul@123");
		driver.findElement(By.xpath("//button[@id='next']")).click();
		WebElement we=driver.findElement(By.xpath("(//span[@class='css-151'])[1]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", we);
		WebElement webAge=driver.findElement(By.xpath("(//label[@class='ms-ChoiceField-field '])[2]"));
		js.executeScript("arguments[0].click()", webAge);
driver.findElement(By.xpath("//span[@id='id__112']")).click();

	}

}
