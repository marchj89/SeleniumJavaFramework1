package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo_UseProperties;

public class PropertiesFile {

	//Create a static variable (object for properties) to use it in the entire class
	static Properties prop = new Properties();

	//Get the location of my project in case I will share the project to get the PATH of the file right
	static String projectPath = System.getProperty("user.dir");


	public static void main(String[] args) {

		getProperties();
		setProperties();
		getProperties();

	}

	/*******************************************************
	//Create a method to read data from the properties file
	 * *****************************************************
	 */
	public static void getProperties() {


		try {
			//Create object for properties
			//Properties prop = new Properties();



			//Create an input stream to get access to the properties file
			InputStream input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");

			//Load the properties file
			prop.load(input);

			//Get values from the properties file
			String mbrowser = prop.getProperty("browser");

			System.out.println(mbrowser);
			
			//Calling the class "TestNG_Demo_UseProperties"
			TestNG_Demo_UseProperties.browserName = mbrowser;
		}

		// Catch exception if the file's path is incorrect or something wrong happens 
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}



	}

	/*******************************************************
	//Create a method to write data from the properties file
	 * *****************************************************
	 */

	public static void setProperties() {

		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");

			//Set values to the file
			prop.setProperty("Result", "Passed");

			//Store the values
			prop.store(output, null);
		}

		// Catch exception if the file's path is incorrect or something wrong happens 
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
}
