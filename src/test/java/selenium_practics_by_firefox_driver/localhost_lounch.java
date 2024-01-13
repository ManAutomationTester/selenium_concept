package selenium_practics_by_firefox_driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class localhost_lounch {

	public static void main(String[] args) {
		
		System.out.println("GFD");
		
		System.setProperty("webdriver.gecko.driver","All_Driver\\chromedriver.exe");
		FirefoxDriver fdriver = new FirefoxDriver();
		fdriver.get("http:localhost:8888/");
		String browertitle=fdriver.getTitle();
		System.out.println(browertitle);

		String browerurl =fdriver.getCurrentUrl();
		System.out.println(browerurl);
		
		String pagesource=fdriver.getPageSource();
		System.out.println(pagesource);

		fdriver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		
		fdriver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("janu");
		
		WebElement themebutton=fdriver.findElement(By.xpath("//select[@name='login_theme']"));
		themebutton.sendKeys("woodspice");
		
		WebElement languagebutton=fdriver.findElement(By.xpath("//select[@name='login_language']"));
	languagebutton.sendKeys("US English");
	
	fdriver.findElement(By.xpath("//input[@name='Login']")).click();
	

	}

}
