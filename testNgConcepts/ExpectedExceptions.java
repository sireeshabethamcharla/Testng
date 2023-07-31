package testNgConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpectedExceptions {
	@Test(expectedExceptions = {NoSuchElementException.class})
	public void Expected() throws Exception {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='sen']")).sendKeys("Admin");
		Thread.sleep(1000);
	}
}