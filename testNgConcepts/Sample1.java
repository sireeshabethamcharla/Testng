package testNgConcepts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1 {
	
	@BeforeTest
	public void lanch() {
		System.out.println("print statement lanch");
	}
	@Test
	public void login() {
		System.out.println("print statement Login");
	}
	@AfterTest
	public void logout() {
		System.out.println("print statement Logout");
	}
}
