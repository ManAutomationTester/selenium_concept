package onlineAtomateByXpath;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrokenLinkChecker {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Man_Singh_Main_Practics_In_Eclips\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Navigate to BStackDemo Website
		driver.get("http://localhost:8888/");
		Actions act=new Actions(driver);
		act.sendKeys("admin",Keys.TAB).sendKeys("admin",Keys.ENTER).build().perform();
		driver.findElement(By.linkText("Marketing")).click();

		List<WebElement> allTag=driver.findElements(By.tagName("a"));

		for(WebElement oneWeb:allTag) {
			String link=oneWeb.getAttribute("href");
			System.out.println(link);
			URL url = null;
			try {
			  url=new URL(link);
				HttpsURLConnection huc=(HttpsURLConnection)url.openConnection();
				huc.setConnectTimeout(3000);
				huc.connect();
				if (huc.getResponseCode()==200) {
					System.out.println(url+"-"+huc.getResponseMessage());
				} else {
					System.out.println(url+"-"+huc.getResponseMessage()+" is a broken link");
				}	
			}catch(Exception e) {
				System.out.println(url + " - " + "is a broken link");
				
			}
		}
	}

}
