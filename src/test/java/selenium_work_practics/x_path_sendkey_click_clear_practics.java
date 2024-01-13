package selenium_work_practics;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class x_path_sendkey_click_clear_practics {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"All_Driver\\chromedriver.exe");
ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver Driver=new ChromeDriver(options);

		Driver.get("http:localhost:8888/");

		String browertitle = Driver.getTitle(); System.out.println(browertitle);

		String browerurl = Driver.getCurrentUrl(); System.out.println(browerurl);

		//		  String pagesource = Driver.getPageSource();
		//		  
		//		  System.out.println(pagesource);


		WebElement username= Driver.findElement(By.xpath("//input[@name='user_name']"));

		username.sendKeys("admin1");

		Driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(
				"janu");

		WebElement themebutton =
				Driver.findElement(By.xpath("//select[@name='login_theme']"));
		themebutton.sendKeys("woodspice");

		WebElement languagebutton =
				Driver.findElement(By.xpath("//select[@name='login_language']"));
		languagebutton.sendKeys("US English");

		Driver.findElement(By.xpath("//input[@name='Login']")).click();

		Driver.findElement(By.linkText("Marketing")).click();

		Driver.findElement(By.linkText("Accounts")).click();

		Driver.findElement(By.xpath("//img[@title='Create Account...']")).click();

		WebElement accountname =
				Driver.findElement(By.xpath("//input[@name='accountname']"));
		accountname.sendKeys("saving");

		WebElement websitename = Driver.findElement(By.xpath("//input[@onkeyup]"));
		websitename.sendKeys("www.uinonbankofindia.co.in"); //// only taken //


		Driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8081157129");

		WebElement tickersymbl =
				Driver.findElement(By.xpath("//input[@name='tickersymbol']"));
		tickersymbl.sendKeys("Union Bank Of India Ltd");

		WebElement faxnumber = Driver.findElement(By.xpath("//input[@id='fax']"));
		faxnumber.sendKeys("05452 262786");

		WebElement membername =
				Driver.findElement(By.xpath("//input[@name='account_name']"));
		membername.sendKeys("Union Bank Of India");

		Thread.sleep(3000);

		WebElement emailname = Driver.findElement(By.xpath("//input[@id='email1']"));
		emailname.sendKeys("mansinghbtechme310@gmail.com");

		Driver.findElement(By.xpath("//input[@value='T']")).click();

		Driver.findElement(By.xpath("//select[@name='assigned_group_id']")).
		sendKeys("Support Group");

		WebElement addressname =
				Driver.findElement(By.xpath("//textarea[@name='bill_street']"));
		addressname.sendKeys("Pashchim Sharira Kaushambi Utter Pradesh 212214");

		WebElement biilPoName =
				Driver.findElement(By.xpath("//input[@id='bill_pobox']"));
		biilPoName.sendKeys("post:Pashchim Sharira");

		WebElement cityname =
				Driver.findElement(By.xpath("//input[@id='bill_city']"));
		cityname.sendKeys("kaushambi");

		WebElement statename =
				Driver.findElement(By.xpath("//input[@id='bill_state']"));
		statename.sendKeys("utter pradesh");

		WebElement postalcode =
				Driver.findElement(By.xpath("//input[@id='bill_code']"));
		postalcode.sendKeys("13114");

		WebElement countryname =
				Driver.findElement(By.xpath("//input[@id='bill_country']"));
		countryname.sendKeys("India");

		
//		Driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).
//		// click();

		WebElement sippingname =
		Driver.findElement(By.xpath("//textarea[@name='ship_street']"));
		sippingname.sendKeys("bhadohi");

		WebElement sipp_po_name =
				Driver.findElement(By.xpath("//input[@id='ship_pobox']"));
		sipp_po_name.sendKeys("mondh");

		WebElement sipping_city =
				Driver.findElement(By.xpath("//input[@id='ship_city']"));
		sipping_city.sendKeys("varanashi");

		WebElement sipping_state =
				Driver.findElement(By.xpath("//input[@id='ship_state']"));
		sipping_state.sendKeys("utter pradesh");

		WebElement sipping_postalcode =
				Driver.findElement(By.xpath("//input[@id='ship_code']"));
		sipping_postalcode.sendKeys("41131");

		WebElement sipping_countryname =
				Driver.findElement(By.xpath("//input[@id='ship_country']"));
		sipping_countryname.sendKeys("India");

		Driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(
				"this is ptetty straightforward.text that use this structure simply describe something.withfew exception,these texts also present plenty of details what's re describing.  "
				);

		// Thread.sleep(3000); ///// [1000mills=1sec]

		
