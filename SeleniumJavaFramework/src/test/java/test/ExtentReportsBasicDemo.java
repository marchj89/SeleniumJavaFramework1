package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportsBasicDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

		//Create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// Create a test
		ExtentTest test1 = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");


		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		
		
		driver.findElement(By .name("q")).sendKeys("Automation Step by step");
		test1.pass("Entered text in Searchbox");

		driver.findElement(By .name("q")).sendKeys(Keys.RETURN);
		test1.pass("Press keyboard enter key");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		test1.pass("Close the browser");
		
		test1.info("Test completed");
		
		//Very important
		// Flush the report to write everything to the log file
		extent.flush();

	}

}
