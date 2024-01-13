package xpathConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ParentDecendentRelativeXpath {

	public static void main(String[] args) throws InterruptedException {


		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");

		ChromeDriver driver=new ChromeDriver(options);

		driver.get("http://localhost:8888");

		System.out.println(driver.getTitle()); 


		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin1");

		WebElement userPassword=driver.findElement(By.xpath("//input[@name='user_password']"));

		userPassword.sendKeys("janu");

		String actInnertextPass=userPassword.getAttribute("type");

		String expectedinnerPass="password";

		if (actInnertextPass.equalsIgnoreCase(expectedinnerPass)) {

			System.out.println("password is masked");

		}else {

			System.out.println("password is masked");

		}

		WebElement colortheam=driver.findElement(By.xpath("//select[@name='login_theme']"));

		Select colorobj=new Select(colortheam);

		WebElement colorweb=colorobj.getFirstSelectedOption();

		String actcolortext=colorweb.getText();

		String expcolortext="softed";

		if (actcolortext.equalsIgnoreCase(expcolortext)) {

			System.out.println("by default selected color theam is softed");

		}else {

			System.out.println("by default selected color theam is not softed");

		}

		WebElement language=driver.findElement(By.xpath("//select[@name='login_language']"));

		Select languageobj=new Select(language);

		WebElement languageweb=languageobj.getFirstSelectedOption();

		String actlanguagetext=languageweb.getText();

		String explanguagetext="US ENGLISH";

		if (actlanguagetext.equalsIgnoreCase(explanguagetext)) {

			System.out.println("by default selected language is US ENGLISH");

		}else {

			System.out.println("by default selected languageis not US ENGLISH");

		}

		WebElement loginbutton=driver.findElement(By.xpath("//input[@name='Login']"));

		loginbutton.click();

		List<WebElement>  allhaederlink=driver.findElements(By.xpath("//table[@class='hdrTabBg']//a [contains(@href,'index.php')]"));

		System.out.println("all the header link which is given as :- ");

		for (int i = 0; i < allhaederlink.size(); i++) {

			WebElement linkweb=allhaederlink.get(i);

			String innertext=linkweb.getText();

			System.out.println(i+1+". "+innertext);


		}

		Actions hoverElement=new Actions(driver);

		WebElement myhomepagebutton=driver.findElement(By.xpath("//a[text()='My Home Page']"));


		hoverElement.moveToElement(myhomepagebutton).build().perform();

		List<WebElement> allMyhomePagelink=driver.findElements(By.xpath("//div[@class='drop_mnu']//a[contains(@href,'My Home Page')]"));

		int sizemyhomepage=allMyhomePagelink.size();

		System.out.println("all the sub tag or sub link of My Home Page is given as :-");

		for (int j = 0; j < sizemyhomepage; j++) {

			WebElement allweblink=allMyhomePagelink.get(j);

			String linkMyhomePage=allweblink.getText();

			System.out.println(j+1+"> "+linkMyhomePage);

		}

		WebElement Marketingbutton=driver.findElement(By.xpath("//a[text()='Marketing']"));


		hoverElement.moveToElement(Marketingbutton).build().perform();

		List<WebElement> allMarketinglink=driver.findElements(By.xpath("//div[@class='drop_mnu']//a[contains(@href,'Marketing')]"));

		int sizeallMarketing=allMarketinglink.size();

		System.out.println("all the sub tag or sub link of Marketing is given as :-");

		for (int j = 0; j < sizeallMarketing; j++) {

			WebElement allweblinkMark=allMarketinglink.get(j);

			String linkMarketing=allweblinkMark.getText();

			System.out.println(j+1+"> "+linkMarketing);

		}
		WebElement Salesbutton=driver.findElement(By.xpath("//a[text()='Sales']"));


		hoverElement.moveToElement(Salesbutton).build().perform();

		List<WebElement> allSalesbuttonlink=driver.findElements(By.xpath("//div[@class='drop_mnu']//a[contains(@href,'=index&parenttab=Sales')]"));

		int sizeallSales=allSalesbuttonlink.size();

		System.out.println("all the sub tag or sub link of Sales is given as :-");

		for (int j = 0; j < sizeallSales; j++) {

			WebElement allweblinkSales=allSalesbuttonlink.get(j);

			String linkSales=allweblinkSales.getText();

			System.out.println(j+1+"> "+linkSales);

		}
		WebElement supportbutton=driver.findElement(By.xpath("//a[text()='Support']"));


		hoverElement.moveToElement(supportbutton).build().perform();

		List<WebElement> allSupportlink=driver.findElements(By.xpath("//div[@class='drop_mnu']//a[contains(@href,'=index&parenttab=Support')]"));

		int sizeSuopport=allSupportlink.size();

		System.out.println("all the sub tag or sub link of Support is given as :-");

		for (int j = 0; j < sizeSuopport; j++) {

			WebElement allweblinkSupport=allSupportlink.get(j);

			String linkSupport=allweblinkSupport.getText();

			System.out.println(j+1+"> "+linkSupport);

		}
		WebElement analyticsbutton=driver.findElement(By.xpath("//a[text()='Analytics']"));


		hoverElement.moveToElement(analyticsbutton).build().perform();

		List<WebElement> allanalyticslink=driver.findElements(By.xpath("//div[@class='drop_mnu']//a[contains(@href,'=index&parenttab=Analytics')]"));

		int sizeallanalytics=allanalyticslink.size();

		System.out.println("all the sub tag or sub link of analytics is given as :-");

		for (int j = 0; j < sizeallanalytics; j++) {

			WebElement allweblinkanalytics=allanalyticslink.get(j);

			String linkanalytics=allweblinkanalytics.getText();

			System.out.println(j+1+"> "+linkanalytics);

		}
		WebElement inventorybutton=driver.findElement(By.xpath("//a[text()='Inventory']"));


		hoverElement.moveToElement(inventorybutton).build().perform();

		List<WebElement> allInventorylink=driver.findElements(By.xpath("//div[@class='drop_mnu']//a[contains(@href,'=index&parenttab=Inventory')]"));

		int sizeInventory=allInventorylink.size();

		System.out.println("all the sub tag or sub link of Inventory is given as :-");

		for (int j = 0; j < sizeInventory; j++) {

			WebElement allweblinkInventory=allInventorylink.get(j);

			String linkInventory=allweblinkInventory.getText();

			System.out.println(j+1+"* "+linkInventory);

		}
		WebElement toolsbutton=driver.findElement(By.xpath("//a[text()='Tools']"));


		hoverElement.moveToElement(toolsbutton).build().perform();

		List<WebElement> allToolslink=driver.findElements(By.xpath("//div[@class='drop_mnu']//a[contains(@href,'=index&parenttab=Tools')]"));

		int sizeToolslink=allToolslink.size();

		System.out.println("all the sub tag or sub link of Tools is given as :-");

		for (int j = 0; j < sizeToolslink; j++) {

			WebElement allwebTools=allToolslink.get(j);

			String linkTools=allwebTools.getText();

			System.out.println(j+1+":- "+linkTools);

		}
		WebElement settingsbutton=driver.findElement(By.xpath("//a[text()='Settings']"));


		hoverElement.moveToElement(settingsbutton).build().perform();

		List<WebElement> allsettingslink=driver.findElements(By.xpath("//div[@class='drop_mnu']//a[contains(@href,'index.php?module=Settings')]"));

		int sizesettings=allsettingslink.size();

		System.out.println("all the sub tag or sub link of settings is given as :-");

		for (int j = 0; j < sizesettings; j++) {

			WebElement allwebsettingslink=allsettingslink.get(j);

			String settingslink=allwebsettingslink.getText();

			System.out.println(j+1+"- "+settingslink);

		}

		WebElement quickcreatebutton=driver.findElement(By.xpath("//select[@id='qccombo']"));


		hoverElement.click(quickcreatebutton).build().perform();

		List<WebElement> allquickcreatlink=driver.findElements(By.xpath("//select[@id='qccombo']//option"));

		int sizequickcreat=allquickcreatlink.size();

		System.out.println("all the sub tag or sub link of quick creat is given as :-");

		for (int j = 0; j < sizequickcreat; j++) {

			WebElement allwebquickcreatlink=allquickcreatlink.get(j);

			String quickcreatlink=allwebquickcreatlink.getText();

			System.out.println(j+1+"- "+quickcreatlink);

		}


		WebElement searchbutton=driver.findElement(By.xpath("//img[@align='left']"));


		hoverElement.click(searchbutton).build().perform();

		Thread.sleep(7000);

		List<WebElement> allselectmodulelink=driver.findElements(By.xpath("//input[@type='checkbox']"));


		int sizeselectmodule=allselectmodulelink.size();

		for (int j = 0; j < sizeselectmodule; j++) {

			WebElement allwebselectmodule=allselectmodulelink.get(j);

			allwebselectmodule.click();

		}

		List<WebElement> textselectmodule=driver.findElements(By.xpath("//table[@class='small']//td[@class='dvtCellLabel']"));

		int sizetextselectmodule=textselectmodule.size();

		System.out.println("all the sub tag or sub module in select modules is given as :-"+sizetextselectmodule);

		for (int j = 0; j < sizetextselectmodule; j++) {

			WebElement allwebtextselectmodule=textselectmodule.get(j);

			String webtextselectmodule=allwebtextselectmodule.getText();

			System.out.println(j+1+"- "+webtextselectmodule);

		}



	}

}
