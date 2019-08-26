package driver;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import service.SimpleStats;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Double> workingArray = new ArrayList<Double>();
		double currentValue = 100;
		double growthRate = 0.03;
		int iterations = 10;
		for(int i = iterations; i != 0; i--) {
			double nextDouble = currentValue + (currentValue * growthRate);
			nextDouble = SimpleStats.round(nextDouble);
			workingArray.add(nextDouble);
			currentValue = nextDouble;
		}
		
		System.out.println(workingArray);
		System.out.println("Summation of Array:  " + SimpleStats.round(SimpleStats.sum(workingArray)));
		System.out.println("Average of Array:  " + SimpleStats.round(SimpleStats.average(workingArray)));

	}

}
