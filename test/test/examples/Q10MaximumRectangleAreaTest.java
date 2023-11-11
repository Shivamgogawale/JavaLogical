package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q10MaximumRectangle;

public class Q10MaximumRectangleAreaTest {

	@Test
	public void getMaximumRectangleAreaTest()
	{
		int [][]number= {{1,2}, {3,4}, {5,6}};
		assertEquals(Q10MaximumRectangle.getMaxRect(number), 30);
	}
}
