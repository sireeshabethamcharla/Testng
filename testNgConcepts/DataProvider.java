package testNgConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider = "LoginData")
	public void OrangeHrm(String userName, String password) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
	}
	@org.testng.annotations.DataProvider()
	public Object[][] LoginData() {
		Object[][] obj = new Object[2][2];
		obj[0][0] = "Admin";
		obj[0][1] = "admin123";
		
		obj[1][0] = "Admin";
		obj[1][1] = "test";
		return obj;
	}
}
