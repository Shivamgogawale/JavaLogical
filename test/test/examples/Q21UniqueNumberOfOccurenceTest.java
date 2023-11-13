package test.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import examples.Q21UniqueNumberOccurence;

public class Q21UniqueNumberOfOccurenceTest {

	
	@Test
	public void uniqueNumberOfOccurenceTest()
	{
		int number[]= {1, 1, 2, 5, 5,5};
		assertTrue(Q21UniqueNumberOccurence.isFrequencyUnique(number));
	}
	
	@Test
	public void notUniqueNumberOfOccurence()
	{
		int number[]= {1,1,2,2};
		assertFalse(Q21UniqueNumberOccurence.isFrequencyUnique(number));
	}
}
