package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		seleniumWaits();
	}

	public static void seleniumWaits() {

		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		
		driver.get("https://www.google.com/"); 
		driver.findElement(By .name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By .name("q")).sendKeys(Keys.RETURN);
		
		//Let's provide a non-existed locator name "abcd" to use the implicit waits. It will throw the "No Such Element" exception
		driver.findElement(By .name("abcd")).click();
		
		//The use of implicit wait
		//It will wait for 10 seconds before raising the exception. If the element is loaded before 10 seconds it will not raise the issue.
		//The default pool time (waiting) is 250 ms
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Define the explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//Use of explicit wait
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By .name("abcdef")));
		
		
		
		driver.close();
		driver.quit();
		
	}

}
