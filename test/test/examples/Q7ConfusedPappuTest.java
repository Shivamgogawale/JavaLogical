package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q7ConfusedPappu;

public class Q7ConfusedPappuTest {

	@Test
	public void confusedPappuTest()
	{
		assertEquals(Q7ConfusedPappu.extraAmountGivenByPappu(56), 3);
		assertEquals(Q7ConfusedPappu.extraAmountGivenByPappu(66), 33);
		assertEquals(Q7ConfusedPappu.extraAmountGivenByPappu(0), 0);
		assertEquals(Q7ConfusedPappu.extraAmountGivenByPappu(22), 0);
		
		
	}
}
