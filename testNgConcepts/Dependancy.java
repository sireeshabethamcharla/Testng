package testNgConcepts;

import org.testng.annotations.Test;


public class Dependancy {
	String number  = null;
	
	@Test
	public void CreateShipment() {
		System.out.println(5/0);
		System.out.println("CreateShipment");
		number = "123Abc";
	}
	
	@Test(dependsOnMethods = {"CreateShipment"},alwaysRun = true)
	public void TrackShipment() throws Exception {
//		if(number != null) {
//			System.out.println("TrackShipment");
//		}
//		else {
//			throw new Exception("Invalid Track Id");
//		}
		System.out.println("TrackShipment");
	}
	
	@Test(dependsOnMethods = {"CreateShipment"},ignoreMissingDependencies = true)
	public void cancelShipment() throws Exception {
//		if(number != null) {
//			System.out.println("cancelShipment");
//		}
//		else {
//			throw new Exception("Invalid Track Id");
//		}
		System.out.println("cancelShipment");
	}
}
