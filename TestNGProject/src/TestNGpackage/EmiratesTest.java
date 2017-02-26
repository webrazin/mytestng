package TestNGpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmiratesTest {
	
	
	public WebDriver mydriver; 
	public String baseurl; 
	
	
	
	
	@BeforeMethod 
	public void beforemethod(){
		
	   System.out.println("Starting the beforemethod....."); 
		mydriver= new FirefoxDriver(); 
		baseurl = "https://www.emirates.com/us/english/";
		
		
		
	}
	
	
@Test
	
	public void maintest(){
	System.out.println("Starting the maintest....."); 
	mydriver.get(baseurl);
	
	mydriver.manage().window().maximize();
	mydriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	}
	
	@AfterMethod
	public void aftermethod(){
		
		System.out.println("Starting the aftermethod....."); 
		mydriver.quit(); 
		
		
	}
	
	
	

}
