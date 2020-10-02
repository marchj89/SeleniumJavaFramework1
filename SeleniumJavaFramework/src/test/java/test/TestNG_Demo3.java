package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo3 {

	//Define the WEBDRIVER at class level
	WebDriver driver = null;


	//Let's use the annotation of TestNG Before the test
	@BeforeTest

	//Create a method for SETUP
	public void setUpTest() {


		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}


	//Let's use the annotation of TestNG for the testx
	@Test

	// Here, we only have the test step in that function
	public void youtubeSearch() throws InterruptedException, AWTException {


		
		driver.get("https://youtube.com");
		driver.findElement(By .name("search_query")).sendKeys("sexin");
		driver.findElement(By .name("search_query")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.cssSelector(".style-scope:nth-child(1) > #dismissable #video-title > .style-scope")).click();
		//driver.findElement(By.xpath("(//yt-formatted-string[contains(.,'Konshens - sexin (official music video)')])[1]")).click();

		
		driver.findElement(By.linkText("Sex in High School")).click();
		
		
		Thread.sleep(3000);
		//driver.findElement(By .linkText("Sex in High School")).click();
		
		
		//WebDriverWait wait1 = new WebDriverWait(driver, 500);
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//yt-formatted-string[@rutoxpath]"))).click();
		
		
		
				
				


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
