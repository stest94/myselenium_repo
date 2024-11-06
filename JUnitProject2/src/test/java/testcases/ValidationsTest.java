package testcases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ValidationsTest {
	
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	@Test
	public void validate() {
		String expectedval = "A";
		String actualval = "A";
		
		System.out.println("Start");

		try {
			Assert.assertEquals(expectedval, actualval); //Expected value, Actual value need to match
		}
		catch(Throwable t) {
			System.out.println(t.getMessage());
			errCol.addError(t);
		}
		
		try {
			Assert.assertTrue("Error Message", 4>2); //Give a message, and a condition (If condition is false, then message will be printed)
			Assert.assertFalse("Error message", 4<2); //Opposite of Assert True
			
			//Assert.fail("Had to be logged in, but not logged in"); //Automatically fails the test
			
		}
		catch(Throwable t) {
			System.out.println(t.getMessage());
			errCol.addError(t);
		}

		System.out.println("End");
		//System.out.println(errCol.toString());
	}
}
