package definition_and_example_of_chromedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class method_and_class_of_chromedriver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		////   #1 [get(String url):void.......]	

		driver.get("http://localhost:8888/");


		////  #2[findElement(By locator):WebElement.....]

		By username =By.name("user_name");

		WebElement user=driver.findElement (username);
 

		////  #3[clear():void-WebElement.....]

		user.clear();

		user.sendKeys("admin");


		///    #4[sendkeys(Charsequence...means String value):void-WebElement...]

		WebElement password=driver.findElement(By.name("user_password"));

		password.sendKeys("admin");

		WebElement loginbutton=driver.findElement(By.name("Login"));


		///  #5[click():void-WebElement..]

		loginbutton.click();



		///#6[getTitle():String....]

		String titlename=driver.getTitle();

		System.out.println(titlename);

		///  #7[close():void...]

		//		driver.close();

		///#8[getText():String-WebElement.....]

		String textname=driver.findElement(By.xpath("//a[text()='Marketing']")).getText();

		System.out.println(textname);


		/// #9[equalsIgnoreCase(Object an Object):boolean-String....]

		String m="man singh";

		String n="MAN SINGH";

		boolean result1=m.equalsIgnoreCase(n);

		if (result1==true) {

			System.out.println("name is correct");
		}
		else {
			System.out.println("name is incorrect");
		}

		////#10[equals(Object an Oject):boolean-String........]  

		String n1="hi bro";

		String m1="hi brother";

		boolean nameresult=n1.equals(m1);

		if (nameresult==true) {

			System.out.println("dialoge  is equal");
		}
		else {

			System.out.println("dialoge is not equal  ");
		}

		///#11[getAttribute]

		String attributvalue=driver.findElement(By.xpath("//img[@onclick='fnAddWindow(this,\"addWidgetDropDown\");']")).getAttribute("style");

		System.out.println(attributvalue);


		////  #12[linkText(String text):By-By...]

		driver.findElement(By.linkText("Sales")).click();

		///  #13[isEnabled():boolean-WebElement....]

		boolean actualleadsbutton=driver.findElement(By.xpath("//img[@alt='Create Lead...']")).isEnabled();

		boolean expectedleadsbutton=actualleadsbutton;

		if (expectedleadsbutton==true) {

			System.out.println("Yes this leads button is enabled");
		}
		else {

			System.out.println("No this leads button is not enabled");
		}

		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();


		///#14[isDisplayed():boolean-WebElement....]

		WebElement actualsavebutton=driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]"));

		boolean expectedsavebutton=actualsavebutton.isDisplayed();

		if (expectedsavebutton==true) {

			System.out.println("yes save button is visible");
		}

		else { 

			System.out.println("No sava button is invisible");
		}

		////15[isSelected():boolean-WebElement..... ]



		WebElement groupradiobutton	=driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));

		boolean resultgroup=groupradiobutton.isSelected();

		if (resultgroup==false) {
			System.out.println("it is unchecked");
		}
		else {
			System.out.println("it is checked");
		}

		groupradiobutton.click();   /////// click the check box

		boolean resultgroup1 =groupradiobutton.isSelected();

		if (resultgroup1==true) {

			System.out.println("it is selected");

		}
		else {
			System.out.println("it is unselected");
		}

		//#16[name(String name):By-By.....]	

		driver.findElement(By.name("firstname")).sendKeys("Man");

		//#17[id(String name):By-By....]

		driver.findElement(By.id("phone")).sendKeys("8081157129");

		// #18[getSize():Dimension-WebElement........]

		Dimension discriptioninfo = driver.findElement(By.xpath("//textarea[@name='description']")).getSize();

		int discheight =discriptioninfo.getHeight();

		int discwidth=discriptioninfo.getWidth();

		System.out.println("the height of discription is "+discheight+" and "+"the width of discription is"+discwidth);


		//			#19[getLocation():Point-WebElement...........]

		Point cancel2=driver.findElement(By.xpath("(//input[@value='  Cancel  '])[2]")).getLocation();

		int xcordcancel=cancel2.getX();

		int ycordcancel=cancel2.getY();

		System.out.println("the x-cordination of cancel button is "+xcordcancel+" and "+"the y-cordination of cancel is"+ycordcancel);

		/////  #20[selectByVisibleText(String text):void-Select......]

		WebElement websalutation=driver.findElement(By.xpath("//select[@name='salutationtype']"));


		Select selectsalutationbutton =new Select(websalutation);

		selectsalutationbutton.selectByVisibleText("Prof."); 


		Thread.sleep(5000);

		/////  #21[selectByValue(String value):void-Select......]


		selectsalutationbutton.selectByValue("Dr.");


		Thread.sleep(5000);

		/////  #22[selectByIndex(int index):void-Select......]

		//number starts to count the dropedown i.e---- 0  to number (in dropedown)

		selectsalutationbutton.selectByIndex(3);

		//selectsalutationbutton.deselectByValue("Dr.");......  it is follow only multi selected option just like--- deselectByValue,deselectByVisibleText,deselectByIndex and deselectAll.....



		/////  #23[isMultiple():boolean-Select......]


		WebElement leadsource =driver.findElement(By.xpath("//select[@name='leadsource']"));

		Select leadsource_button =new Select(leadsource);

		boolean check_multiple=leadsource_button.isMultiple(); 
		boolean expected_check_multiple=false;
		if (check_multiple==expected_check_multiple) {

			System.out.println("the leadsource button is single selected so it is passesd");

		}else {
			System.err.println("the leadsource button is multiselected selected so it is failed");

		}


		////   starts to count the number dropedown -0-1-2-3-4......

		//            choose number(N)=n-1....  i.e you have to choose 5 number then you enter 4 in the selectByIndex(4);                      

		WebElement leadstatus =driver.findElement(By.xpath("//select[@name='leadstatus']"));

		Select leadstatus_button =new Select(leadstatus);

		WebElement actleadstatus=leadstatus_button.getFirstSelectedOption();

		String leadstatustext =actleadstatus.getText();

		System.out.println(leadstatustext);

		////Actions class.....[===================STATS FROM HERE==================]

		Actions hoverAction=new Actions(driver);

		WebElement inventorybutton=driver.findElement(By.xpath("//a[contains(text(),'Inventory')]"));

		//////#24[click():Actions-Actions.............]


		//////#25[build():Actions-Actions........]  AND  //////#26[perform():Actions-Actions........]

		hoverAction.moveToElement(inventorybutton).click().build().perform();

		WebElement Quotesbutton=driver.findElement(By.linkText("Quotes"));

		//////#27[click(WebElement target):Actions-Actions........]

		hoverAction.click(Quotesbutton).build().perform();

		WebElement homepagebutton=driver.findElement(By.linkText("My Home Page"));

		//////#28[moveToElement(WebElement target):Actions-Actions........]  AND  //////#29[doubleClick():Actions-Actions........] 

		hoverAction.moveToElement(homepagebutton).doubleClick().build().perform();

		WebElement Topsalesbutton=driver.findElement(By.xpath("//b[contains(text(),'Top Sales Orders')]"));

		WebElement PendActivitiesbutton=driver.findElement(By.xpath("//b[contains(text(),'Pending Activities')]"));

		Thread.sleep(5000);
		//////#30[clickAndHold(WebElement target):Actions-Actions........] AND  //////#31[release(WebElement target):Actions-Actions........] 
		hoverAction.clickAndHold(Topsalesbutton).moveToElement(Topsalesbutton).release(PendActivitiesbutton).build().perform();

		//WebElement webhelp=driver.findElement(By.linkText("Help"));  
		//
		//hoverAction.click(webhelp).build().perform();
		//
		//Thread.sleep(5000);

		//WebElement webtryitfree=driver.findElement(By.linkText("//a[text()='Log in']"));  
		//hoverAction.doubleClick(webtryitfree).build().perform();
		//



















	} 
}