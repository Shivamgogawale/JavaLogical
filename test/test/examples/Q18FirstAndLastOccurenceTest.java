package test.examples;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import examples.Q18FirstandLastOccurence;

public class Q18FirstAndLastOccurenceTest {

	@Test
	public void checkFirstandLastOccuenence()
	{
		int[] number= {1,3,4,3,5};
		int[] expectedResult= {1,3};
		assertArrayEquals(Q18FirstandLastOccurence.firstAndLast(number, 3), expectedResult);
	}
}
