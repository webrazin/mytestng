import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstTest {
	
	@Test
	public void bb(){
		
		System.out.println("I am in bb the test");	
	}
	
	@Test
	public void ba(){
		
		System.out.println("I am in Ba the test");	
	}
	
	@Test
	public void bc(){
		
		System.out.println("I am in bc the test");	
	}
	
	@BeforeMethod
	public void beforemethod(){
		
		System.out.println("I am in beforemethod");
	}
	
	@AfterMethod
	public void Aftermethod(){
		
		System.out.println("I am in aftermethod");
	}

	@AfterClass
	public void Afterclass(){
		
		System.out.println("I am in after class");
	}
	
	
	@BeforeClass
	public void beforeclass(){
		
		System.out.println("I am in before class");
	}
	
	
	
	
	
}
