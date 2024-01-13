package onlineAtomateByXpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SamsungMobileFlipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https:www.flipkart.com/");
		driver.manage().window().maximize();
		Actions acts=new Actions(driver);
		acts.sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement webElectronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
		acts.moveToElement(webElectronics).build().perform();
		driver.findElement(By.xpath("//a[text()='Samsung']")).click();

		List<WebElement> allSamsunglist=driver.findElements(By.xpath("//h2[@class='_1DYSFX']"));
		List<WebElement> allSamsungName=driver.findElements(By.xpath("//h2[@class='_1DYSFX']/following::a[@class='s1Q9rs']"));
		List<WebElement> allSamsungRate=driver.findElements(By.xpath("//h2[@class='_1DYSFX']/following::div[@class='_30jeq3']"));

		
		for (int i = 0; i < allSamsunglist.size(); i++) {
			allSamsunglist=driver.findElements(By.xpath("//h2[@class='_1DYSFX']"));
			String samsungHeaderText=allSamsunglist.get(i).getText();
			System.out.println("====== "+samsungHeaderText+" =========");
			System.out.println();
			for (int j = 0; j < allSamsungName.size(); j++) {
				String TextSamsungName=allSamsungName.get(j).getText();
				String TextSamsangRate=allSamsungRate.get(j).getText();
				System.out.println(TextSamsungName+" = "+TextSamsangRate);

			}
		
		}
		
	}

}
