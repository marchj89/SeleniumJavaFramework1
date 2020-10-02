package demo;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		test();
	}
	public static void test() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver1.exe");

		//Calling the driver
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.google.com/"); 
		driver.findElement(By .name("q")).sendKeys("abcd");
		driver.findElement(By .name("q")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By .linkText("Annual Baltic Conference On Defense")).click();
		
		// Fluent Wait
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(15))
		            .pollingEvery(Duration.ofMillis(500))
		            .ignoring(NoSuchElementException.class)
		            .withMessage("The message you will see in if a TimeoutException is thrown");


		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       
		    	 //I can't find the object link text in the page. So, It is failed for me.
		    	// driver.findElement(By.id("tsf")).submit();
		    	// driver.findElement(By.linkText("2")).click();
		    	WebElement linkElement = driver.findElement(By .linkText("Annual Baltic Conference On Defense"));
		     
		    if(linkElement.isEnabled()) {
		    	
		    	System.out.println("Element Found");
		    	
		    }
		    return linkElement;
		     }
		   });

		element.click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
