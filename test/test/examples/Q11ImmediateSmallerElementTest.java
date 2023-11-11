package test.examples;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import examples.Q11ImmediateSmallerElement;

public class Q11ImmediateSmallerElementTest {

	@Test
	public void isimmediateSmallerElementTest()
	{
		int [] expectedResult= {2,1, -1, 3, -1};
		int [] numbers= {4, 2, 1, 5, 3};
		assertArrayEquals(Q11ImmediateSmallerElement.immdiateSmaller(numbers), expectedResult);
	}
	
}
