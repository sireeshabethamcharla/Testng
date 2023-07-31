package testNgConcepts;

import org.testng.annotations.Test;

public class ParallelExceution2 {
	@Test
	public void TestMethod5() {
		System.out.println("Print Statement >>> TestMethod5 >>>"+Thread.currentThread().getId());
	}
	@Test
	public void TestMethod6() {
		System.out.println("Print Statement >>> TestMethod6>>>"+Thread.currentThread().getId());
	}
	@Test
	public void TestMethod7() {
		System.out.println("Print Statement >>> TestMethod7 >>>"+Thread.currentThread().getId());
	}
	@Test
	public void TestMethod8() {
		System.out.println("Print Statement >>> TestMethod8>>>"+Thread.currentThread().getId());
	}
}
