package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		
	}
@After
public void teardown() {
	//driver.quit();
}
public static WebDriver getDriver() {
	return driver;
}
}
