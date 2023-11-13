package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q23BuyAndSellStock2;

public class Q23StockSellAndBuyIITest {

	@Test
	public void sellAndBuyTest()
	{
		int number[]={3, 4, 1, 5};
		assertEquals(Q23BuyAndSellStock2.maxProfit(4, number),5);
	}
	
}
