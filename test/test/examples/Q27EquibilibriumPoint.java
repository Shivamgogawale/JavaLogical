package test.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import examples.Q27EquilibriumPoints;

public class Q27EquibilibriumPoint {

	@Test
	public void checkEquibilibriumPoint()
	{
		int number[]= {1,3,5,2,2};
		assertEquals(Q27EquilibriumPoints.equilibriumPoint(number, number.length), 3);
	}
}
