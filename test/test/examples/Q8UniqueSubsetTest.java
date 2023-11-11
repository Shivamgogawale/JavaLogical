package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import examples.Q8UniqueSubsets;

public class Q8UniqueSubsetTest {

	@Test
	public void isUniqueSubSetTest()
	{
		int [] numbers= {1,2,3};
		List<List<Integer>> expectedResult =new ArrayList<>();
		expectedResult.add(new ArrayList<>());
		expectedResult.add(Arrays.asList(1));
		expectedResult.add(Arrays.asList(2));
		expectedResult.add(Arrays.asList(1,2));
		expectedResult.add(Arrays.asList(3));
		expectedResult.add(Arrays.asList(1,3));
		expectedResult.add(Arrays.asList(2,3));
		expectedResult.add(Arrays.asList(1,2,3));
		assertEquals(Q8UniqueSubsets.uniqueSubset(numbers), expectedResult);
		
	}
}
