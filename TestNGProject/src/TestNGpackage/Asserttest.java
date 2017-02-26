package TestNGpackage;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asserttest {
	
	@Test
	public void teststring() {
		String actualString = "Mytest";
		Reporter.log("The actual string is " + actualString, true);
		Assert.assertEquals(actualString, "Mytest");
		Reporter.log("Verifying the actual string with expected value", true);
		Reporter.log("");
	}
	
	@Test
	public void testInt() {
		int actualInt = 9;
		Reporter.log("The actual integer is " + actualInt, true);
		Assert.assertEquals(actualInt, 10);
		Reporter.log("Verifying the actual integer with expected value", true);
		Reporter.log("");
	}
	
	@Test
	public void testArrays() {
		int[] actualArray = {1, 2, 3};
		int[] expectedArray = {1, 5, 3};
		Reporter.log("The actual array is " + Arrays.toString(actualArray) , true);
		Assert.assertEquals(actualArray, expectedArray);
		Reporter.log("Verifying the actual array with expected value", true);
		Reporter.log("");
	}


}
