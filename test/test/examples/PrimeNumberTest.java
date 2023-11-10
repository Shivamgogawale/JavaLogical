package test.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import examples.Q1PrimeNumber;

public class PrimeNumberTest {

	@ParameterizedTest
	@ValueSource(ints = {2,3,5,7})
	public void testPrimeNumber(int nummber)
	{
		assertTrue(Q1PrimeNumber.primerNumber(nummber));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,8,6,4})
	public void testNonPrimeNumber(int nummber)
	{
		assertFalse(Q1PrimeNumber.primerNumber(nummber));
	}
}
