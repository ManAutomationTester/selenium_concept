package onlineAtomateByXpath;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesConcept {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https:amazon.com");
		Set<Cookie> cookies=driver.manage().getCookies();
		int cookiesSize1=cookies.size();
		System.out.println("the size of the cookies before Adding - "+cookiesSize1);
		for (Cookie cookie : cookies) {
			System.out.println("Cookies Name :-"+cookie.getName() +" and Cookies Value :-"+cookie.getValue());
		}
		Cookie ck=new Cookie("FirstCookies", "www.flipkart.com");
	driver.manage().addCookie(ck);
	Set<Cookie> cookiesList=driver.manage().getCookies();
	int cookieSize2=cookiesList.size();
	System.out.println("the size of the cookies After Adding - "+cookieSize2);
	for (Cookie cookie : cookiesList) {
		System.out.println("Cookies Name :-"+cookie.getName() +" and Cookies Value :-"+cookie.getValue());
	}
	driver.manage().deleteCookie(ck);
	Set<Cookie> cookieList=driver.manage().getCookies();
	int ckSize=cookieList.size();
	System.out.println("the size of the cookies After deleting - "+ckSize);
	 
	driver.manage().deleteAllCookies();
 
	driver.quit();
	}
	

}
