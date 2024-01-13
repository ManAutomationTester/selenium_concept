package xpathConcept;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpDateBrowers {

	public static void main(String[] args) {
		UpDateBrowers.UpDate113();
	
   
	}
	public static void UpDate113() {
	    

//			driver = webdriver.Opera(executable_path="/path/to/operamini/driver")

		
			WebDriver driver1=new FirefoxDriver();
//			WebDriver driver2=new ChromeDriver();
//			WebDriver driver3=new EdgeDriver();
			
			driver1.get("http:localhost:8888");
	}

}
