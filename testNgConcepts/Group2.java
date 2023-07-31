package testNgConcepts;

import org.testng.annotations.Test;

public class Group2 {
	
	@Test(groups = {"smokeTest"})
	public void test7() {
		System.out.println("Print Statement of test7");
	}
	@Test(groups = {"smokeTest","sanity","window.os"})
	public void test8() {
		System.out.println("Print Statement of test8");
	}
	@Test(groups = {"window.os"})
	public void test9() {
		System.out.println("Print Statement of test9");
	}
	@Test(groups = {"smokeTest","sanity"})
	public void test10() {
		System.out.println("Print Statement of test10");
	}
	@Test(groups = {"retesting","regression","window.io"})
	public void test11() {
		System.out.println("Print Statement of test11");
	}
	@Test(groups = {"retesting","window.io"})
	public void test12() {
		System.out.println("Print Statement of test12");
	}
	@Test
	public void test13() {
		System.out.println("Print Statement of test13");
	}

}
