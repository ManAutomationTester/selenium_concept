package onlineAtomateByXpath;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShotParticlarElement {


	public static void main(String[] args) throws IOException {
		//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		WebElement web=driver.findElement(By.xpath("//td[@class='small z2']"));

		///  take Screenshot of the page in Static folder

		TakesScreenshot tksnap=(TakesScreenshot)driver;
		File srcflObj=tksnap.getScreenshotAs(OutputType.FILE);
		File destflObj=new File("sceernshot1.png");
		Files.copy(srcflObj, destflObj);
		Actions act=new Actions(driver);

		act.sendKeys("admin",Keys.TAB).sendKeys("admin",Keys.ENTER).build().perform();

//		TakesScreenshot takeSnap=(TakesScreenshot)driver;
//		File srcF=takeSnap.getScreenshotAs(OutputType.FILE);
//		File destF=new File("\\sceernshot2.png");
//		Files.copy(srcF, destF);
//
//		driver.findElement(By.linkText("Marketing")).click();
//		driver.findElement(By.linkText("Calendar")).click();
//
//		///  take Screenshot of the page in Dyanamic folder with date format
//
//		TakesScreenshot tkshot=(TakesScreenshot)driver;
//		DateFormat df=new SimpleDateFormat("dd_MMM_yyyy");
//		String dateFormate=df.format(new Date());
//		File srcFile=tkshot.getScreenshotAs(OutputType.FILE);
//		File destFile=new File("\\sceernshot"+dateFormate+".png");
//		Files.copy(srcFile, destFile);
//
//		WebElement noEvntFound=driver.findElement(By.xpath("//div[@id='listView']//div"));
//		DateFormat df1=new SimpleDateFormat("dd_MMM_yyyy");
//		String dateFormate1=df1.format(new Date());
//		File srcFile1=noEvntFound.getScreenshotAs(OutputType.FILE);
//		File destFile1=new File("\\sceernshot"+dateFormate1+".png");
//		Files.copy(srcFile1, destFile1);
//
//		WebElement webDate=driver.findElement(By.xpath("//td[text()='1 October 2023 - 7 October 2023']"));
//
//		SimpleDateFormat sdf=new SimpleDateFormat();
//		String dateFormateCalender=sdf.format(new Date());
//		File srcfDate=webDate.getScreenshotAs(OutputType.FILE);
//		File destDate=new File("\\sceernshot"+dateFormateCalender+".png");
//		Files.copy(srcfDate, destDate);
//		//driver.quit();
	}

}
