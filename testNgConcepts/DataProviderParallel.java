package testNgConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParallel {
	@Test(dataProvider = "LoginData")
	public void Parallel(String uname, String pwd) throws Exception {
		System.setProperty("webderiver.chrome.driver", "./Drivers\\chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");                                                                                                                                                                                                                                                                                                                                                                                        
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@DataProvider(parallel = true)
	public Object[][] LoginData(){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		Object[][] data = new Object[6][2];
		data[0][0] = "Admin";
		data[0][1] ="admin123";
		
		data[1][0] = "Admin";
		data[1][1] ="admin123";
		
		data[2][0] = "Admin";
		data[2][1] ="admin123";
		
		data[3][0] = "Admin";
		data[3][1] ="admin123";
		
		data[4][0] = "Admin";
		data[4][1] ="admin123";
		
		data[5][0] = "Admin";
		data[5][1] ="admin123";
		
		return data;	
	}
}
