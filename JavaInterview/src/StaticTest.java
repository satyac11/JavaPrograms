

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class StaticTest {
	
	@Test
	void test() {
		assertEquals(Example.EXAMPLE_VALUE,20);
		Example ex1 = new Example();
		Example ex2 = new Example();
		ex2.EXAMPLE_VALUE=10;
		//assertEquals(Example.EXAMPLE_VALUE, 20);
		assertEquals(ex1.EXAMPLE_VALUE, 10);
	}

}
