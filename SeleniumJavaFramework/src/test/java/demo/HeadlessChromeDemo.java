package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessChromeDemo {

	@Test
	public static void test() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/percy/Desktop/EW/SeleniumJavaFramework/drivers/chromedriver/chromedriver1.exe");
		//Use of Headless Chrome
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("--window-size=1280,800");
		
		WebDriver driver = new ChromeDriver(options);



		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By .name("q")).sendKeys("Automation");
		driver.findElement(By .name("q")).sendKeys(Keys.ENTER);



		driver.close();
		driver.quit();

		System.out.println("Completed");

	}

}
