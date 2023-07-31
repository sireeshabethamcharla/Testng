package testNgConcepts;

import org.testng.annotations.Test;

public class DataProviderWithTwoClass {

	@Test(dataProvider = "login",dataProviderClass = DataSupplier1.class)
	public void LoginData(String s1, String s2 ) {
		System.out.println(s1+" "+s2);
	}
	
	@Test(dataProvider = "data",dataProviderClass = DataSupplier1.class )
	public void data(String s) {
		System.out.println(s);
	}
	
	@Test(dataProvider = "intData",dataProviderClass = DataSupplier2.class)
	public void integer(int a,int b, int c) {
		System.out.println(a+">>>>"+b+">>>>"+c);
	}
}
