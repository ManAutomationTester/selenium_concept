package onlineAtomateByXpath;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
 
	
	public class DateTimeExample {
		
	    public static void main(String[] args) {
	        LocalDateTime now = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss a");
	        String formattedDateTime = now.format(formatter);
	        System.out.println("Formatted DateTime: " + formattedDateTime);
	        
	        dateAndTime();
	        date();
	    }
	    public static void dateAndTime() {
	    	
	    	LocalDateTime nowTime=LocalDateTime.now();
	    	DateTimeFormatter dateFormate=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    	String formettedTime=nowTime.format(dateFormate);
	    	System.out.println("Current Time With Date : "+formettedTime);
	    	
	    }
	    
	    public static void date() {
	    	SimpleDateFormat sdm=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a");
	    	String dateFormate=sdm.format(new Date());
	    	System.out.println("Current Date :"+dateFormate);
	    }
}