//	WebElement ab=	Driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[2]"));
//	ab.click();
//	//WebElement abc=	Driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[2]"));
//	ab.sendKeys(Keys.ENTER);
//	ab.sendKeys(Keys.ENTER);
	
		

		
//		 Driver.switchTo().alert().accept();

		// Driver.close();

		// Driver.quit();

		// Driver.findElement(By.linkText("Leads")).click();

		Driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// condition of link or hyperlink*********

		/// syntax:tagname[text()='value'].....innertext

		Driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();

		Driver.findElement(By.xpath("//select[@name='salutationtype']")).sendKeys(
				"Mr.");

		WebElement
		firstname=Driver.findElement(By.xpath("//input[@name='firstname']"));

		firstname.sendKeys("man");

		WebElement
		lastname=Driver.findElement(By.xpath("//input[@name='lastname']"));

		lastname.sendKeys("singh");

		WebElement phonename=Driver.findElement(By.xpath("//input[@id='phone']"));

		phonename.sendKeys("8765850154");

		WebElement
		companyname=Driver.findElement(By.xpath("//input[@name='company']"));

		companyname.sendKeys("expert view automation");

		WebElement
		mobilename=Driver.findElement(By.xpath("//input[@name='mobile']"));

		mobilename.sendKeys("6387087690");

		WebElement
		titlename=Driver.findElement(By.xpath("//input[@name='designation']"));

		titlename.sendKeys("coaching centre");

		WebElement faxname=Driver.findElement(By.xpath("//input[@name='fax']"));

		faxname.sendKeys("12345");

		WebElement
		sourcename1=Driver.findElement(By.xpath("//select[@name='leadsource']"));

		sourcename1.sendKeys("Employee");

		WebElement emailname2=Driver.findElement(By.xpath("//input[@name='email']"));

		emailname2.sendKeys("sinm67254@gmail.com");

		WebElement
		statusname2=Driver.findElement(By.xpath("//select[@name='leadstatus']"));

		statusname2.sendKeys("Contact in Future");

		WebElement
		streetname=Driver.findElement(By.xpath("//textarea[@name='lane']"));

		streetname.sendKeys(" pashchim sharira kaushambi");

		WebElement poname1=Driver.findElement(By.xpath("//input[@name='pobox']"));


		poname1.sendKeys("pashchim sharira");

		WebElement
		posalcodename=Driver.findElement(By.xpath("//input[@name='code']"));

		posalcodename.sendKeys("987654321");


		WebElement cityname1=Driver.findElement(By.xpath("//input[@name='city']"));

		cityname1.sendKeys("kaushambi");

		WebElement
		countryname1=Driver.findElement(By.xpath("//input[@name='country']"));

		countryname1.sendKeys("utter pradesh");

		WebElement statename1=Driver.findElement(By.xpath("//input[@name='state']"));

		statename1.sendKeys("utter pradesh");

		WebElement
		descriptionname=Driver.findElement(By.xpath("//textarea[@name='description']"
				));

		descriptionname.
		sendKeys("its very good to use for practics of selenium web browers ");

		WebElement
		savebutton1=Driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"
				));

		savebutton1.click();

		Driver.findElement(By.xpath("//a[text()='Inventory']")).click();

		Driver.findElement(By.xpath("//img[@alt='Create Products...']")).click();

		WebElement
		productname=Driver.findElement(By.xpath("//input[@name='productname']"));

		productname.sendKeys("jewellary");

		WebElement partname=
				Driver.findElement(By.xpath("//input[@name='productcode']"));

		partname.sendKeys("12345");

		WebElement startdate=
				Driver.findElement(By.xpath("//input[@id='jscal_field_sales_start_date']"));

		startdate.sendKeys("2001-07-24");

		WebElement
		manufacturename=Driver.findElement(By.xpath("//select[@name='manufacturer']")
				);

		manufacturename.sendKeys("LexPon Inc");

		WebElement categryname=
				Driver.findElement(By.xpath("//select[@name='productcategory']"));

		categryname.sendKeys("//select[@name='productcategory']");


		WebElement
		supportdate=Driver.findElement(By.xpath("//input[@name='start_date']"));


		supportdate.sendKeys("2025-11-12");

		WebElement
		enddate=Driver.findElement(By.xpath("//input[@name='sales_end_date']"));

		enddate.sendKeys("2022-12-20");

		WebElement
		expairydate=Driver.findElement(By.xpath("//input[@name='expiry_date']"));

		expairydate.sendKeys("2025-12-20");

		WebElement
		vendername=Driver.findElement(By.xpath("//input[@name='vendor_name']"));

		vendername.sendKeys("Man Singh");

		WebElement webname=Driver.findElement(By.xpath("//input[@name='website']"));

		webname.sendKeys("google.com");

		WebElement vendernumber=
				Driver.findElement(By.xpath("//input[@id='vendor_part_no']"));

		vendernumber.sendKeys("54321");

		WebElement
		mfrnumber=Driver.findElement(By.xpath("//input[@id='mfr_part_no']"));

		mfrnumber.sendKeys("98765");

		WebElement
		sheetnumber=Driver.findElement(By.xpath("//input[@id='productsheet']"));

		sheetnumber.sendKeys("90887");

		WebElement serialnumber=
				Driver.findElement(By.xpath("//input[@id='serial_no']"));

		serialnumber.sendKeys("45674");

		WebElement glaccountname=
				Driver.findElement(By.xpath("//select[@name='glacct']"));

		glaccountname.sendKeys("302-Rental-Income");


		WebElement unitprice=
				Driver.findElement(By.xpath("//input[@id='unit_price']"));

		unitprice.sendKeys("50000");

		WebElement commisionrate=
				Driver.findElement(By.xpath("//input[@id='commissionrate']"));

		commisionrate.sendKeys("1%");

		WebElement vatpercent=
				Driver.findElement(By.xpath("//select[@name='glacct']"));

		vatpercent.click();

		WebElement salespercentage=
				Driver.findElement(By.xpath("//input[@id='tax2_check']"));

		salespercentage.click();


		WebElement serevicepercentage=
				Driver.findElement(By.xpath("//input[@id='tax3_check']"));

		serevicepercentage.click();

		WebElement
		description=Driver.findElement(By.xpath("//textarea[@name='description']"));

		description.sendKeys("the product is too good.it can anyone use easly");

		
