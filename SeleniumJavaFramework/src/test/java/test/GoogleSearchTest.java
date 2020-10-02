package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;

	public static void main(String[] args) throws AWTException, InterruptedException {
		googleSearch();

	}

	public static void googleSearch() throws AWTException, InterruptedException {

		Robot robot = new Robot();

		//Define the path
		String projectPath = System.getProperty("user.dir");
		//System.out.println("The path is: " +projectPath);

		//Set the location of the driver
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");

		//Calling the driver
		driver = new FirefoxDriver();

		//Go to google.com
		driver.get("https://google.com");

		//Calling TextBox function from the package "Pages"
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by step");



		//Calling Button method from package "Pages"
		//GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		//Pause
		Thread.sleep(3000);

		//Close the browser
		driver.close();

		//Display a message in our console
		System.out.print("Test completed successfully");
	}

}
