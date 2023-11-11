package test.examples;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

import examples.Q16SieveOfErathneons;

public class Q16SieveofEratoenesTest {
	
	@Test
	public void sieveOfErathneonsTest()
	{
		int [] expectedResult= {2 ,3 ,5 ,7};
		assertArrayEquals(Q16SieveOfErathneons.sieveOfErathneons(10), expectedResult);
	}

}
