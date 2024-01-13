package TestCase_By_ManSingh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SignUpPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.itbusinessbook.com/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		WebElement firstName=driver.findElement(By.xpath("//input[@id='firstname']"));
		
		firstName.clear();
		firstName.sendKeys("Man");
		
WebElement lastName=driver.findElement(By.xpath("//input[@id='lastname']"));
		
lastName.clear();
lastName.sendKeys("Singh");

WebElement emailId=driver.findElement(By.xpath("//input[@id='email']"));

emailId.clear();
emailId.sendKeys("sinm67254@gmail.com");

WebElement password=driver.findElement(By.xpath("//input[@id='password']"));

password.clear();
password.sendKeys("M@#N1314");

Thread.sleep(5000);
WebElement checkboxframe=driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
driver.switchTo().frame(checkboxframe);
WebElement iAmNotRobot=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
iAmNotRobot.click();
driver.switchTo().defaultContent();

//WebElement verifyFrame=driver.findElement(By.xpath("//iframe[@title='recaptcha challenge expires in two minutes']"));


Thread.sleep(60000);

//WebElement verifyButton=driver.findElement(By.xpath("//button[text()='Verify']"));
//
//verifyButton.click();

driver.switchTo().defaultContent();
driver.findElement(By.xpath("//input[@id='c2']")).click();
driver.findElement(By.xpath("//button[@id='iregister']")).click();

String thankText=driver.findElement(By.xpath("//h1[Contains(text(),'Thanks for')]")).getText();

System.out.println(thankText);

driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")).click();

String homePageText=driver.getTitle();

System.out.println(homePageText);

driver.findElement(By.xpath("//i[@class='la la-sort-down']")).click();

driver.findElement(By.xpath("//a[text()='Logout']")).click();

driver.switchTo().alert().accept();

driver.findElement(By.xpath("//button[text()='OK']")).click();

WebElement email=driver.findElement(By.xpath("//input[@id='lemail']"));
email.clear();
email.sendKeys("sinm6754@gmail.com");

WebElement passwordlogin=driver.findElement(By.xpath("//input[@id='lpassword']"));
passwordlogin.clear();
passwordlogin.sendKeys("M@#N1314");

WebElement signin=driver.findElement(By.xpath("//button[@id='ilogin']"));
signin.click();

String text1=driver.getTitle();
System.out.println(text1);

















	}

}
