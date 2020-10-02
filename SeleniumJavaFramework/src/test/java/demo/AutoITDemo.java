package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		test() ;
	}

	//Create a method/function
	public static void test() throws IOException, InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver1.exe");

		//Calling the driver
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.ilovepdf.com/compress_pdf"); 
		driver.findElement(By .xpath("//a[@id='pickfiles']/span")).click();
				
		//After clicking the window will pop up
		//We need to call our AutoIT script
		Runtime.getRuntime().exec("C:\\Users\\percy\\Desktop\\AutoIT_Files\\FileUploadScript.exe");
		
		Thread.sleep(20000);
		
		driver.close();
		driver.quit();
		
	}
}
