package testNgConcepts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//hard Assert
public class HardAssert {
	
	@Test
	public void orangeHrm() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String des = driver.getTitle();
		String source = "OrangeHRM";
		assertEquals(des, source,"Error Message");
		driver.close();
	}
	
	@Test
	public void GoogleUrl() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		Thread.sleep(2000);
		String acutal = driver.getCurrentUrl();
		String expected = "https://www.google.com/";
		assertEquals(acutal, expected,"Url Does Not Match");
		driver.close();
	}
}
