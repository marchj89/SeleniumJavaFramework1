package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	//Let's create a variable for the webDriver
	WebDriver driver = null;

	private static String projectPath = System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	//Let's take an input in this method named "browserName"
	public void setup(String browserName) {

		System.out.println("Browser name is: "+browserName);
		System.out.println("Thread id: "+Thread.currentThread().getId());
		System.out.println("Thread name: "+Thread.currentThread().getName());

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEdriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

	}

	@Test
	public void test1() throws InterruptedException {

		//Create a Selenium Test
		driver.get("https://google.com");
		Thread.sleep(4000);


	}


	@AfterTest
	public void teardown() {

		driver.quit();
		driver.close();
		System.out.println("Test completed");

	}

}
