package testNgConcepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	
	@Test()
	@Parameters("suiteLevel1")
	public void test1(String suiteLevel1) {
		System.out.println("Test1 Print statement  "+suiteLevel1);
	}
	@Test()
	@Parameters({"suiteLevel1","suiteLevel2"})
	public void test2(String suiteLevel1,String suiteLevel2) {
		System.out.println("Test2 Print statement   "+suiteLevel1+"  "+suiteLevel2);
	}
	@Test()
	@Parameters({"methodLevel"})
	public void test3(String methodLevel) {
		System.out.println("Test3 Print statement  "+methodLevel);
	}
	@Test()
	@Parameters({"testLevel"})
	public void test4(String testLevel) {
		System.out.println("Test4 Print statement  "+testLevel);
	}
}
