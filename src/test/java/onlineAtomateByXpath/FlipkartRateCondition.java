package onlineAtomateByXpath;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FlipkartRateCondition {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt=new ChromeOptions(); 
		
		opt.addArguments("remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(opt);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://flipkart.com");
		
		Thread.sleep(6000);
		
		/// left Scroller ka xpath just like unstable
//		String addLeftScroller=driver.findElement(By.xpath("//div[contains(@style,'width: 5772px; transform: translateX')]"));
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ESCAPE).build().perform();
		
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println("======= 9,999 ==== ka uniqu xpath=====");
//	String oneMobile=driver.findElement(By.xpath("//div[@data-id='MOBGHBJG8NWDGK6T']/descendant::div[@class='col col-7-12']/following-sibling::div/descendant::div[contains(text(),'₹9,999')]")).getText();
//	System.out.println(oneMobile);
//	System.out.println();
//	System.out.println("===== all mobile xpath ====");
//	System.out.println();
	
	List<WebElement> allmobileName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
	List<WebElement> allmobileRate=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	 

  	int[] arr= new int[allmobileName.size()];
  	

	for (int i = 0; i < allmobileName.size(); i++) {
		
		  String mobileNametext=allmobileName.get(i).getText();

		String mobileRatetext=allmobileRate.get(i).getText();
		
		mobileRatetext = mobileRatetext.replaceAll("[^0-9]", ""); // Remove non-numeric characters
		
	      int price = Integer.parseInt(mobileRatetext);
	    	  arr[i]=price;
		
	      if (price <= 8000) {
	    	  
	    	  System.out.println(i+1+":-  "+mobileNametext+"="+mobileRatetext);

	      }
	      

	    }
	Arrays.sort(arr);
	  for (int j = 0; j <allmobileName.size(); j++) {
	        System.out.println(arr[j]);
	    }
	
	
      
		
		
	}
	}


