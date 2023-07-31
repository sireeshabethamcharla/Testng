package testNgConcepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameters {
	
	@Test()
	@Parameters("test")
	public void test1(@Optional("abc") String test ) {
		System.out.println("print Statement "+test);
	}

}
