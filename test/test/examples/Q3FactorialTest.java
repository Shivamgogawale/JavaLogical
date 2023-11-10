package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q3Factorial;

public class Q3FactorialTest {

	@Test
	public void testFactorial()
	{
		assertEquals(Q3Factorial.getFactorial(5),120);
		assertEquals(Q3Factorial.getFactorial(1),1);
	}
}
