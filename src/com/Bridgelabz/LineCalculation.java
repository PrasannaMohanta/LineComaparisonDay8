package com.Bridgelabz;

/**
 * 
 * @author pmoha
 *
 */

public class LineCalculation {
	/**
	 *
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * point 1
		 */
		double x1 = 1;
		double y1 = 1;

		/*
		 * point 2
		 */
		double x2 = 5;
		double y2 = 5;

		/*
		 * Calculate distance between two points
		 */
		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)
				* (y2 - y1));

		System.out.println("Distance between two points :" + distance);
	}

}
