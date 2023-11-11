package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q5NthFibonacciNumber;

public class Q5NthFibonacciNumberTest {

	@Test
	public void NthFibonacciTest()
	{
		assertEquals(Q5NthFibonacciNumber.nthFibonnaci(5),5);
	}
	
	@Test
	public void NthFibonacciTestforzero()
	{
		assertEquals(Q5NthFibonacciNumber.nthFibonnaci(1), 1);
	}
}
