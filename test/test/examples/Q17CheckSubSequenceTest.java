package test.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import examples.Q17CheckSubsequence;

public class Q17CheckSubSequenceTest {

	@Test
	public void checkSubsequence()
	{
		assertTrue(Q17CheckSubsequence.isSubSequence("gksrek","geeksforgeeks"));
	}
	
	@Test
	public void isNotSubSequence()
	{
		assertFalse(Q17CheckSubsequence.isSubSequence("AXY", "YADXCP"));
	}
}
