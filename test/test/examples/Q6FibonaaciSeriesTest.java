package test.examples;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q6FibonnaciSeriesUptoNthNumber;

public class Q6FibonaaciSeriesTest {

	@Test
	public void testNthFibo()
	{
		int [] expectedResult= {0, 1, 1, 2, 3, 5};
		int n=5;
		assertArrayEquals(Q6FibonnaciSeriesUptoNthNumber.fibonacciSeriesUptoNth(5), expectedResult);
	}
	
	@Test
	public void testSingledigit()
	{
		int[] expectedResult= {0,1};
		assertArrayEquals(Q6FibonnaciSeriesUptoNthNumber.fibonacciSeriesUptoNth(1),expectedResult);
	}
}
