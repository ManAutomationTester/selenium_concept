package onlineAtomateByXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApowerSoftRecorder {

	public static void main(String[] args) {
		
		ApowerSoftRecorder.openApowerShoft();
		
		
	}
	public static void openApowerShoft() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		
		WebElement nothanks=driver.findElement(By.xpath("//iframe[@name='callout']"));
		
		driver.switchTo().frame(nothanks);
		
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();

		driver.switchTo().defaultContent();
		Actions ac=new Actions(driver);
		
		WebElement searchBox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		ac.sendKeys(searchBox, "https://apowersoft.id/free-online-screen-recorder").sendKeys(searchBox, Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//h3[text()='Free Online Screen Recorder - Apowersoft']")).click();
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='download3']")).click();
		
	
	}

}
