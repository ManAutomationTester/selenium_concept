package xpathConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeConcept {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.navigate().to("//http:localhost:8888");

		Actions act=new Actions(driver);

		act.sendKeys("admin",Keys.CLEAR).sendKeys(Keys.TAB).sendKeys("admin",Keys.CLEAR).sendKeys(Keys.ENTER).perform();
		try {
			driver.findElement(By.xpath("//a[text()='Gmail Bookmarklet']")).click();

			WebElement webFrame=driver.findElement(By.xpath("//iframe[@id='__vtigerBookmarkletFrame__']"));

			//	driver.switchTo().frame(0); // index number(zero to number-1) 
			//	
			//	driver.switchTo().frame("subject"); // you can give both name and id value....

			driver.switchTo().frame(webFrame);  // you  can pass the webElement's object(it's recommended to use)

			WebElement webSub=driver.findElement(By.xpath("//input[@id='subject']"));

			webSub.clear();

			webSub.sendKeys("Poweful Motivation");

			String expText="Poweful Motivation";

			String actText=webSub.getAttribute("value");

			if (actText.equalsIgnoreCase(expText)) {

				System.out.println("actual and expected value of Subject both are same Google Mail Information");

			} else {

				System.out.println("actual and expected value of Subject both are not same Google Mail Information");


			}
			WebElement webBody=driver.findElement(By.xpath("//textarea[@id='description']"));


			webBody.clear();

			webBody.sendKeys("The road to success and the road to failure are almost exactly the same.");

			String expectBodyText="The road to success and the road to failure are almost exactly the same.";

			String actBodyText=webBody.getAttribute("value");
			
			if(expectBodyText.equalsIgnoreCase(actBodyText)) {

				System.out.println("actual and expected value of body text both are same in Google Mail Information");

			}else {
				System.out.println("actual and expected value of Subject both are not same Google Mail Information");

			}

		}catch(Exception e) {
			
System.out.println(e);
		}
		
		WebElement webSave=driver.findElement(By.xpath("//input[@id='__saveVtigerEmail__']"));
		
		webSave.click();
		
		driver.switchTo().alert().dismiss();
		
		
	}

}
