package testcases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Step 1
@RunWith(Parameterized.class)
public class LoginTest {
	//Step 2
	String username;
	String password;
	String browser;
	
	//Step 3 (build a constructor)
	public LoginTest(String name, String password, String browser) {
		this.username = name;
		this.password = password;
		this.browser = browser;
	}
	
	@Test
	public void loginTest() {
		System.out.println(this.username+", "+this.password+", "+this.browser);
	}
	
	//Step 4
	@Parameters
	public static Collection<Object []> getData(){
		Object [][] data = new Object[4][3];
		
		data[0][0] = "U1"; //1st row
		data[0][1] = "password";
		data[0][2] = "chrome";
		
		data[1][0] = "U2"; //2nd row
		data[1][1] = "pass";
		data[1][2] = "chrome";
		
		data[2][0] = "U3"; //3rd row
		data[2][1] = "password2";
		data[2][2] = "edge";
		
		data[3][0] = "U4";
		data[3][1] = "password1234";
		data[3][2] = "chrome";
		
		return Arrays.asList(data);
	}
}