//		Driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();

		Driver.findElement(By.xpath("//img[@align='left']")).click();

		Driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();



		Thread.sleep(5000);

		Driver.findElement(By.xpath("//input[@value='Accounts']")).click();

		Driver.findElement(By.xpath("//input[@value='Assets']")).click();

		Driver.findElement(By.xpath("//a[text()='Select All']")).click();

		Thread.sleep(5000);

		Driver.findElement(By.xpath("//a[text()='UnSelect All']")).click();


		////// start another method........is based method/////

		boolean actualapplybutton=Driver.findElement(By.
				xpath("//input[@class='crmbutton small create']")).isEnabled();

		boolean expectedapplybutton=true;

		if (expectedapplybutton==actualapplybutton) {

			System.out.println("yes it is enabled. you can apply");

		}

		else { System.out.println("No it is not enable"); }

		boolean applybutton=Driver.findElement(By.
				xpath("//input[@class='crmbutton small create']")).isDisplayed();

		if (applybutton==true) { System.out.println("yes dear it is displayed");

		} else { System.out.println("No dear it is not displayed"); }
		Driver.findElement(By.xpath("//input[@class='crmbutton small create']")).
		click();

		WebElement search=Driver.findElement(By.xpath(
				"//img[@src='themes/images/FindDuplicates-Faded.gif']"));

		boolean actualsearchbutton=search.isEnabled();

		boolean expectedsearchbutton=false;

		if (expectedsearchbutton==actualsearchbutton) {

			System.out.println("search button is not enabled ");

		} else {

			System.out.println("search button is enabled"); }

		String lastinventryurl=Driver.getCurrentUrl();

		System.out.println(lastinventryurl);

		
