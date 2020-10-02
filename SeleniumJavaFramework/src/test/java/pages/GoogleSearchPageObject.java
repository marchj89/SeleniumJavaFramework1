package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

	WebDriver driver = null;
	

	// Defining the locators
	By textbox_search = By.name("q");

	//By button_search = By.name("btnK");
	By button_search = By.name("//input[@class='gLFyf gsfi']");
	
	
	By click_link = By .cssSelector(".g:nth-child(1) .LC20lb > span");
	
	//Creating a constructor to be use in other class
	public GoogleSearchPageObject(WebDriver driver) {
		
		this.driver = driver;
		
	}



	//Defining actions on the locators
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
	}


	public void clickSearchButton() throws AWTException {
		//driver.findElement(button_search).sendKeys(Keys.RETURN);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	
	public void ClickElement() {
		driver.findElement(click_link).click();
	}


}
