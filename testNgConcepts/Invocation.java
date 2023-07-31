package testNgConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount = 3,threadPoolSize = 2)
	public void OrangeHrm() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread()+">>>");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		//driver.close();
	}

}
