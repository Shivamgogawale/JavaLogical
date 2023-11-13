package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q30MaximumSubArray;

public class Q30MaximumProductsubArray {
	
	@Test
	public void maximumProduct()
	{
		int number[]= {6, -3, -10, 0, 2};
		assertEquals(Q30MaximumSubArray.maxProduct(number),180 );
	}

}
