package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q15AnagramofString;

public class Q15AnagramOfStringTest {
	
	@Test
	public void isAnagramOfString()
	{
		String str1="bcadeh";
		String str2="hea";
		assertEquals(Q15AnagramofString.anagramString(str1, str2), 3);
	}

}
