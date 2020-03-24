package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	
public static void main(String[] args) {
	
	String exePath = "C:\\Bharath\\Selenium\\Driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver _driver = new ChromeDriver(); 
	_driver.get("http://seleniumhq.org/");
	_driver.quit();
}
}
