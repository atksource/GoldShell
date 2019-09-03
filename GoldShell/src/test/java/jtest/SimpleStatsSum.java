package jtest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import service.SimpleStats;

public class SimpleStatsSum {

	@Test
	public void test() {
		ArrayList<Double> testingList = new ArrayList<>();
		// Building testingList to sum 6.0
		testingList.add(1.0);
		testingList.add(2.0);
		testingList.add(3.0);
		double expected = 6.0;
		double output = SimpleStats.sum(testingList);
		double variance = 0.001;
		assertEquals(expected, output, variance);
	}
}
