package testcases;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//Try to name the test cases alphabetically, so JUnit runs them in order.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShopMobilePhoneTest {
	
	@Test
	public void test_a_searchForMobile() {
		System.out.println("Searching for mobile Test case");
	}
	
	@Test
	public void test_b_selectMobile() {
		System.out.println("Selecting mobile");
	}
	
	//@Ignore //Ignores the test case
	@Test
	public void test_c_checkOut() {
		
		Assume.assumeTrue(false); //Also ignores the test case
		System.out.println("Checkout");
	}
}
