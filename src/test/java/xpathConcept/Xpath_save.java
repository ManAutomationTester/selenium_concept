package xpathConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Xpath_save {

	public static void main(String[] args) {

	
		ChromeOptions opt=new ChromeOptions();
		
	opt.addArguments("--remote-allow-origins=*");
	
	ChromeDriver driver=new ChromeDriver(opt);
	
	driver.get("http://localhost:8888");
	
	Actions act=new Actions(driver);
	
	act.sendKeys("admin", Keys.TAB).sendKeys("admin",Keys.ENTER).build().perform();
	
    
	String d=driver.findElement(By.xpath("//a[text()='Marketing']")).getAttribute("href");	
	System.out.println(d);
//	first save button.......
	
	//WebElement webSave1=driver.findElement(By.xpath("//b[contains(text(),'Campaign Information')]/preceding::input[@title='Save [Alt+S]']")).click();
//WebElement webSave2=driver.findElement(By.xpath("//b[text()='Description Information']/ancestor::tr/following-sibling::tr/descendant::input[@title='Save [Alt+S]']"));
//	second save button.......//b[contains(text(),'Description Information')]/ancestor::tr/following-sibling::tr//input[@type='submit']

	
	
	}

}
