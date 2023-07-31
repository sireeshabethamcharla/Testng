package testNgConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	
	@Test(dataProvider = "login")
	public void FacebookLogin(String uname, String pwd) {
		System.out.println(uname+"  "+pwd);
	}


	@DataProvider(name = "login")
	public Object[][] LoginData() {
		Object[][] obj = new Object[][]{
				{"siri","siri@123"},
				{"anil","anil@123"}
		};
		return obj; 
	 }
}

