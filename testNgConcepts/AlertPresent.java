package testNgConcepts;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPresent {
	@Test
	public void Alert() throws InterruptedException {
		Boolean flag = true;
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		Thread.sleep(3000);
		try {
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
