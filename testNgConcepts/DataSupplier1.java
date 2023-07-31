package testNgConcepts;

import org.testng.annotations.DataProvider;

public class DataSupplier1 {
	
	@DataProvider(name="login")
	public String[][] loginData(){
		String[][] str = new String[][] {
						{"siri","siri@123"},
						{"anil","anil@123"}
		};
		return str;
	}
	
	@DataProvider(name="data")
	public String[] Data () {
		String[] str = new String[2];
		str[0] ="siri";
		str[1] = "anil";
		return str;
	}
}
