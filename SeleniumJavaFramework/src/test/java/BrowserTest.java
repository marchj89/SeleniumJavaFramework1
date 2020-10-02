import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		//System.out.println("The path is: " +projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
		//driver.findElement(By .name("q")).sendKeys("Automation Step by step");
		//or
		
		//WebElement textBox = driver.findElement(By .xpath("//input[contains(@class,'gLFyf gsfi')]"));
		
		//textBox.sendKeys("Automation Step by step");
		
		List<WebElement> listOfInputElements = driver.findElements(By .xpath("//input"));
		
		int count = listOfInputElements.size();
		System.out.println("Count of Input elements: "+count);
		
		Thread.sleep(3000);
		
		driver.quit();
		driver.close();
	}

}
