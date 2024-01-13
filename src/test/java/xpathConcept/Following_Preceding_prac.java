package xpathConcept;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Following_Preceding_prac {
	
public static void main(String[] args) {
	
	
	
	ChromeOptions opt=new ChromeOptions();
	
	opt.addArguments("--remote-allow-origins=*");
	
	ChromeDriver driver =new ChromeDriver(opt);
	
	driver.get("http:/localhost:8888");
}
}
