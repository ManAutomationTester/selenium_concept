package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Vtiger_CRM {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");

        ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(options);

		driver.get("http://localhost:8888");

		WebElement actualusername= driver.findElement(By.xpath("//input[@name='user_name']"));

		actualusername.clear();

		actualusername.sendKeys("admin");


		System.out.println("-----------username testing---------");


		/////// test of username.....visibility

		boolean expectedusername=actualusername.isDisplayed();

		if (expectedusername==true) {

			System.out.println("username  is visible");
		}else {
			System.out.println("username is not visible");
		}


		//////   test of username....enabled

		boolean expectedusername1=actualusername.isEnabled();

		if (expectedusername1==true) {

			System.out.println("username is enabled");

		}else {
			System.out.println("username is not enabled");
		}

		///to check the user is able to enter his/her username or not......


		String actvalue=actualusername.getAttribute("value");

		String expectedvalue="admin";

		if (actvalue.equals(expectedvalue)) {

			System.out.println("user is able to enter his/her username:- "+expectedvalue);

		}else {

			System.out.println("user is unable to enter his/her username:- "+expectedvalue);
		}



		System.out.println("-----------password testing---------");

		/////// Both are tested i.e enabled and displayed of password box 

		WebElement actualpassword=driver.findElement(By.xpath("//input[@name='user_password']"));

		actualpassword.clear();

		actualpassword.sendKeys("janu");

		boolean expectedpassword=actualpassword.isDisplayed();

		boolean expectedpassword1=actualpassword.isEnabled();

		if (expectedpassword==true && expectedpassword1==true) {

			System.out.println("password is displayed and enabled");

		}else {
			System.out.println(" password is not displayed and enabled");
		}


		///to check the user is able to enter his/her password or not......



		String actvalue1=actualpassword.getAttribute("value");

		String expectedvalue1="admin";

		if (actvalue1.equals(expectedvalue1)) {
			System.out.println("user is able to enter his/her password:-"+expectedvalue1);

		}else {
			System.out.println("user is unable to enter his/her password:-"+expectedvalue1);
		}


		System.out.println("-----------theme testing---------");


		/////// Both are tested i.e enabled and displayed of theme


		WebElement theme=driver.findElement(By.xpath("//select[@class='small' and @name='login_theme']"));

		theme.sendKeys("bluelagoon");

		boolean expectedtheme=theme.isDisplayed();

		boolean expectedtheme1=theme.isEnabled();

		if (expectedtheme==true && expectedtheme1==true) {

			System.out.println("theme is  displayed and enabled");

		}else {
			System.out.println("theme is not displayed and enabled");
		}

		System.out.println("-----------language testing---------");



		/////// Both are tested i.e enabled and displayed of language 


		WebElement actual_language=driver.findElement(By.xpath("//select[@name='login_language']"));

		theme.sendKeys("US English");

		boolean expected_language=actual_language.isDisplayed();

		boolean expected_language1=actual_language.isEnabled();

		if (expected_language==true && expected_language1==true) {

			System.out.println("language is  displayed and enabled");

		}else {
			System.out.println("language is not displayed and enabled");
		}

		System.out.println("-----------login testing---------");



		/////////// Both are tested i.e enabled and displayed of login button


		WebElement loginbutton=driver.findElement(By.xpath("//input[@value='  Login  ' and @name='Login' and  @alt='Login [Alt+L]']"));


		boolean expected_loginbutton=loginbutton.isDisplayed();

		boolean expected_loginbutton1=loginbutton.isEnabled();

		if (expected_loginbutton==true && expected_loginbutton1==true) {

			System.out.println("login button is  displayed and enabled");

		}else {
			System.out.println("login button is not displayed and enabled");
		}

		loginbutton.click();


		System.out.println("-----------home page testing details---------");



		//		to test the User should be logged In and Home page title 

		String actualhometitle=driver.getTitle();

		String expectedhometitle="admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";

		if (actualhometitle.equals(expectedhometitle)) {

			System.out.println("the actual home page title is "+actualhometitle+" which is same as per our expectation i.e "+expectedhometitle);

		}else {
			System.out.println("the actual home page title is "+actualhometitle+" which is not same as per our expectation i.e "+expectedhometitle);
		}


		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		///// to test the user is able to login with valid username and password


		System.out.println(".........TESTING WHEN YOU ENTERED RIGHT USERNAME AND RIGHT PASSWORD WHO WILL GET HOME PAGE TITLE OTHERWISE ALERT IN CASE OF WRONG USERNAME AND WRONG PASSWORD...........");


		WebElement username1=driver.findElement(By.xpath("//input[@name='user_name']"));

		username1.clear();

		username1.sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("janu");



		WebElement loginbutton1=driver.findElement(By.xpath("//input[@value='  Login  ' and @name='Login' and  @alt='Login [Alt+L]']"));

		loginbutton1.click();

		String acthometitle=driver.getTitle();

		String expectedhome="admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";

		if (expectedhome.equals(acthometitle)) {

			System.out.println("your username i.e :- admin and password i.e :- janu both are correct then you will enter in home page");
		}

		else {

			String actualerrmsg=driver.findElement(By.xpath("//font[@color='Brown']")).getText();

			String expectederrmsg="You must specify a valid username and password.";

			if (actualerrmsg.equals(expectederrmsg)) {


				System.err.println("You must specify a valid username and password because you entered wrong password");
			}
		}

	}
}


