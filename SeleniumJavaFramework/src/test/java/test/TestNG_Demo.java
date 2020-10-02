package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {

	//Define the WEBDRIVER at class level
	WebDriver driver = null;


	//Let's use the annotation of TestNG Before the test
	@BeforeTest

	//Create a method for SETUP
	public void setUpTest() {

		//Define the path
		String projectPath = System.getProperty("user.dir");
		//System.out.println("The path is: " +projectPath);

		//Set the location of the driver
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");

		//Calling the driver
		driver = new FirefoxDriver();



	}


	//Let's use the annotation of TestNG for the test
	@Test

	// Here, we only have the test step in that function
	public void googleSearch() throws InterruptedException, AWTException {


		Robot robot = new Robot();

		//Go to google.com
		driver.get("https://google.com");

		//Enter text in search TextBox
		driver.findElement(By .name("q")).sendKeys("Automation Step by step");

		//Click on search Button. It will fail because the auto-suggestion will hide the button
		//driver.findElement(By .name("btnK")).click();


		//Press Enter button from the keyboard
		//driver.findElement(By .name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By .name("q")).sendKeys(Keys.RETURN);


		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);


		//Pause
		Thread.sleep(3000);


	}

	//Let's use the annotation of TestNG After the test
	@AfterTest

	//We create a third method to quit the driver.
	public void tearDownTest() {

		//Close the browser
		driver.quit();

		//Display a message in our console
		System.out.print("Test completed successfully");

	}

}
