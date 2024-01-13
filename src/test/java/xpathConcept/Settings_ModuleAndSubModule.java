package xpathConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Settings_ModuleAndSubModule {

	public static void main(String[] args) {

	ChromeOptions opts=new ChromeOptions();
	
	opts.addArguments("--remote-allow-origins=*");
	
	ChromeDriver driver=new ChromeDriver(opts);
	
	driver.get("http://localhost:8888");
	
	Actions ac=new Actions(driver);
	
	ac.sendKeys("admin1",Keys.TAB).sendKeys("janu",Keys.ENTER).build().perform();
	
	System.out.println(".....the main header link is given as below :- ");
	
	List<WebElement> mainheaderlink=driver.findElements(By.xpath("//td[@class='small' ]//table//td[@class='small']"));
	
	 int mainheadersize=mainheaderlink.size();
	 
	for (int j = 0; j < mainheadersize; j++) {
		
		WebElement singleweb=mainheaderlink.get(j);
		
		String mainheader =singleweb.getText();
		
		System.out.println(j+1+": "+mainheader);
		
	}
	System.out.println(".....the drag and drop elemens is given as below :- ");

	List<WebElement> alldragtext=driver.findElements(By.xpath("//td[@class='homePageMatrixHdr']//b"));
	
	int dragsize=alldragtext.size();
	
	for (int i = 0; i <dragsize ; i++) {
		
		String innerText=alldragtext.get(i).getText();
		
		System.out.println(i+1+":- "+innerText);
	
	}
	driver.findElement(By.linkText("Settings")).click();
	
	List<WebElement> settingModule=driver.findElements(By.xpath("//td[@class='settingsTabHeader']"));
	
	List<WebElement> userSubModule=driver.findElements(By.xpath("//td[@class='settingsIconDisplay small']"));

	for (int i = 0; i <settingModule.size(); i++) {
		
		String textsettingModule=settingModule.get(i).getText();
		
		System.out.println("========="+textsettingModule+"=======");
		
		String textuserSubModule =userSubModule.get(i).getText();
		
		System.out.println(textuserSubModule);
		
		
	}
	
	}

}
