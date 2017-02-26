package TestNGpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependentTest {
	
	@Test
	  public void f() {
		  
		  System.out.println("Testing f ...... Sucessfull");
	  }
	  
	  @Test(dependsOnMethods={"f"})
	  public void a() {
		  
		  System.out.println("Testing a .......Sucessfull ");
	  }
	  
	  @Test
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
