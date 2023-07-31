package testNgConcepts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAsserFacebook {
	@Test
	public void Login() throws Exception {
		System.setProperty("Webdriver.chrome.driver","./Drivers\\chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9876543210");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123abc");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000); 
		String text = driver.getTitle();
		String extTxt = "Log in to Facebook";
		assertEquals(text, extTxt,"Title is");
		//msg
		String msg = driver.findElement(By.xpath("(//div[@id='loginform']//descendant::div)[8]")).getText();
		String expMsg = "The password that you've entered is incorrect";
		assertNotEquals(msg, expMsg,"Error Msg");
		
		//url
		String url = driver.getCurrentUrl();
		String extUrl = "https://www.facebook.com/";
		assertEquals(url, extUrl,"Current Url is");
		

		
//		//border
//		String border = driver.findElement(By.xpath("//input[@id='email']")).getCssValue("border");
//		String expBorder = "1px solid #F02849 rgb(240,40,73)";
//		assertEquals(border, expBorder,"border colour");
		
	}

}
