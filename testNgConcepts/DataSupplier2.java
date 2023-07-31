package testNgConcepts;

import org.testng.annotations.DataProvider;

import net.bytebuddy.asm.Advice.Return;

public class DataSupplier2 {
	@DataProvider
	public Integer[][] intData() {
		Integer[][] intValue = new Integer[][] {
						 {1,2,3},
						 {2,3,4},
						 {3,4,5}
		};
		return intValue;
	}

}
