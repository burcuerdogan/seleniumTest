package mavenForTest.seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver ;

	@BeforeSuite

	public void setup(){

		/*
		 * String pathToChromeDriver = "/home/rapsodoyellow";
		 * 
		 * System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
		 */

	driver = new ChromeDriver();

	}
  @Test
  public void exampleOfTestNgMaven() {
	  System.out.println("This is TestNG-Maven Example");
	 
	  driver.get("https://www.google.com.tr/");
  }
  @AfterSuite
  public void quitDriver() throws Exception {
      driver.quit();
  }
}
