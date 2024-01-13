package To_Handle_Dropedown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practics_SelectClass {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "All_Driver\\chromedriver.exe");

ChromeOptions options=new ChromeOptions();

options.addArguments("--remote-allow-origins=*");

ChromeDriver driver=new ChromeDriver(options);
driver.get("http://localhost:8888");

WebElement uname=driver.findElement(By.xpath("//input[@name='user_name']"));

uname.sendKeys("admin1");

WebElement pass=driver.findElement(By.xpath("//input[@name=\"user_password\"]"));

pass.sendKeys("janu");

WebElement  themebutton=driver.findElement(By.xpath("//select[@name='login_theme']"));
 Select objslct=new Select(themebutton);
    
// 1.  single select dropdown-the user choose any one from multiple options
 
// 2. multi select dropdown-  the user choose two or more than options from multiple options...
 
 /////   how to handle drop_down ...
 
//        1. Recommended  way:-  using select class
//          a.selectByvisibleText()
//          b.selectByValue()
//          c.selectByIndex()
 
 ///////  2. non recommended way:- using sendkeys()
 
 
//getOptions-----  fetch all the element from dropDown]
 
List<WebElement> lst =objslct.getOptions();
for (int i = 0; i < lst.size(); i++) {
	String text=lst.get(i).getText();
	System.out.println(text );
} 
// dropdown-listbox-selectbox-comobox
 
 objslct.selectByVisibleText("woodspice");
 
//    selectByVisibleText-----  innner text of any element
 
 Thread.sleep(3000);
  objslct.selectByIndex(1);
  
//  selectByIndex:------to select any element in the drop down  with the help of number
//  number starts to count dropdown:-   zero to number of element in dropdown(  0 to  number of element  )
 
  Thread.sleep(3000);
 objslct.selectByValue("alphagrey");
 
// selectByValue:----- to select any element in dropdown with the of attribute value.
 
 WebElement firstselect=objslct.getFirstSelectedOption();
 String actext=firstselect.getText();
String exptext="alphagrey";
if (actext.equalsIgnoreCase(exptext)) {
	System.out.println("pass");
	
}
else {
	System.out.println("fail");
}
 
// getFirstSelectedOption:---to get the element i.s select already or by default in the drop down
 
 boolean result=objslct.isMultiple();
 System.out.println(result);
// isMultiple:---  to check the select element supports selecting multple or not
// true--- support multiple
//  false--- not support multiple
 
// objslct.deselectAll();
// objslct.deselectByIndex(0);            all the four methods are support only multiple select drop down.....
// objslct.deselectByValue(exptext);
// objslct.deselectByVisibleText(exptext);
// 
 

	}

}
