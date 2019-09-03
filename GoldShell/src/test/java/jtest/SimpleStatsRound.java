package jtest;

import static org.junit.Assert.*;

import org.junit.Test;

import service.SimpleStats;

public class SimpleStatsRound {

	@Test
	public void test() {
		double input = 1.11111;
		double output = SimpleStats.round(input);
		double expected = 1.1111;
		double variance = 0.000001;
		System.out.println("Expected: " + expected + ", Output: " + output);
		assertEquals(expected, output, variance);
		
	}

}
