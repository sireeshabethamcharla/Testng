package testNgConcepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//ignore at class
@Ignore
public class IgnoreClass2 {
	//ignore method with out using ignore key word
	@Test(enabled = false)
	public void test7() {
		System.out.println("Print Test 7");
	}
	@Test
	public void test8() {
		System.out.println("Print Test 8");
	}
	@Test
	public void test9() {
		System.out.println("Print Test 9");
	}
	@Test
	public void test10() {
		System.out.println("Print Test 10");
	}
	@Test
	public void test11() {
		System.out.println("Print Test 11");
	}
	@Test
	public void test12() {
		System.out.println("Print Test 12");
	}
}
