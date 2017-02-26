package TestNGpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class priorityTest {
	
	 @Test(priority=2)
	  public void f() {
		  
		  System.out.println("Testing f ..P2.....Sucessfull ");
	  }
	  
	  @Test(priority=1)
	  public void c() {
		  
		  System.out.println("Testing c ....P1... Sucessfull ");
	  }
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("Starting the test....... ");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  System.out.println("Ending the test ......... ");
	  }
	
	

}
