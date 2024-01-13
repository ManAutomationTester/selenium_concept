package xpathConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpOfDelete {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://localhost:8888");
		
//		driver.switchTo().newWindow(WindowType.TAB); ....... [for new open window ]
		
		Actions acts=new Actions(driver);
		
		acts.sendKeys("admin",Keys.TAB).sendKeys("admin", Keys.ENTER).build().perform();
		
		WebElement markButton=driver.findElement(By.xpath("//a[text()='Marketing']"));
		
		acts.moveToElement(markButton).build().perform();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//input[@id='8']")).click();
		
		driver.findElement(By.xpath("//a[.='New']/preceding::input[@value='Delete']")).click();
		
		String actAlertText=driver.switchTo().alert().getText();
		
		String expAlertText="Are you sure you want to delete the selected 1 records?";
		
		if (actAlertText.equalsIgnoreCase(expAlertText)) {
			
			System.out.println("the actual alert i.e :- "+actAlertText +" and "+"the expected alert text i.e "+expAlertText+":- both are same ");
			
		}else {
			System.out.println("the actual alert i.e :- "+actAlertText +" and "+"the expected alert text i.e "+expAlertText+" :- both are not same ");
			
		}
		Thread. sleep(3000);
		
		driver.switchTo().alert().dismiss();
	
}
 }
