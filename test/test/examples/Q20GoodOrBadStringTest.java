package test.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import examples.Q20GoodOrBadStrings;

public class Q20GoodOrBadStringTest {

	@Test
	public void isGoodOrbadString()
	{
		  assertTrue(Q20GoodOrBadStrings.isGoodOrBad("aeioc?ae?i")); 
	      assertTrue(Q20GoodOrBadStrings.isGoodOrBad("a?cbe?i?do?u"));
	      assertTrue(Q20GoodOrBadStrings.isGoodOrBad("?"));	
	      assertFalse(Q20GoodOrBadStrings.isGoodOrBad("aeiou?ae?i"));
	      assertFalse(Q20GoodOrBadStrings.isGoodOrBad("a?e?i?o?u"));
	}
}
