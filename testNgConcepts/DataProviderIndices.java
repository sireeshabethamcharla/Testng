package testNgConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIndices {
	@Test(dataProvider = "SampleData")
	public void DataFromindices(String uname, String pwd) {
		System.out.println(uname+">>>>>>"+pwd);
		
	}
	
	@DataProvider(indices = {0,1})
	public Object[][] SampleData(){
		Object[][] obj = new Object[][] {
						{"siri","siri@123"},
						{"anil","anil@123"},
						{"test","test@123"},
						{"testAdmin","test@123"}
		};
		return obj;
   }
}
	
