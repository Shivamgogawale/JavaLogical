package test.examples;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q9UniqueSubsetsWithOnlyEvenIntegers;

public class Q9UniqueSubsetWithEvenIntegersTest {

	@Test
	public void uniqueEvenSubSetCountTest()
	{
		int []numbers=  {4, 2, 1, 9, 2, 6, 5, 3};
		assertEquals(Q9UniqueSubsetsWithOnlyEvenIntegers.uniqueEvenSubsets(numbers), 7);
	}
	
	@Test
	public void evenNumberTest()
	{
		int []numbers=  {4, 2, 1, 9, 2, 6, 5, 3};
		int [] expectedResult= {4,2,6};
		assertArrayEquals(Q9UniqueSubsetsWithOnlyEvenIntegers.getEvenSubset(numbers), expectedResult);
	}
}
