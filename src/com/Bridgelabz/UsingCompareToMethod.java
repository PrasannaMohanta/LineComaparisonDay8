package com.Bridgelabz;
import java.util.Scanner;
/**
 * 
 * @author pmoha
 *
 */

public class UsingCompareToMethod {
	 	static int x1;
	 	static int y1;
	 	static int x2;
	 	static int y2;
	 	static int x3;
	 	static int y3;
	 	static int x4;
	 	static int y4;
	    static int lengthOfline1;
		static int lengthOfline2;
	    public static void Lengthofline1() {
	        /*
	         * line1
	         */
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value of X1: ");
	        x1 = sc.nextInt();
	        System.out.println("Enter the value of Y1: ");
	        y1 = sc.nextInt();
	        System.out.println("Enter the value of X2: ");
	        x2 = sc.nextInt();
	        System.out.println("Enter the value of Y2: ");
	        y2 = sc.nextInt();
	        lengthOfline1 =(int) Math.sqrt((x2 - x1)^ 2 + (y2 - y1)  ^ 2);
	        System.out.println("Length of the line1 is:" + lengthOfline1);
	        
	    }
	        /*
	         * line2
	         */
	    public static void Lengthofline2() {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the value of X3: ");
	         x3 = sc.nextInt();
	        System.out.println("Enter the value of y3: ");
	         y3 = sc.nextInt();
	        System.out.println("Enter the value of X4: ");
	         x4 = sc.nextInt();
	        System.out.println("Enter the value of Y4: ");
	         y4 = sc.nextInt();
	         lengthOfline2 =(int) Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
	        System.out.println("Length of the line2 is: " + lengthOfline2);
	        
	    }
	    public static void Checkequal() {
	        String str1 =Double.toString(lengthOfline1);
	        String str2 =Double.toString(lengthOfline2);
	        if (str1.equals(str2)==true)
	            System.out.println("Both the lines are equal");

	        else if (lengthOfline1 < lengthOfline2) {
	            System.out.println("Line 2 is greater than Line1.");
	        } else {
	            System.out.println("Line1 is greater than Line2.");
	        }
	    }
	    public static void main(String[]args){
	        Lengthofline1();
	    	Lengthofline2();
	    	Checkequal();

	        }
	
}
