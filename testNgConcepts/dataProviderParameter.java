package testNgConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderParameter {

	@Test(dataProvider = "string")
	public void SingleStringDisplay(String s) {
		System.out.println("Single String Data ...... " + s);
	}
	@Test(dataProvider = "multiString")
	public void MultiString(String s1,String s2) {
		System.out.println("Multiple String Data......."+s1+">>>>>"+s2);
	}

	@DataProvider(name = "string")
	public String[] SingleString() {
		String[] str = new String[]{ 
				"siri",
				"anil" 
		};
		return str;
	}
	@DataProvider(name="multiString")
	public String[][] MultiString() {
		String[][] mulStr = new String[][] {
			{"Siri","siri@123"},
			{"anil","anil@123"}
			
		};
		return mulStr;
	}
	
}


