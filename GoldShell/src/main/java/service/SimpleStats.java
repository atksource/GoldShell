package service;

import java.util.ArrayList;

public class SimpleStats {
	
	
	public SimpleStats() {
		super();
	}

	public static double sum(ArrayList<Double> workingList) {
		double totalAmount = 0.0;
		for(int i = 0; i < workingList.size(); i++) {
			totalAmount = totalAmount + workingList.get(i);
			System.out.println(totalAmount);
		}
		return totalAmount;
	}
	
	public static double round(double numberToRound) {
		double roundedNumber = Math.round(numberToRound * 10000.0) / 10000.0;
		return roundedNumber;
	}
	
	public static double average(ArrayList<Double> workingList) {
		double averageNumber;
		double summation = sum(workingList);
		averageNumber= (summation / workingList.size());		
		return averageNumber;
	}
	
	public static ArrayList<Double> movingAverage(ArrayList<Double> workingList) {
		ArrayList<Double> movingAverageArrayList = new ArrayList<Double>();	
		return movingAverageArrayList;
	}

}
