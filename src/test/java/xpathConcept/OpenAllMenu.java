package xpathConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class OpenAllMenu {

	public static void main(String[] args) {
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--remote-allow-origins=*");

ChromeDriver driver=new ChromeDriver(opt);

driver.get("http://localhost:8888");

Actions act=new Actions(driver);
act.sendKeys("admin",Keys.TAB).sendKeys("admin",Keys.ENTER).build().perform();

driver.findElement(By.xpath("//img[@alt='Open All Menu...']")).click();

List<WebElement> headerlist=driver.findElements(By.xpath("//span[@class='allMnuHdr']"));

for (int i = 0; i < headerlist.size(); i++) {
	
	String textheaderlist=headerlist.get(i).getText();
	
	System.out.println(i+1+">:==========="+textheaderlist+"========");
	
	List<WebElement> subModulelist=driver.findElements(By.xpath("//span[@class='allMnuHdr']/following-sibling::a[contains(@href,'"+textheaderlist+"')]"));

	for (int j = 0; j < subModulelist.size(); j++) {
	
	String textsubModulelist=subModulelist.get(j).getText();
	
	System.out.println(textsubModulelist);

}
}

}
}