package onlineAtomateByXpath;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FetchDataUsingMap {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "All_Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		Actions ac=new Actions(driver);		
		ac.sendKeys(Keys.ESCAPE).perform();
		WebElement webtext=driver.findElement(By.xpath("//input[@name='q']"));
		ac.sendKeys(webtext,"mobile").sendKeys(Keys.ENTER).build().perform();
		getMapData();


	}
	
	public static void mapLst() {
		List<WebElement> phoneName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 List<WebElement> RatingLst=driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_3LWZlK']"));
		Map<String,WebElement> mpLst=new HashMap<>();

	}
	public static void getMapData() {
		List<WebElement> phoneAmount=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<WebElement> phoneDiscription=driver.findElements(By.xpath("//ul[@class='_1xgFaf']"));
		List<WebElement> phoneName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		Map<String,String> mpNameData=new HashMap<>();
		Map<String,String> mpDiscriptionData=new HashMap<>();

		for(int i=0;i<phoneName.size();i++) {
			String phNm=phoneName.get(i).getText();
			String phAmnt=phoneAmount.get(i).getText();
			String phDscptn=phoneDiscription.get(i).getText();
			mpNameData.put(phNm, phAmnt);
			mpDiscriptionData.put(phNm, phDscptn);
			System.out.println((i+1)+" >"+"Mobile Name :- "+phNm+" ="+phAmnt);
			System.out.println(mpDiscriptionData.get(phNm));
			System.out.println("______________________________________________________");
			 
		}
	}

}
