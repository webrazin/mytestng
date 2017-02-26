package TestNGpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	/*@Parameters( { "firstname", "lastname", "email", "state" } )
	@Test
	public void paratest(String firstname, String lastname,
			String email, String state ) throws Exception {
		
		System.out.println(firstname); 
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(state);
		
	}
	*/
	
	
@DataProvider(name="fieldsInputs")
	public static Object[][] searchData() {
		return new Object[][] {{"New York", "Chicago", "test1", "test2"},
				{"New York", "Boston", "test3", "test4"}};
	}

	
	@Test(dataProvider="fieldsInputs")
	public void dataptest(String origin, String dest,
			String depDate, String retDate) throws Exception {
		
		System.out.println(origin); 
		System.out.println(dest);
		System.out.println(depDate);
		System.out.println(retDate);
		
	}



}
