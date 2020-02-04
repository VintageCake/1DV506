/**
 * 
 */
package interfaces;

import java.util.Arrays;

/**
 * A simple driver that tests the the Point class.
 * Point implements java.lang.Comparable ==> An array
 * of Points can be sorted using Arrays.sort(). 
 * 
 * @author jonasl
 *
 */
public class PointMain {

	public static void main(String[] args) {
		Point[] points = new Point[5];
		points[0] = new Point(3,3);
		points[1] = new Point(3,2);
		points[2] = new Point(5,4);
		points[3] = new Point(1,3);
		points[4] = new Point(1,2);
		
		for (Point p : points)
			System.out.print(p+" ");
		System.out.println("\n");
		
		/* Sort array according to Comparable */
		Arrays.sort(points);   
		for (Point p : points)
			System.out.print(p+" ");
	}
}
