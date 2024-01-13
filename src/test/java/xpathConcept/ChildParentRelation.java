package xpathConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildParentRelation {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://localhost:8888");
		
		WebElement webUser=driver.findElement(By.xpath("//input[@class='small'   and @type='text']"));
		webUser.sendKeys("admidfsdffdn");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=''", webUser);
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='admin'", webUser);

		
	driver.findElement(By.xpath("//input[@type='password'  or @name='user_password' ]")).sendKeys("admin");
	
	driver.findElement(By.xpath("//select[@ name='login_theme' or @value='bluelagoon']")).sendKeys("bluelagoon");
	
	driver.findElement(By.xpath("//input[@name='Login'  and @ value='  Login  ' ]")).click();
	
	driver.findElement(By.linkText("Sales")).click();
	
	WebElement searchbutton=driver.findElement(By.xpath("//form[@name='basicSearch']/table/tbody/tr[1]/td[1]//span[@class='moduleName']"));
	
	String actinnertext=searchbutton.getText();
	
	String expectinnertext="Search";
	
	if (actinnertext.equalsIgnoreCase(expectinnertext)) {
		
		System.out.println("the search text is same as our expectation ");
		
	}else {
		
		System.err.println("the search text is not same as our expectation ");

	}
	
	Point xandycord=searchbutton.getLocation();
	
	int xcord=xandycord.x;
	
	int ycord=xandycord.y;
	
	if (xcord==131 && ycord==142) {
		
		System.out.println("the location of x and y cordinate from top left corner both are correct");
		
	}else {
		
		System.out.println("the location of x and y cordinate from top left corner both aren't correct");

		
	}
	   ////   second  method to find the location of x and y coordinate
	
	int x1cord=xandycord.getX();
	
	int y1cord=xandycord.getY();
	
	if (x1cord==131 && y1cord==142) {
		
		System.out.println("the location of x1 and y1 cordinate from top left corner both are correct");

	}else {
		System.out.println("the location of x1 and y1 cordinate from top left corner both aren't correct");

	}
Dimension  dimention=searchbutton.getSize();

int hight=dimention.getHeight();

//  Or..

int hight1=dimention.height;

int Width=dimention.getWidth();

//Or..

int Width1=dimention.width;


if (hight==hight1 && Width==Width1) {
	
	System.out.println("the dimention of hight or hight1 and Width or Width1 dimention both are correct");

}else {
	System.out.println("the dimention of hight or hight1 and Width or Width1 dimention both aren't correct");

}
	}

}
