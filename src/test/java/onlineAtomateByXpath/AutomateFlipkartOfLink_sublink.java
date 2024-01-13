package onlineAtomateByXpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AutomateFlipkartOfLink_sublink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");

		ChromeOptions opts=new ChromeOptions();

		opts.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(opts);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.flipkart.com");

		Actions ac=new Actions(driver);

		ac.sendKeys(Keys.ESCAPE).build().perform();


		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile phone");

		driver.findElement( By.xpath("//button[@type='submit']")).click();

		//Thread.sleep(5000);

		List<WebElement> number=driver.findElements(By.xpath("//nav[@class='yFHi8N']//a"));

		int allnumber=number.size();

		System.out.println(allnumber);

		//for (int i = 0; i < allnumber; i++) {
		//	
		//	number=driver.findElements(By.xpath("//nav[@class='yFHi8N']//a"));
		//	
		//	number.get(i).click();
		//	
		//	Thread.sleep(5000);

		List<WebElement> allTshirtName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));

		List<WebElement> allTshirtRate=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));


		int allTshirtRateName =allTshirtName.size();

		System.out.println(allTshirtRateName);

		for (int j = 0; j < allTshirtRateName; j++) {


			WebElement singlewebName=allTshirtName.get(j);

			String singlewebNameText=singlewebName.getText();

			WebElement singlewebRate=allTshirtRate.get(j);

			String singlewebNameRate=singlewebRate.getText();


			System.out.println(j+1+">"+singlewebNameText+" = "+singlewebNameRate);

		}

		//	Thread.sleep(5000);

		System.out.println("..............all link .................");

		List<WebElement> allheaderlist=driver.findElements( By.xpath("//div[@class='_1kidPb']/*"));

		int headercount=allheaderlist.size();


		System.out.println(headercount);

		for (int i = 0; i < headercount; i++) {

			String allheadertext=allheaderlist.get(i).getText();

			System.out.println(i+1+">"+allheadertext);

		}

		WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));

		ac.moveToElement(electronics).build().perform();

		System.out.println("..............all sub link of electronics .................");



		List<WebElement>  allsublinkElectronics=driver.findElements(By.xpath("//div[@class='_1QrT3s']//a[@class='_3QN6WI _1MMnri _32YDvl']"));

		int countsublinkelectrinics=allsublinkElectronics.size();

		for (int i = 0; i < countsublinkelectrinics; i++) {

			//		Thread.sleep(5000);

			String allsublinktextelectronics=allsublinkElectronics.get(i).getText();

			System.out.println(i+1+"."+allsublinktextelectronics);
		}

		System.out.println("........all sublink of moblies....... ");

		List<WebElement>  allsublinkMobiles=driver.findElements(By.xpath("//a[@title='Mobiles']/following-sibling::a"));

		int countsublinkmobiles=allsublinkMobiles.size();

		for (int i = 0; i < countsublinkmobiles; i++) {

			String allsublinktextmobiles=allsublinkMobiles.get(i).getText();

			System.out.println(i+1+"."+allsublinktextmobiles);
		}
		System.out.println("........all sub link of Mobile Accessories...........");

		List<WebElement>   allsublinkmobileaccessories=driver.findElements(By.xpath("//a[@title='Smart Wearable Tech']/preceding-sibling::a[@class='_3QN6WI']"));

		int countmobileaccessories=allsublinkmobileaccessories.size();

		for (int i = 0; i < countmobileaccessories; i++) {

			String alltextmobileaccessories=allsublinkmobileaccessories.get(i).getText();

			System.out.println(alltextmobileaccessories);

		}



		System.out.println("........all sub link of Smart Wearable Tech...........");

		List<WebElement>   allsublinkSmartWearableTech=driver.findElements(By.xpath("//a[@title='Smart Wearable Tech']/following-sibling::a[contains(@href,'/smart')]"));

		int countSmartWearableTech=allsublinkSmartWearableTech.size();

		for (int i = 0; i < countSmartWearableTech; i++) {

			String alltextSmartWearableTech=allsublinkSmartWearableTech.get(i).getText();

			System.out.println(alltextSmartWearableTech);

		}


		System.out.println("........all sub link of Health Care Appliances...........");

		List<WebElement>   allsublinkHealthCareAppliances=driver.findElements(By.xpath("//a[@title='Health Care Appliances']/following-sibling::a"));

		int countHealthCareAppliances=allsublinkHealthCareAppliances.size();

		for (int i = 0; i < countHealthCareAppliances; i++) {

			String alltextHealthCareAppliances=allsublinkHealthCareAppliances.get(i).getText();

			System.out.println(alltextHealthCareAppliances);

		}

		System.out.println("........all sub link of Gaming & Accessories...........");

		List<WebElement>   allsublinkGamingAccessories=driver.findElements(By.xpath("//a[@title='Computer Peripherals']/preceding-sibling::a[@class='_3QN6WI'  and not(contains(@title,'Gaming Laptops'))]"));

		int countGamingAccessories=allsublinkGamingAccessories.size();

		for (int i = 0; i < countGamingAccessories; i++) {

			String alltextGamingAccessories=allsublinkGamingAccessories.get(i).getText();

			System.out.println(alltextGamingAccessories);
		}



		System.out.println("........all sub link of Computer Peripherals...........");

		List<WebElement>   allsublinkComputerPeripherals=driver.findElements(By.xpath("//a[@title='Computer Peripherals']/following-sibling::a[@class='_3QN6WI' and not (contains(@href,'ipads'))]"));

		int countComputerPeripherals=allsublinkComputerPeripherals.size();

		for (int i = 0; i < countComputerPeripherals; i++) {

			String alltextComputerPeripherals=allsublinkComputerPeripherals.get(i).getText();

			System.out.println(alltextComputerPeripherals);
		}

		System.out.println("........all sub link of Speaker...........");

		List<WebElement>   allsublinkSpeaker=driver.findElements(By.xpath("//a[@title='Smart Home Automation']/preceding-sibling::a[@class='_3QN6WI' and  not(contains(@title,'Televisions'))]"));

		int countSpeaker=allsublinkSpeaker.size();

		for (int i = 0; i < countSpeaker; i++) {

			String alltextSpeaker=allsublinkSpeaker.get(i).getText();

			System.out.println(alltextSpeaker);
		}


		System.out.println("........all sub link of Featured...........");

		List<WebElement>   allsubFeatured=driver.findElements(By.xpath("//span[@class='_3QN6WI _1MMnri']/following-sibling::a"));

		int countFeatured=allsubFeatured.size();

		for (int i = 0; i < countFeatured; i++) {

			String alltextFeatured=allsubFeatured.get(i).getText();

			System.out.println(alltextFeatured);  
		}

	}
}