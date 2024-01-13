package xpathConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		
ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(options);
		
driver.get("http://localhost:8888");
driver.findElement(By.xpath("/html/body/div/table[2]/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("admin");

driver.findElement(By.xpath("/html/body/div/table[2]/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("admin");
 
driver.findElement(By.xpath("/html/body/div/table[2]/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/select")).sendKeys("bluelagoon");

driver.findElement(By.xpath("/html/body/div/table[2]/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input")).click();


List<WebElement> linktext=driver.findElements(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td/a"));

System.out.println("the size of the header link is = "+linktext.size());

for (int i = 0; i <linktext.size() ; i++) {
	

	WebElement headerlink=linktext.get(i);
	
	System.out.println(headerlink.getText());
	
}
WebElement myhomepage=driver.findElement( By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[2]"));

myhomepage.click();

Thread.sleep(4000);

List<WebElement> myHomePagelink=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr/td/table/tbody/tr/td"));

System.out.println("the size of the my home page link is = "+myHomePagelink.size());

for (int i = 0; i <myHomePagelink.size() ; i++) {
		

	WebElement myHomePagetext=myHomePagelink.get(i);
	String hometext=myHomePagetext.getText();
	System.out.println(hometext);
	
}

WebElement marketing=driver.findElement( By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[4]/a"));

marketing.click();

List<WebElement> allMarklink=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr/td/table/tbody/tr/td"));


System.out.println(" all marketing link which is given as :- "+allMarklink.size());

for (int i = 0; i < allMarklink.size(); i++) {
	
	WebElement allmarkweb=allMarklink.get(i);
	
	String marklink=allmarkweb.getText();
	
	System.out.println(marklink);
	
}

WebElement salesbutton=driver.findElement( By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[6]"));

salesbutton.click();

List<WebElement> allsaleslink=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr/td/table/tbody/tr/td"));


System.out.println(" all sales link which is given as :- "+allsaleslink.size());

for (int i = 0; i < allsaleslink.size(); i++) {
	
	WebElement allsalesweb=allsaleslink.get(i);
	
	String saleslink=allsalesweb.getText();
	
	System.out.println(saleslink);
}
WebElement supportbutton=driver.findElement( By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[8]"));

supportbutton.click();

List<WebElement> allsupportlink=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr/td/table/tbody/tr/td"));


System.out.println(" all support link which is given as :- "+allsupportlink.size());

for (int i = 0; i < allsupportlink.size(); i++) {
	
	WebElement allsupportweb=allsupportlink.get(i);
	
	String supportlink=allsupportweb.getText();
	
	System.out.println(supportlink);
}


WebElement inventorybutton=driver.findElement( By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[12]"));

inventorybutton.click();

List<WebElement> allInventorybuttonlink=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr/td/table/tbody/tr/td"));


System.out.println(" all Inventory link which is given as :- "+allInventorybuttonlink.size());

for (int i = 0; i < allInventorybuttonlink.size(); i++) {
	
	WebElement allinventoryweb=allInventorybuttonlink.get(i);
	
	String inventorylink=allinventoryweb.getText();
	
	System.out.println(inventorylink);
}

WebElement toolsbutton=driver.findElement( By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[14]"));

toolsbutton.click();

List<WebElement> alltoolslink=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr/td/table/tbody/tr/td"));


System.out.println(" all tools link which is given as :- "+alltoolslink.size());

for (int i = 0; i < alltoolslink.size(); i++) {
	
	WebElement alltoolstweb=alltoolslink.get(i);
	
	String toolslink=alltoolstweb.getText();
	
	System.out.println(toolslink);
}


WebElement settingsbutton=driver.findElement( By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[16]"));

settingsbutton.click();

List<WebElement> allSettingslink=driver.findElements(By.xpath("/html/body/table[3]/tbody/tr/td/table/tbody/tr/td"));


System.out.println(" all Settings link which is given as :- "+allSettingslink.size());

for (int i = 0; i < allSettingslink.size(); i++) {
	
	WebElement allSettingsweb=allSettingslink.get(i);
	
	String Settingslink=allSettingsweb.getText();
	
	System.out.println(Settingslink);
}




	}

}
