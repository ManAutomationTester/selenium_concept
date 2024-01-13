package xpathConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutNetAutomate {

	public static void main(String[] args) {
		
		
		
		ChromeOptions opts=new ChromeOptions();
		
		opts.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(opts);
		
		driver.get("http://localhost:8888");
		
//		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//input[@name='user_password']/parent::td/parent::tr/preceding-sibling::tr//td[last()]/input")).sendKeys("admin1");
		
		driver.findElement(By.xpath("//td[@class='small']//input[@name='user_password']")).sendKeys("janu");
		
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		driver.findElement(By.linkText("Marketing")).click();
		
		driver.findElement(By.xpath("//img[@title='Show World Clock...']")).click();
		

		
		List<WebElement> allwatchnum=driver.findElements( By.xpath("//div[@id='S5']/following-sibling::div"));
		
//		for (WebElement webElement : allwatchnum) {
//			
//			String text=webElement.getText();
//			
//			System.out.println(text);
//		}
for (int i = 0; i < 2; i++) {
	
	String alltext=allwatchnum.get(i+10).getText();
	
	System.out.println(alltext);
}

for (int i = 0; i < 10; i++) {
	
	String alltext=allwatchnum.get(i).getText();
	
	System.out.println(alltext);

	
}



}}
