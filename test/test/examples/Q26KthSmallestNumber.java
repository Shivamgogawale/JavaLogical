package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q26KthSmallestElement;

public class Q26KthSmallestNumber {

	@Test
	public void kthSmallestNumber()
	{
		int number[]= {7 ,10 ,4 ,20 ,15};
		assertEquals(Q26KthSmallestElement.KthSmallestElement(number, 3), 10);
	}
	
}
