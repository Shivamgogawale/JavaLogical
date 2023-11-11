package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q13ThirdLargestNumber;

public class Q13ThirdLargestElement {
	
	@Test
	public void getThirdLargestElement()
	{
		int number[]= {2,4,1,3,5};
		assertEquals(Q13ThirdLargestNumber.getThirdLargestNumber(number), 3);
	}

}
