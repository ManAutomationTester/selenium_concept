package TestCase_By_ManSingh;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_Page {
	public static void main(String[] args) {  

System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");
ChromeOptions options=new ChromeOptions(); 

options.addArguments("--remote-allow-origins=*");

ChromeDriver drvr=new ChromeDriver(options);

		drvr.get("http://localhost:8888");


		///// to test the user is able to login with valid username and password

		//
		//			System.out.println(".........TESTING WHEN YOU ENTERED RIGHT USERNAME AND RIGHT PASSWORD WHO WILL GET HOME PAGE TITLE OTHERWISE ALERT IN CASE OF WRONG USERNAME AND WRONG PASSWORD...........");
		//
		//
		//			WebElement username1=drvr.findElement(By.xpath("//input[@name='user_name']"));
		//
		//			username1.clear();
		//
		//			username1.sendKeys("admin");
		//
		//			drvr.findElement(By.xpath("//input[@name='user_password']")).sendKeys("janu");
		//
		//
		//
		//			WebElement loginbutton1=drvr.findElement(By.xpath("//input[@value='  Login  ' and @name='Login' and  @alt='Login [Alt+L]']"));
		//
		//			loginbutton1.click();
		//
		//			String acthometitle=drvr.getTitle();
		//
		//			String expectedhome="admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";
		//
		//			if (expectedhome.equals(acthometitle)) {
		//
		//				System.out.println("your username i.e :- admin and password i.e :- janu both are correct then you will enter in home page");
		//			}
		//
		//			else {
		//
		//				String actualerrmsg=drvr.findElement(By.xpath("//font[@color='Brown']")).getText();
		//
		//				String expectederrmsg="You must specify a valid username and password.";
		//
		//				if (actualerrmsg.equals(expectederrmsg)) {
		//
		//
		//					System.err.println("You must specify a valid username and password because you entered wrong password");
		//				}
		//			}
		//
		//////////////////  new test case to check their hight,width and location............


		//			drvr.findElement(By.xpath("//a[text()='Sign Out']")).click();




		System.out.println("....................TESTING THE HEIGHT AND WIDTH OF USERNAME................");

		Dimension usersize=drvr.findElement(By.xpath("//input[@name='user_name']")).getSize();
System.out.println(usersize);
		int actuserheight=usersize.getHeight();

		int actuserwidth=usersize.getWidth();

		int expuserheight=22;

		int expuserwidth=149;



		if (actuserheight==expuserheight && actuserwidth==expuserwidth) {

			System.out.println("the actual hight of username  ="+actuserheight+" is matched with the expected hight ="+expuserheight);

			System.out.println("the actual width of username  ="+actuserwidth+" is matched with the expected width ="+expuserwidth);

		}else {
			System.err.println("the actual hight of username  ="+actuserheight+" is not matched with the expected hight ="+expuserheight);

			System.err.println("the actual width of username  ="+actuserwidth+" is not matched with the expected width ="+expuserwidth);

		}


		System.out.println("....................TESTING THE HEIGHT AND WIDTH OF PASSWORD................");


		Dimension passwordsize=drvr.findElement(By.xpath("//input[@name='user_password']")).getSize();
System.out.println(passwordsize);
		int actpassheight=passwordsize.getHeight();

		int actpasswidth=passwordsize.getWidth();

		int exppassheight=22;

		int exppasswidth=149;


		if (actpassheight==exppassheight && actpasswidth==exppasswidth) {

			System.out.println("the actual hight of password  ="+actpassheight+" is matched with the expected hight ="+exppassheight);

			System.out.println("the actual width of password  ="+actpasswidth+" is matched with the expected width ="+exppasswidth);


		}else {

			System.err.println("the actual hight of password  ="+actpassheight+" is  not matched with the expected hight ="+exppassheight);

			System.err.println("the actual width of password  ="+actpasswidth+" is not matched with the expected width ="+exppasswidth);


		}

		System.out.println("....................TESTING THE HEIGHT AND WIDTH OF LOGIN................");



		Dimension loginsize=drvr.findElement(By.xpath("//input[@name='Login']")).getSize();
System.out.println(loginsize);
		int actloginheight=loginsize.getHeight();

		int actloginwidth=passwordsize.getWidth();

		int exploginheight=40;

		int exploginwidth=138;


		if (actloginheight==exploginheight && actloginwidth==exploginwidth) {

			System.out.println("the actual hight of login  ="+actloginheight+" is matched with the expected hight ="+exploginheight);

			System.out.println("the actual width of login  ="+actpasswidth+" is matched with the expected width ="+exploginwidth);


		}else {

			System.err.println("the actual hight of login  ="+actloginheight+" is  not matched with the expected hight ="+exploginheight);

			System.err.println("the actual width of login  ="+actloginwidth+" is not matched with the expected width ="+exploginwidth);


		}
		
		System.out.println("....................TESTING THE X-CORDINATE AND Y-CORDINATE OF USERNAME................");


		Point  userlocation=drvr.findElement(By.xpath("//input[@name='user_name']")).getLocation();
System.out.println(userlocation);
		int actxcorduser=userlocation.getX() ;

		int actycorduser=userlocation.getY();

		int expxcorduser= 640;

		int expycorduser= 230;

		if (actxcorduser==expxcorduser && actycorduser==expycorduser) {

			System.out.println("the actual x cordinate of username ="+actxcorduser+" is matched with the expected x cordinate ="+expxcorduser);

			System.out.println("the actual y cordinate of username ="+actycorduser+" is matched with the expected y cordinate ="+expycorduser);

		}else {
			System.err.println("the actual x cordinate of username  ="+actxcorduser+" is not matched with the expected x cordinate ="+expxcorduser);

			System.err.println("the actual y cordinate of login  ="+actycorduser+" is not matched with the expected y cordinate ="+expycorduser);

		}
		
		System.out.println("....................TESTING THE X-CORDINATE AND Y-CORDINATE OF PASSWORD................");


		Point  passwordlocation=drvr.findElement(By.xpath("//input[@name='user_password']")).getLocation();
System.out.println(passwordlocation);
		int actxcordpass=passwordlocation.getX() ;

		int actycordpass=userlocation.getY();

		int expxcordpass= 632;

		int expycordpass= 262;

		if (actxcordpass==expxcordpass && actycordpass==expycordpass) {

			System.out.println("the actual x cordinate of password ="+actxcordpass+" is matched with the expected x cordinate ="+expxcordpass);

			System.out.println("the actual y cordinate of password ="+actycordpass+" is matched with the expected y cordinate ="+expycordpass);

		}else {
			System.err.println("the actual x cordinate of password  ="+actxcordpass+" is not matched with the expected x cordinate ="+expxcordpass);

			System.err.println("the actual y cordinate of password  ="+actycordpass+" is not matched with the expected y cordinate ="+expycordpass);

		}

		System.out.println("....................TESTING THE X-CORDINATE AND Y-CORDINATE OF LOGIN................");


		Point  loginlocation=drvr.findElement(By.xpath("//input[@name='Login']")).getLocation();
System.out.println(loginlocation);
		int actxcordlogin=loginlocation.getX() ;

		int actycordlogin=userlocation.getY();

		int expxcordlogin= 640;

		int expycordlogin= 230;

		if (actxcordlogin==expxcordlogin && actycordlogin==expycordlogin) {

			System.out.println("the actual x cordinate of login ="+actxcordlogin+" is matched with the expected x cordinate ="+expxcordlogin);

			System.out.println("the actual y cordinate of login ="+actycordlogin+" is matched with the expected y cordinate ="+expycordlogin);

		}else {
			System.err.println("the actual x cordinate of login  ="+actxcordlogin+" is not matched with the expected x cordinate ="+expxcordlogin);

			System.err.println("the actual y cordinate of login  ="+actycordlogin+" is not matched with the expected y cordinate ="+expycordlogin);

		}
drvr.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");

drvr.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("janu");

drvr.findElement(By.xpath("//input[@name=\"Login\"]")).click();

drvr.findElement(By.linkText("Marketing")).click();

drvr.findElement(By.linkText("Leads")).click();


drvr.findElement(By.xpath("//img[@alt=\"Create Lead...\"]")).click();



//WebElement firstname=drvr.findElement(By.xpath("//select[@name='salutationtype']"));
//
//firstname.sendKeys("Mr.");

String expfirstname="Roshan";

drvr.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(expfirstname);

String explastname="Yadav";

drvr.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(explastname);

String expcompanyname="Expert View Automation";

drvr.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys(expcompanyname);

String expTitlename="Hi this Mr Rodrigue--Roshan Yadav Task To Create";

drvr.findElement(By.xpath("//input[@name=\"designation\"]")).sendKeys(expTitlename );

String expphone="7355101635";

drvr.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys(expphone);

String expemail="roshan.selenium121@gmail.com";

drvr.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(expemail);

String expstreet="Mondh";

drvr.findElement(By.xpath("(//textarea[@class=\"detailedViewTextBox\"])[1]")).sendKeys(expstreet);

String expcountry="India";

drvr.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys(expcountry);

String expcity="Bhodohi";

drvr.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys(expcity);

drvr.findElement(By.xpath("(//input[@title=\"Save [Alt+S]\"])[2]")).click();


System.out.println(".................VERYFYING THE LEADS DETAILS AFTER SAVING OF FIRST NAME...............");

 
String actname=drvr.findElement(By.xpath("//span[@id='dtlview_First Name']")).getText();

if (expfirstname.equalsIgnoreCase(actname)) {
	
	System.out.println("the expected first name is = "+expfirstname+" and "+"the actual first name is = "+actname+" both are matched so testcase is passed ");
	
}else {

	System.err.println("the expected first name is = "+expfirstname+" and "+"the actual first name is = "+actname+" both are not matched so testcase is failed ");

}

System.out.println(".................VERYFYING THE LEADS DETAILS AFTER SAVING OF LAST NAME ...............");


String actlastname=drvr.findElement(By.xpath("//span[@id='dtlview_Last Name']")).getText();

if (explastname.equalsIgnoreCase(actlastname)) {
	
	System.out.println("the expected last name is = "+explastname+" and "+"the actual last name is ="+actlastname+" both are matched so testcase is passed ");
	
}else {

	System.err.println("the expected last name is = "+explastname+" and "+"the actual last name is ="+actlastname+" both are not matched so testcase is failed ");

}

System.out.println(".................VERYFYING THE LEADS DETAILS AFTER SAVING OF COMPANY NAME ...............");


String actcompanyname=drvr.findElement(By.xpath("//span[@id='dtlview_Company']")).getText();

if (expcompanyname.equalsIgnoreCase(actcompanyname)) {
	
	System.out.println("the expected company name is = "+expcompanyname+" and "+"the actual company name is = "+actcompanyname+" both are matched so testcase is passed ");
	
}else {

	System.err.println("the expected company name is = "+expcompanyname+" and "+"the actual company name is = "+actcompanyname+" both are not matched so testcase is failed ");

}

System.out.println(".................VERYFYING THE LEADS DETAILS AFTER SAVING OF TITLE NAME ...............");


String actTitlename=drvr.findElement(By.xpath("//span[@id='dtlview_Title']")).getText();

if (expTitlename.equalsIgnoreCase(actTitlename)) {
	
	System.out.println("the expected title name is = "+expTitlename+" and "+"the actual title name is = "+actTitlename+" both are matched so testcase is passed ");
	
}else {

	System.err.println("the expected title name is = "+expTitlename+" and "+"the actual title name is = "+actTitlename+" both are not matched so testcase is failed ");

}

System.out.println(".................VERYFYING THE LEADS DETAILS AFTER SAVING OF PHONE NUMBER...............");


String actphone=drvr.findElement(By.xpath("//span[@id='dtlview_Phone']")).getText();

if (expphone.equalsIgnoreCase(actphone)) {
	
	System.out.println("the expected phone number is = "+expphone+" and "+"the actual phone number is = "+actphone+" both are matched so testcase is passed ");
	
}else {

	System.err.println("the expected phone number is = "+expphone+" and "+"the actual phone number is = "+actphone+" both are not matched so testcase is failed ");

}
System.out.println(".................VERYFYING THE LEADS DETAILS AFTER SAVING OF EMAIL ...............");


String actemail=drvr.findElement(By.xpath("//a[text()='roshan.selenium121@gmail.com']")).getText();

if (expemail.equalsIgnoreCase(actemail)) {
	
	System.out.println("the expected email is = "+expemail+" and "+"the actual email is = "+actemail+" both are matched so testcase is passed ");
	
}else {

	System.err.println("the expected email is = "+expemail+" and "+"the actual email is = "+actemail+" both are not matched so testcase is failed ");

}
 





	}

}
