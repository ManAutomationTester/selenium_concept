package onlineAtomateByXpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AtomateFlipkartOfAdd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");

		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(opt);
		
		driver.get("https://flipkart.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		Actions ac=new Actions(driver);

		ac.sendKeys(Keys.ESCAPE).build().perform();
		
		
		System.out.println("........all the header link........ ");

		List<WebElement>allheaderlink=driver.findElements(By.xpath("//div[@class='_37M3Pb']/child::div/descendant::div[@class='xtXmba'  or contains(text(),'Grocery')]"));

		int allheaderlinkcount=allheaderlink.size();
		
		for (int i = 0; i < allheaderlinkcount; i++) {
			
			String allheaderlinkext=allheaderlink.get(i).getText();
			
			System.out.println(i+1+". "+allheaderlinkext);
			 
		}
		
		
	WebElement fashionbutoon=driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
	
	ac.moveToElement(fashionbutoon).build().perform();
	
	System.out.println();
	
	System.out.println("........all the sub link of fashion element ........ ");

	List<WebElement>allfaishonlist=driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));

	int countfishon=allfaishonlist.size();
	
	for (int i = 0; i < countfishon; i++) {
		
		String allFishiontext=allfaishonlist.get(i).getText();
		
		System.out.println(allFishiontext);
		 
	}
	driver.findElement(By.xpath("//a[contains(text(),'Top Wear')]")).click();

	System.out.println();
	
	System.out.println(".....Name and Price of add product....");
	
	List<WebElement> addlistname=driver.findElements(By.xpath("//div[@class='_1xHGtK _373qXS']/descendant::div[@Class='_2I5qvP']/following-sibling::div[@class='_2B099V']/descendant::a[@class='IRpwTa']"));
	
		List<WebElement>  addlistrate=driver.findElements(By.xpath("//div[@class='_1xHGtK _373qXS']/descendant::div[@Class='_2I5qvP']/following-sibling::div[@class='_2B099V']/descendant::div[@class='_25b18c']/child::div[@class='_30jeq3']"));
	int countadd=addlistname.size();
	
	for (int i = 0; i <countadd ; i++) {
		
		String addtextname=addlistname.get(i).getText();
		
		String addtextrate=addlistrate.get(i).getText();
		
		System.out.println(i+1+":> "+addtextname+"="+addtextrate);
	}

	System.out.println();
	
System.out.println(".....Name and Price of without add product....");
	
	List<WebElement> withoutAddname=driver.findElements(By.xpath("//div[contains(@data-tkid,'SEARCH')]/descendant::a[@class='IRpwTa']"));
	
		List<WebElement>  withoutaddrate=driver.findElements(By.xpath("//div[contains(@data-tkid,'SEARCH')]/descendant::a[@class='_3bPFwb']/descendant::div[@class='_30jeq3']"));
		
	int countwithoutadd=withoutAddname.size();
	
	for (int i = 0; i <countwithoutadd ; i++) { 
		
		String withoutaddtextname=withoutAddname.get(i).getText();
		
		String withoutaddtextrate=withoutaddrate.get(i).getText();
		
		System.out.println(i+1+":> "+withoutaddtextname+"="+withoutaddtextrate);
	}
	
	
	
	}

}
