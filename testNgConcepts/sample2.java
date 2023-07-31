package testNgConcepts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample2 {
	
	@BeforeTest
	public void Userlogin1() {
		System.out.println("print statement Userlogin1");
	}
	@Test
	public void Userlogin2() {
		System.out.println("print statement Userlogin2");
	}
	@Test
	public void Userlogin3() {
		System.out.println("print statement Userlogin3");
	}
	@Test
	public void Userlogin4() {
		System.out.println("print statement Userlogin4");
	}
	@Test
	public void Userlogin5() {
		System.out.println("print statement Userlogin5");
	}
	@AfterTest
	public void Userlogin6() {
		System.out.println("print statement Userlogin6");
	}
}
