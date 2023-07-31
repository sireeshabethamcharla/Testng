package testNgConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng2 {
	public void Facebook() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver_109.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin@1232");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
