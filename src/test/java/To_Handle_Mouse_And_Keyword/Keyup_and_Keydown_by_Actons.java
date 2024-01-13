package To_Handle_Mouse_And_Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class Keyup_and_Keydown_by_Actons {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");
	
ChromeOptions options=new ChromeOptions();

options.addArguments("--remote-allow-origins=*");

ChromeDriver driver=new ChromeDriver(options);
	
	driver.get("http://localhost:8888");
	
	driver.manage().window().maximize();
	
	Actions objaction=new Actions(driver);
	
	WebElement username=driver.findElement(By.name("user_name"));
	
	objaction.sendKeys(username ,"admin").build().perform();
	WebElement pass=driver.findElement(By.name("user_password"));
	objaction.sendKeys(pass,"janu").build().perform();
	WebElement buttonlog=driver.findElement(By.xpath("//input[@name=\"Login\"]"));
	objaction.click(buttonlog).build().perform();
	
	WebElement mark=driver.findElement(By.linkText("Marketing"));
	ScrollOrigin markbutton=ScrollOrigin.fromElement(mark);
	objaction.scrollFromOrigin(markbutton, 0, 500).build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
