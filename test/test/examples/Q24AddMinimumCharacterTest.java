package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q24AddMinimumCharacters;

public class Q24AddMinimumCharacterTest {

	@Test
	public void minimumCharaterCount()
	{
		assertEquals(Q24AddMinimumCharacters.addMinChar("Shivam"), 5);
	}
}
