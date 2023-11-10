package test.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import examples.Q4PalindromeString;

public class Q4PalindromeStringTest {

	@Test
	public void testPalindromeString()
	{
		assertTrue(Q4PalindromeString.isPalindromeString("madam"));
	}
	
	@Test
	public void testisNotPalindromeString()
	{
		assertFalse(Q4PalindromeString.isPalindromeString("abc"));
	}
}
