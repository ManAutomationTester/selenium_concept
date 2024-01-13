package onlineAtomateByXpath;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Man_Singh_Main_Practics_In_Eclips\\selenium\\Driver\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Navigate to BStackDemo Website
		driver.get("http://localhost:8888/");
		Actions act=new Actions(driver);
		act.sendKeys("admin",Keys.TAB).sendKeys("admin",Keys.ENTER).build().perform();

		// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Iterating each link and checking the response status
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			verifyLink(url);
		}

	}


	public static void verifyLink(String url) {
		try {
			URL link = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();
			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
		} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
		}
	}
}