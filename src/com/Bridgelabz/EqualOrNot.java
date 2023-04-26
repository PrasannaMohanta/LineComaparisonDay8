package com.Bridgelabz;

/**
 * 
 * @author pmoha
 *
 */

public class EqualOrNot {
	/**
	 * 
	 * @param args
	 */

	    public static void main(String[] args) {

	        /*
	         * first line point 1
	         */
	        double x1 = 1;
	        double y1 = 1;

	        /*
	         * first line point 2
	         */
	        double x2 = 5;
	        double y2 = 5;

	        /*
	         * Calculate first line distance between two points
	         */
	        double firstLineDistance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)
	                * (y2 - y1));
	        System.out.println("Distance between two points :" + firstLineDistance);
	        /*
	         * second line point 1
	         */
	        double x3 = 1;
	        double y3 = 1;

	        /*
	         * second line point 2
	         */
	        double x4 = 5;
	        double y4 = 5;

	        /*
	         * Calculate second line distance between two points
	         */
	        double secondLineDistance = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3)
	                * (y4 - y3));

	        System.out.println("Distance between two points :" + secondLineDistance);
	        /*
	         * checking two line are equal or not
	         */
	        if(firstLineDistance==secondLineDistance) {
	            System.out.println("Two lines are equal");
	        }
	        else {
	            System.out.println("Two lines are not equal");
	        }

	    }

	}

