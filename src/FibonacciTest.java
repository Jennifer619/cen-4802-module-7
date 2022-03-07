import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	void test() {
		Fibonacci test = new Fibonacci();
		int n = 10;
		int output = test.fib(n);
		assertEquals(55, output);
	}

}
