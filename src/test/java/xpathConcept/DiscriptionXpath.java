package xpathConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DiscriptionXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8888");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act=new Actions(driver);
		
		act.sendKeys("admin",Keys.TAB).sendKeys("admin",Keys.ENTER).build().perform();
		
		driver.findElement(By.linkText("Marketing")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		
		WebElement creatNewCom=driver.findElement(By.xpath("//span[text()='Creating New Campaign']"));
		
		
		WebElement webCalender=driver.findElement(By.xpath("//img[@id='jscal_trigger_closingdate']"));
		
		act.click(webCalender).build().perform();
		
		
		WebElement crossHairCalender=driver.findElement(By.xpath(""));
		
		Thread.sleep(3000);
		
		act.dragAndDrop(creatNewCom, webCalender).perform();

		
		
		

//		WebElement webOnlyUser=driver.findElement(By.xpath("//input[@value='U']/parent::td/text()[contains(normalize-space(),'User')] "));
//		
//		WebElement webOnlyGroup=driver.findElement(By.xpath("//input[@value='U']/parent::td/text()[contains(normalize-space(),'Group')]"));
//
//	String userText=webOnlyUser.getText();
//		
//		System.out.println("User Text--"+userText);
//	
//		String groupText=webOnlyGroup.getText();
//		
//		System.out.println("Group text--"+groupText);
//	

		
//		WebElement Description=driver.findElement(By.xpath("//font[@color='red']/parent::td/text()[normalize-space()='Description']"));
//		
//		String text=Description.getText();
//		
//		System.out.println(text);
//		
	}

}
