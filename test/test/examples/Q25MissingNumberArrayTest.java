package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q25MissingNumber;

public class Q25MissingNumberArrayTest {

	@Test
	public void missingArrayNumber()
	{
		int number[]= {1,2,4,5};
		assertEquals(Q25MissingNumber.missingNumber(number), 3);
	}
}
