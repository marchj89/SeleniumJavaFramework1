package test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {

	//Initiating the driver for this class
	private static WebDriver driver = null;

	//Create the main class, We add the exception because the method we call has an exception.
	public static void main(String[] args) throws AWTException, InterruptedException {

		googleSearchTest();

	}

	//Create a function, We add the exception because we use a function in the class "GoogleSearchPageObject" that has that exception
	public static void googleSearchTest() throws AWTException, InterruptedException {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();

		//Create an object from our class "GoogleSearchPageObject" in the package "pages"
		GoogleSearchPageObject searcPageObj = new GoogleSearchPageObject(driver);

		//We will use that object to call functions in the "GoogleSearchPageObject" class
		driver.get("https://google.com");
		searcPageObj.setTextInSearchBox("A B C D");

		searcPageObj.clickSearchButton();
		searcPageObj.ClickElement();
		
		Thread.sleep(3000);
		
		driver.quit();
		driver.close();
	}

}
