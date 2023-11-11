package test.examples;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import examples.Q14SmallestAndSecondSmallest;

public class Q14SmallestAndSecondSmallestElementTest {
	
	@Test
	public void getSmallestandSecondSmallestNumber()
	{
		int number[]= {5 ,2 ,4 ,3 ,5 ,6};
		int expectedArray[]= {2,3};
		assertArrayEquals(Q14SmallestAndSecondSmallest.smallestAnd2ndSmallest(number), expectedArray);	
	}

}
