package test.examples;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import examples.Q12ZigZagArray;

public class Q12ZigZagArrayTest {

	@Test
	public void zigzagArrayTest()
	{
		int number[]= {4, 3, 7, 8, 6, 2, 1};
		int expectedResult[]= { 3 ,7 ,4, 8, 2 ,6, 1};
		assertArrayEquals(Q12ZigZagArray.zigZag(number), expectedResult);
	}
}
