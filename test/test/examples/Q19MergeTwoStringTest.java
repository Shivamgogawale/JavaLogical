package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q19MergeTwoStrings;

public class Q19MergeTwoStringTest {

	@Test
	public void checkMergeStrings()
	{
		String str1="Hello";
		String str2="Bye";
		String expectedResult="HBeylelo";
		assertEquals(Q19MergeTwoStrings.mergeStrings(str1, str2), expectedResult);
	}
}
