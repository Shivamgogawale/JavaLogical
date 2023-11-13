package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q29CountPairsWithSum;

public class Q29CountPairSum {

	@Test
	public void countPairOfSum()
	{
		int numbers[]={1, 5, 7, 1};
		assertEquals(Q29CountPairsWithSum.getPairsCount(numbers, 6),2);
	}
}
