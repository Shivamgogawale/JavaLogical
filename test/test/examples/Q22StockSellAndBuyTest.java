package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import examples.Q22StockBuyAndSell;

public class Q22StockSellAndBuyTest {

	@Test
	public void checkBuyandSell()
	{
		int number[]= {100,180,260,310,40,535,695};
		List <ArrayList<Integer>> expectedResult=new ArrayList<>();
		ArrayList<Integer> trade1=new ArrayList<>();
		trade1.add(0);
		trade1.add(3);
		expectedResult.add(trade1);
		ArrayList<Integer> trade2=new ArrayList<>();
		trade2.add(4);
		trade2.add(6);
		expectedResult.add(trade2);
		
		assertEquals(Q22StockBuyAndSell.stockBuySell(number), expectedResult);		
	}
}
