package testNgConcepts;

import org.testng.annotations.Test;

public class ParallelExceution {
	@Test
	public void TestMethod1() {
		System.out.println("Print Statement >>> TestMethod1 >>> "+Thread.currentThread().getId());
	}
	@Test
	public void TestMethod2() {
		System.out.println("Print Statement >>> TestMethod2 >>> "+Thread.currentThread().getId());
	}
	@Test
	public void TestMethod3() {
		System.out.println("Print Statement >>> TestMethod3 >>>"+Thread.currentThread().getId());
	}
	@Test
	public void TestMethod4() {
		System.out.println("Print Statement >>> TestMethod4 >>>"+Thread.currentThread().getId());
	}

}
