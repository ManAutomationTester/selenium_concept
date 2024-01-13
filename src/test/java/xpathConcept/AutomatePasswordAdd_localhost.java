package xpathConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AutomatePasswordAdd_localhost {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions act=new Actions(driver);
		act.sendKeys("admin", Keys.TAB).sendKeys("admin", Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//a[text()='Settings']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
		driver.findElement(By.xpath("//img[@title='Duplicate']")).click();
		WebElement user=driver.findElement(By.xpath("//input[@name='user_name']"));
		user.clear();
		user.sendKeys("admin1");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("janu");
		driver.findElement(By.xpath("//input[@name='confirm_password']")).sendKeys("janu");
		driver.findElement(By.xpath("//strong[text()='1. User Login & Role']/preceding::input[@title='Save [Alt+S]']")).click();
		
Navigation nav=driver.navigate();
nav.back();
nav.back();
nav.back();
nav.back();
		Thread.sleep(5000);
driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
username.clear();
username.sendKeys("admin1");

WebElement userpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
userpassword.clear();
userpassword.sendKeys("janu");
driver.findElement(By.xpath("//input[@name='Login']")).click();



	}

}
