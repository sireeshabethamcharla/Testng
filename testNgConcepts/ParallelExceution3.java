package testNgConcepts;

import org.testng.annotations.Test;

public class ParallelExceution3 {
	@Test
	public void TestMethod9() {
		System.out.println("Print Statement >>> TestMethod9>>>"+Thread.currentThread().getId());
	}
	@Test
	public void TestMethod10() {
		System.out.println("Print Statement >>> TestMethod10>>>"+Thread.currentThread().getId());
	}
	@Test
	public void TestMethod11() {
		System.out.println("Print Statement >>> TestMethod11>>>"+Thread.currentThread().getId());
	}
	@Test
	public void TestMethod12() {
		System.out.println("Print Statement >>> TestMethod12>>>"+Thread.currentThread().getId());
	}

}
