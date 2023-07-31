package testNgConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterOrange {
	
	@Test()
	@Parameters({"url","userName","password"})
	public void OrangeHrmUrl(String Url,String userName,String password ) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver_109.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@name='login']")).click();   
	}
}
