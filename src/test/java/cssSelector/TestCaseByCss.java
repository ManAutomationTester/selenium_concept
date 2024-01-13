package cssSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseByCss {

	public static void main(String[] args) {
// hi This is man Singh
		TestCaseByCss tc=new TestCaseByCss();

		tc.tc001VerifyLoginButton();

	}
	public void tc001VerifyLoginButton() {

		ChromeDriver driver=new ChromeDriver();

		driver.navigate().to("http://localhost:8888");

		System.out.println("================ User Name ==============");
		System.out.println();

		WebElement userName=driver.findElement(By.cssSelector("input[name='user_name']"));

		userName.clear();

		userName.sendKeys("admin");

		//testing the username box visibility................

		boolean expectedUserNameVisibity=userName.isDisplayed();

		if (expectedUserNameVisibity==true) {

			System.out.println("user name is visible");

		}else {
			System.out.println("user name is not visible");
		}

		// to test the user name enable or not.................

		boolean expectedUserNameEnable=userName.isDisplayed();

		if (expectedUserNameEnable==true) {
			System.out.println("user name is enabled");

		}else {
			System.out.println("user name is not enabled");

		}

		// To test the user is able to enter his/ her name or not

		String actualUserNameTest=userName.getAttribute("value");

		String expecteduserNameTest="admin";

		if (actualUserNameTest.equals(expecteduserNameTest)) {

			System.out.println("user is able to enter in the user name text box");
		} else {
			System.out.println("user is unable to enter in the user name text box");

		}

		System.out.println("================ Password ==============");
		System.out.println();


		WebElement password=driver.findElement(By.cssSelector("input[name='user_password']"));

		password.clear();

		password.sendKeys("admin");

		// to test the password box is displayed (visible) or not................

		boolean passwordVisibility=password.isDisplayed();

		if (passwordVisibility==true) {

			System.out.println("password box is displayed or visible");

		} else {

			System.out.println("password box is not displayed or visible");


		}

		// to test the password box is enabled or not..................

		boolean passwordEnabled=password.isEnabled();

		if (passwordEnabled==true) {

			System.out.println("password box is enabled");

		} else {
			System.out.println("password box is not enabled");


		}
		// to test the user is able to enter his/her password.......

		String  actpasswordTest=password.getAttribute("value");

		String  exppasswordTest="admin";

		if (actpasswordTest.equals(exppasswordTest)) {

			System.out.println("user is able to enter his/her password in the password box");

		} else {

			System.out.println("user is unable to enter his/her password in the password box");


		}

		// to test the password is masked or not in the password....... 

		String actPasswordMasked=password.getAttribute("type");

		String expPasswordMasked="password";

		if (actPasswordMasked.equals(expPasswordMasked)) {

			System.out.println("password is masked in the password box");

		} else {

			System.out.println("password is not masked in the password box");

		}

		System.out.println("================ Color Theam ==============");
		System.out.println();


		WebElement colorTheme=driver.findElement(By.cssSelector("select[name='login_theme']"));

		Select objColor=new Select(colorTheme);

		// to test softed element is selected by default in the color theam dropDown............

		WebElement webColorTheam=objColor.getFirstSelectedOption();

		String actTextByDefault=webColorTheam.getText();

		String expTextByDefault="softed";

		if (actTextByDefault.equalsIgnoreCase(expTextByDefault)) {

			System.out.println("softed element is selected byfault");

		} else {

			System.out.println("softed element is selected byfault");

		}

		// to test the dropdown is single selected or multiselected..........

		boolean colortheamselected=objColor.isMultiple();

		if (colortheamselected==false) {

			System.out.println("color theam is single selected drop down");

		} else {

			System.out.println("color theam is not single selected drop down");

		}
		// to test the number of elements is only and only 4........

		List<WebElement> totalElements=objColor.getOptions();

		int actnumber=totalElements.size();

		int expnumber=4;

		if (actnumber==expnumber) {

			System.out.println("the size of color theam dropdown is four(4)");

		} else {

			System.out.println("the size of color theam dropdown is  not four(4)");

		}

		System.out.println("================ Language ==============");
		System.out.println();


		//to test US Enlish element is selected by default in the language dropDown............

		WebElement actLanguage=driver.findElement(By.cssSelector("select[name='login_language']"));

		Select objLanguage=new Select(actLanguage);

		WebElement webLanguage=objLanguage.getFirstSelectedOption();

		String actLanguageTextByDefault=webLanguage.getText();

		String expLanguageTextByDefault="US Enlish";

		if (actLanguageTextByDefault.equalsIgnoreCase(expLanguageTextByDefault)) {

			System.out.println("US Enlish element is selected byfault");

		} else {

			System.out.println("US Enlish element is selected byfault");

		}

		//to test the dropdown is single selected or multiselected..........

		boolean LanguageDropTest=objLanguage.isMultiple();

		if (LanguageDropTest==false) {

			System.out.println("language single selected drop down");

		} else {

			System.out.println("language is not single selected drop down");

		}
		//to test the number of elements is only and only 4........

		List<WebElement> totalElementsLanguage=objLanguage.getOptions();

		int actnumberLanguage=totalElementsLanguage.size();

		int expnumberLanguage=6;

		if (actnumberLanguage==expnumberLanguage) {

			System.out.println("the size of Language dropdown is six(6)");

		} else {

			System.out.println("the size of Language dropdown is  not six(6)");

		}

		System.out.println("================ Login ==============");
		System.out.println();


		//testing the login button visibility................


		WebElement loginbutton=driver.findElement(By.cssSelector("input[type='image']"));


		boolean expectedloginbuttonVisibity=loginbutton.isDisplayed();

		if (expectedloginbuttonVisibity==true) {

			System.out.println("login button is visible");

		}else {
			System.out.println("login button is not visible");
		}

		//to test the user name enable or not.................

		boolean expectedloginbuttonEnable=loginbutton.isDisplayed();

		if (expectedloginbuttonEnable==true) {
			System.out.println("login is enabled");

		}else {
			System.out.println("login is not enabled");

		}




	}

}
