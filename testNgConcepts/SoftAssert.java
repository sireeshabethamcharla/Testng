package testNgConcepts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void FacebookUrl() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		Thread.sleep(3000);
		String actual = "https://facebook.com/";
		String Des = driver.getCurrentUrl();
//		SoftAssert assert = new SoftAssert();
//		assert.assertEquals(Des, actual,"Current Url");
//		assert.assertAll();
		
	}
}	
