package testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	ShopMobilePhoneTest.class,
	ValidationsTest.class
})
public class CustomProjectRunner {
	
}
//run - CMD Prompt - ANT/Maven
//HTML Reports using ANT
//EXE file
//ant commands:
	//ant compile
	//ant test
//Create EXE file by creating a notepad file. Add the CMD prompt commands in the file. Save it in "" as .bat file

//Running using Maven
//CMD prompt commands
//cd Project-directory

//Get Build.xml through Maven
//mvn ant:ant
//mvn clean
//mvn test
