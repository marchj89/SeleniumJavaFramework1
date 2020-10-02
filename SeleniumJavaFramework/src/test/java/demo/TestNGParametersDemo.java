package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	
	//Create a test method or function
	//Convert it to TestNG
	@Test
	//Define another parameter to define the name
	//To get the parameter will convert the whole class to TestNG.xml
	@Parameters({"MyName"})
	public  void test(@Optional("Alain") String name) {
		
		System.out.println("Name is: "+name);
	}

}
