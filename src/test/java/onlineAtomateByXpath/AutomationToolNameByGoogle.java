package onlineAtomateByXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationToolNameByGoogle {

	public static void main(String[] args) {


		ChromeDriver driver =new ChromeDriver();

		driver.get("https://www.google.com");
		Actions ac=new Actions(driver);
		WebElement search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		ac.sendKeys(search,"automation testing tools").sendKeys(Keys.ENTER).build().perform();
		WebElement seeMore=driver.findElement(By.xpath("//span[@class='PBBEhf']"));
		ac.click(seeMore).build().perform();

		List<WebElement> seleniumTool=driver.findElements(By.xpath("//div[@class='jdsrEf hhv4Fb']//descendant::div[@class='FZPZX q8U8x PZPZlf']"));
		for (int i = 0; i < seleniumTool.size(); i++) {
			String toolName=seleniumTool.get(i).getText();
			System.out.println(i+1+">"+toolName);

		}


	}

}
