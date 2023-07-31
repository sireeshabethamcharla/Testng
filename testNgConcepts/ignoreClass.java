package testNgConcepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignoreClass {
	//ignore method
	@Ignore
	@Test
	public void test1() {
		System.out.println("Print Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Print Test 2");
	}
	@Ignore
	@Test
	public void test3() {
		System.out.println("Print Test 3");
	}
	@Test
	public void test4() {
		System.out.println("Print Test 4");
	}
	@Test
	public void test5() {
		System.out.println("Print Test 5");
	}
	@Test
	public void test6() {
		System.out.println("Print Test 6");
	}
}
