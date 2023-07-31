package testNgConcepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter2 {
	@Test()
	@Parameters("suiteLevel1")
	public void test5(String suiteLevel1) {
		System.out.println("Test5 Print statement  "+suiteLevel1);
	}
	@Test
	@Parameters({"suiteLevel1","suiteLevel2"})
	public void test6(String suiteLevel1,String suiteLevel2) {
		System.out.println("Test6 Print statement   "+suiteLevel1+"  "+suiteLevel2);
	}
	@Test
	@Parameters({"methodLevel"})
	public void test7(String methodLevel) {
		System.out.println("Test7 Print statement "+methodLevel);
	}
	@Test
	@Parameters({"testLevel"})
	public void test8(String testLevel) {
		System.out.println("Test8 Print statement  "+testLevel);
	}
}
