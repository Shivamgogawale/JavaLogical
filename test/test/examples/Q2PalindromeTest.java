package test.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import examples.Q2Palindrome;

public class Q2PalindromeTest {

	@Test
	public void testPalindrome()
	{
		assertTrue(Q2Palindrome.isPalindrome(121));
		assertTrue(Q2Palindrome.isPalindrome(1221));
	}
	
	@Test
	public void testIsNotPalindrome()
	{
		assertFalse(Q2Palindrome.isPalindrome(123));
		assertFalse(Q2Palindrome.isPalindrome(12343));
	}
}
