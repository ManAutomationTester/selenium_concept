package selenium_work_practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class x_path_attribute_value_title_checking {

	public static void main(String[] args) {

//		ChromeDriver driver=new ChromeDriver();
		
ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(options);


		driver.get("http://localhost:8888");

		String	actualusername=driver.findElement(By.xpath("//input[@name='user_name']")).getAttribute("type");

		String expectedusername="text";

		boolean userresult=actualusername.equalsIgnoreCase(expectedusername);

		if (userresult==true) {

			System.out.println("user name is correct");
		}
		else {

			System.out.println("user name is incorrect");
		}


		String pagetitle=driver.getTitle();

		System.out.println(pagetitle);

		String urlname=driver.getCurrentUrl();

		System.out.println(urlname);

		WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));

		username.clear();

		username.sendKeys("admin1");

		WebElement userpassword=driver.findElement(By.xpath("//input[@name='user_password']"));

		userpassword.clear();

		userpassword.sendKeys("janu");

		WebElement theme=driver.findElement(By.xpath("//select[@class='small' and @name='login_theme']"));

		theme.sendKeys("bluelagoon");

		driver.findElement(By.xpath("//input[@value='  Login  ' and @name='Login' and  @alt='Login [Alt+L]']")).click();

		String actualtext=driver.findElement(By.className("hdrLink")).getText();

		String expecttext="Home";

		boolean result=actualtext.equalsIgnoreCase(expecttext);

		if (result==true) {

			System.out.println("testcase is passed");

		}
		else {
			System.out.println("texcase is failed");
		}
//		String actualhometitle=driver.getTitle();

		System.out.println(actualtext);

		String expectedtitle="Home";

		boolean homeresult=actualtext.equalsIgnoreCase(expectedtitle);

		if (homeresult==true) {

			System.out.println("title is correct");
		}
		else {
			System.out.println("title is mismatch");
		}
		//////  getAttribute();.....


		String actlink=driver.findElement(By.xpath("//img[@alt='vtiger CRM']")).getAttribute("title");

		String expectedlink="vtiger CRM";

		boolean linkresult=actlink.equalsIgnoreCase(expectedlink);

		if (linkresult==true) {

			System.out.println("condition is passed");
		}
		else {
			System.out.println("condition is failed");
		}	


	}

} 