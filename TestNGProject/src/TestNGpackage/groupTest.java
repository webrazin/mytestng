package TestNGpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groupTest {
	
	@Test (groups={"group1"})
	  public void f() {
		  
		  System.out.println("Testing f ...... Sucessfull");
	  }
	  
	  @Test(groups={"group1"})
	  public void a() {
		  
		  System.out.println("Testing a .......Sucessfull ");
	  }
	  
	  @Test(groups={"group3"})
	  public void c() {
		  
		  System.out.println("Testing C ....... Sucessfull ");
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