//		boolean salesbutton=Driver.findElement(By.linkText("Purchase Order")).isDisplayed();

		boolean expectsalesbutton=false;

		if (expectsalesbutton==true) {

			System.out.println("ya it's displayed"); } else {

				System.out.println("no it's not displayed");

			}

		Driver.findElement(By.xpath("(//a[text()='Price Books'])[1]")).click();

		Driver.findElement(By.xpath("//img[@alt='Create Price Book...']")).click();

		WebElement pricebookname
		=Driver.findElement(By.xpath("//input[@name='bookname']"));

		pricebookname.sendKeys("Mahabharat");

		WebElement
		Activecheckbox=Driver.findElement(By.xpath("//input[@name='active']"));

		Activecheckbox.click();

		Thread.sleep(5000);

		boolean resultofcheckbox=Activecheckbox.isSelected();

		System.out.println(resultofcheckbox);

		if (resultofcheckbox==false) {

			System.out.println(" Active button is not checked ");

		}

		else {

			System.out.println("Active button is checked" ); }

		Activecheckbox.click();

		Thread.sleep(4000);

		boolean afterclickresult=Activecheckbox.isSelected();

		boolean expectedcheckresult=false;

		if (expectedcheckresult==afterclickresult) {

			System.out.println("No the active button is not checked after click"); }

		else {

			System.out.println("yes the active button is checked after click"); }

		WebElement
		bookdiscription=Driver.findElement(By.xpath("//textarea[@name='description']"
				));

		bookdiscription.
		sendKeys("Mahabharata is a major Hindu Mythological Sanskrit epic. This great epic narrates the great war between the Kauravas and Pandavas. It is a philosophical and devotional story that has many inspiring characters and chapters.\r\n"
				+ "\r\n" + "");


		Driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();

		String modifieddatename=Driver.findElement(By.xpath(
				"(//td[@class='dvtCellInfo'])[5]")).getText();

		System.out.println(modifieddatename);

		String
		MoreInfo=Driver.findElement(By.xpath("(//a[text()='More Information'])[2]")).
		getAttribute("href");

		System.out.println(MoreInfo);

		boolean moreinfobutton=Driver.findElement(By.
				xpath("(//a[text()='More Information'])[2]")).isEnabled();

		System.out.println(moreinfobutton);

		if (moreinfobutton==true) {

			System.out.println("more information is displayed"); }

		else {

			System.out.println("more information is not displayed"); }


		String down=Driver.findElement(By.
				xpath("(//span[@style='color: rgb(153, 153, 153);'])[1]")).getText();

		System.out.println(down);


		Driver.findElement(By.xpath("//a[text()='Support']")).click();

		boolean actualimpobutton=	Driver.findElement(By.xpath("//img[@alt='Import Trouble Tickets']")).isEnabled();

		boolean expectedimpobutton=true;
		if (expectedimpobutton==actualimpobutton) {

			System.out.println("import button is enable");

		}
		else {

			System.out.println("import button is enable");
		}

		WebElement checkbox	=Driver.findElement(By.xpath("//input[@name='selectall']"));

		boolean box =checkbox.isSelected();

		if (box==false) {
			System.out.println("it is unchecked");
		}
		else {
			System.out.println("it is checked");
		}

		checkbox.click();   /////// click the check box

		boolean box1 =checkbox.isSelected();

		if (box1==true) {

			System.out.println("it is selected");

		}
		else {
			System.out.println("it is unselected");
		}

		org.openqa.selenium.Dimension searchfor=Driver.findElement(By.xpath("//input[@name='search_text']")).getSize();

		int searcheight=searchfor.getHeight();

		int width=searchfor.getWidth();

		System.out.println("heigth="+searcheight+" and "+" width="+width);

		if (searcheight==16 && width==126) {


			System.out.println("search for is displayed");


		}
		else {
			System.out.println("search for is not displayed");
		}


		Point searchlocation=Driver.findElement(By.xpath("//b[text()='Search for']")).getLocation();

		int search_xcord=searchlocation.getX();

		int serach_ycord=searchlocation.getY();

		System.out.println("the location of search for in x direction = "+search_xcord+"  and  "+"the location of search for in y direction = "+serach_ycord);

		
		
		//////   DROPEDOWN HANDLING.........WITH THE HELP OF 'SELECTED' METHOD..
		
		WebElement searchnow =Driver.findElement(By.xpath("(//select[@id='bas_searchfield'])[1]"));
		
		
		Select searchnowbutton=new Select(searchnow);
		
		WebElement actsearchnowbutton=searchnowbutton.getFirstSelectedOption();
		
		String actsearchnowbuttontext=actsearchnowbutton.getText();
		
		String expsearchnowbuttontex="Ticket No";
		 
		if (actsearchnowbuttontext.equalsIgnoreCase(expsearchnowbuttontex)) {
			
			System.out.println("the  actual first selected option is ="+actsearchnowbuttontext+" is matched to the expected first selected option is ="+expsearchnowbuttontex);
			
		}else {
			System.err.println("the  actual first selected option is ="+actsearchnowbuttontext+" is  not matched to the expected first selected option is ="+expsearchnowbuttontex);

		}
		
		boolean actsearchnow=searchnowbutton.isMultiple();
		
		boolean expsearchnow=false;
		
		if (actsearchnow==expsearchnow) {
			
			System.out.println("No, it is not multiple selected list so our test case is passesd ");
			
		}else {
			System.err.println("Yes, it is  multiple selected list so our test case is failed ");

		}
		

		searchnowbutton.selectByVisibleText("Priority");
		
		Thread.sleep(4000);
		
		searchnowbutton.selectByValue("ticket_title");
		
		Thread.sleep(4000);

		searchnowbutton.selectByIndex(5);
		
	
		
		

	}
}
