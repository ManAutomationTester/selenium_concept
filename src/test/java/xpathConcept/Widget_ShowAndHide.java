package xpathConcept;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Widget_ShowAndHide {

	public static void main(String[] args) throws InterruptedException {

	
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(opt);
		
		driver.get("http://localhost:8888");
		
		Actions act=new Actions(driver);
		
		act.sendKeys("admin",Keys.TAB).sendKeys("admin", Keys.ENTER).build().perform();

		List<WebElement> allWidget=driver.findElements(By.xpath("//table[@class='small showPanelBg']//img[@title='Hide']"));
	
		for (int i = 0; i < allWidget.size(); i++) {
			
			Thread.sleep(3000);
			
			allWidget.get(i).click();
			
		}
	driver.findElement(By.xpath("//a[.='My Preferences']")).click();
	
	driver.findElement(By.xpath("//input[@name='Edit']")).click();
	
	List<WebElement> uncheckedwidget=driver.findElements(By.xpath("//  input[@type='radio' and not(@checked)]"));

	List<WebElement> namewidget=driver.findElements(By.xpath("//strong[text()='7. Home Page Components']/following::td[@class='dvtCellLabel']"));

	
	for (int i = 0; i < uncheckedwidget.size(); i++) {
		
		WebElement oneWedget=uncheckedwidget.get(i);
		
		String widgetText=namewidget.get(i).getText();
		
		System.out.println(i+1+":--"+widgetText);
		
		Thread.sleep(1000);
		
		oneWedget.click();
	}
	
	driver.findElement(By.xpath("//strong[text()='8. Tag Cloud Display']/following::input[@title='Save [Alt+S]']")).click();
	
	driver.findElement(By.xpath("//a[.='My Home Page']")).click();
	
	
	
	
	}

}
