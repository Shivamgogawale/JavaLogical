package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q28SecondLargest;

public class Q28SecondLargestNumberTest {

	@Test
	public void checkSecondLargestNumber()
	{
		int [] number= {12, 35, 1, 10, 34, 1};
		assertEquals(Q28SecondLargest.secondLargest(number), 34);
	}
}
