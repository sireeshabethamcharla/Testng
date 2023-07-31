package testNgConcepts;

import org.testng.annotations.Test;
@Test(groups = "all")
public class Groups {
	@Test(groups = {"smokeTest","sanity","window.os"})
	public void test1() {
		System.out.println("Print Statement of test1");
	}
	
	@Test(groups = {"sanity","retesting" ,"window.io"})
	public void test2() {
		System.out.println("Print Statement of test2");
	}
	
	@Test(groups = {"retesting","regression","window.os"})
	public void test3() {
		System.out.println("Print Statement of test3");
	}
	
	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("Print Statement of test4");
	}
	
	@Test(groups = {"window.os"})
	public void test5() {
		System.out.println("Print Statement of test5");
	}
	@Test
	public void test6() {
		System.out.println("Print Statement of test6");
	}
}
