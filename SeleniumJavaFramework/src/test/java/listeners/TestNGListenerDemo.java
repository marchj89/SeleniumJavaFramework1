package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//Providing the annotation
//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {

	//Let's create some quick TestNG test
	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}

	@Test
	public void test2() {
		System.out.println("I am inside test 2");

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("A B C D");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//Add an error to have it failed by adding an invalid locator
		driver.findElement(By.name("awsddsdc")).sendKeys("A B C D");
		
		driver.quit();
		driver.close();
		
	}

	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("This test is skipped");
	}



}
