package golf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class RMOTION {
	//TODO the test cases are copied from MLM
	private WebDriver driver ;

	@BeforeSuite
	public void setup(){ driver = new ChromeDriver();}

	@Test
	public void textContents() {
		
		driver.get("https://v2.rapsodo.com/golf/rm");
		String measure = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/h1")).getText();
		String mobileLaunch = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]")).getText();
		String whatIsThis = driver.findElement(By.xpath("//*[@id=\"product-monitor\"]/div/div[1]/h2[1]")).getText();
		String paragrapgh = driver.findElement(By.xpath("//*[@id=\"tank\"]/p")).getText();
		String expectedParagraph = "Rapsodo has harnessed the power of your mobile device and combined it with our professional grade machine learning to create the Rapsodo Mobile Launch Monitor. You will be able to work on your game like never before with professional accuracy for shot distance, ball speed, club speed, launch angle, launch direction and shot shape. Review your shots and improve your game using video from each shot you take with an active tracer to track your shot shape. Share videos with your friends when you bomb a drive or pinpoint an iron. With groundbreaking features like GPS maps to show your shot scatter on your home range and interactive games, the Rapsodo Mobile Launch Monitor will transform how you play golf.";
		
		String dimensions = driver.findElement(By.xpath("//*[@id=\"hitting-monitor-bottom\"]")).getText();
		String forGolf = driver.findElement(By.xpath("//*[@id=\"description\"]/h4")).getText();
		String descriptionsFeatures = driver.findElement(By.xpath("//*[@id=\"description-features\"]")).getText();
		
		//shop button
		driver.findElement(By.xpath("//*[@id=\"product-monitor-button\"]"));
		
		String videos = driver.findElement(By.xpath("//*[@id=\"videos\"]/div/div[1]/h2")).getText();
		
		//video frame
		driver.findElement(By.xpath("//*[@id=\"video-play\"]/div")).click();
		
		String howitWorks = driver.findElement(By.xpath("//*[@id=\"product-desc\"]/div/div/div[2]/div/h2")).getText();
		String ulElement1 = driver.findElement(By.xpath("//*[@id=\"product-desc\"]/div/div/div[2]/ul/li[1]")).getText();
		String ulElement2 = driver.findElement(By.xpath("//*[@id=\"product-desc\"]/div/div/div[2]/ul/li[2]")).getText();
		String ulElement3 = driver.findElement(By.xpath("//*[@id=\"product-desc\"]/div/div/div[2]/ul/li[3]")).getText();
		String ulElement4 = driver.findElement(By.xpath("//*[@id=\"product-desc\"]/div/div/div[2]/ul/li[4]")).getText();
		String ulElement5 = driver.findElement(By.xpath("//*[@id=\"product-desc\"]/div/div/div[2]/ul/li[5]")).getText();

		
		//setup guide button
		driver.findElement(By.xpath("//*[@id=\"product-desc\"]/div/div/div[2]/a"));
		
		String metrics = driver.findElement(By.xpath("//*[@id=\"features\"]/div/div[1]/h2")).getText();
		String measurements = driver.findElement(By.xpath("//*[@id=\"features\"]/div/div[2]/h2")).getText();

		//carry button
		driver.findElement(By.xpath("//*[@id=\"col-left\"]/div[1]")).click();
		String carry = driver.findElement(By.xpath("//*[@id=\"col-left\"]/div[1]/div/div[1]/div[1]")).getText();
		String carryContent = driver.findElement(By.xpath("//*[@id=\"col-left\"]/div[1]/div/div[1]/div[2]")).getText();
		
		//ballspeed button
		driver.findElement(By.xpath("//*[@id=\"col-left\"]/div[2]")).click();
		String ballspeed = driver.findElement(By.xpath("//*[@id=\"col-left\"]/div[2]/div/div[1]/div[1]")).getText();
		String ballspeedContent = driver.findElement(By.xpath("//*[@id=\"col-left\"]/div[2]/div/div[1]/div[2]")).getText();
	
	
		Assert.assertEquals("MEASURE TO MASTER", measure);
		Assert.assertEquals("RAPSODO MOBILE LAUNCH MONITOR", mobileLaunch);
		Assert.assertEquals("WHAT IT IS", whatIsThis);
		Assert.assertEquals(expectedParagraph, paragrapgh);
		Assert.assertEquals("DIMENSIONS", dimensions);
		Assert.assertEquals("", forGolf);
		Assert.assertEquals("", descriptionsFeatures);
		Assert.assertEquals("", videos);
		Assert.assertEquals("", howitWorks);
		Assert.assertEquals("", ulElement1);
		Assert.assertEquals("", ulElement2);
		Assert.assertEquals("", ulElement3);
		Assert.assertEquals("", ulElement4);
		Assert.assertEquals("", ulElement5);
		Assert.assertEquals("", metrics);
		Assert.assertEquals("", measurements);
		Assert.assertEquals("", carry);
		Assert.assertEquals("", carryContent);
		Assert.assertEquals("", ballspeed);
		Assert.assertEquals("", ballspeedContent);
	
	}
	@AfterSuite
	public void quitDriver() throws Exception {
		driver.quit();
	}


}
