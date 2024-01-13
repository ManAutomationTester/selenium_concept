package selenium_work_practics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class youtube_Automate_program {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Automate tiger");
ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver Driver=new ChromeDriver(options);
Driver.get("https://google.com");
String pagetitle=Driver.getTitle();
 System.out.println(pagetitle);
String GmailUrl=Driver.getCurrentUrl();
System.out.println(GmailUrl);
WebElement username=Driver.findElement(By.name("identifier"));
username.sendKeys("mansinghbetechme310@gmail.com");

WebElement uname=Driver.findElement(By.xpath("//input[@name='user_name']"));
uname.sendKeys("admin");

WebElement pass=Driver.findElement(By.xpath("//input[@name=\"user_password\"]"));
pass.sendKeys("admin");


WebElement buttonlog=Driver.findElement(By.xpath("//input[@name=\"Login\"]"));
buttonlog.click();

Driver.findElement(By.linkText("Marketing")).click();
Driver.findElement(By.linkText("Campaigns")).click();
Driver.findElement(By.linkText("calender")).click();


Driver.get("http:localhost:8888/");

 By username1 =By.name("user_name");
WebElement user=Driver.findElement (username1);
user.clear();
user.sendKeys("admin");


WebElement password=Driver.findElement(By.name("user_password"));

password.sendKeys("janu");


WebElement loginbutton=Driver.findElement(By.name("Login"));
loginbutton.click();
 
Driver.findElement(By.linkText("Marketing")).click();


boolean actimpobuttin=Driver.findElement(By.xpath("//img[@src='themes/images/tbarImport-Faded.gif']")).isEnabled();

boolean expectedimpobutton=false;

if (actimpobuttin==expectedimpobutton) {
	
	System.out.println("import button is disabled");
	
}

else {
	System.out.println("import button is enabled");
}
     /// x-path...

////    syntax:html_tag[@attribute='value'].....Attribute- id-class-name



//Driver.findElement(By.xpath("(//select[@class='small'])[1]"));
//Thread.sleep(2000);
//Driver.findElement(By.xpath("(//img)[24]")).click();  ///indexing methode
//
////Dggriver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
//            ///  this is the first save keybutton 
//Driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
//     ///  this is the second save keybutton
//WebElement campain_name=Driver.findElement(By.xpath("//input[@name='campaignname']"));
//campain_name.sendKeys("expert view automation");

Driver.get("https://youtube.com");
WebElement button=Driver.findElement(By.name("search_query"));
button.sendKeys("https://youtu.be/sABN7goDbZ8");

Driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();


Driver.findElement(By.xpath("//*[@id=\"thumbnail\"]/yt-image/img ")).click();


Driver.findElement(By.xpath("//img[@id='thumbnail']")).click();





Driver.get("https://sarkariresult.com");



//		WebElement sarkari_button=Driver.findElement(By.linkText("SSC 10+2 CHSL Online Form 2022"));
//		sarkari_button.click();
//		Driver.findElement(By.linkText("Click Here")).click();
//Driver.get("http:facebook.com");
//Driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8081157129");
//Driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("10027042");
//	Driver.findElement(By.xpath("//button[@name='login']")).click();
//	Driver.get("http:youtube.com");
	
	
	}
	
}
 