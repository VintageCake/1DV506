/**
 * Point.java
 * Date: 2008-09-24
 * Author: Jonas Lundberg
 * 
 */
package interfaces;

/**
 * A simple point (x,y) implementation that
 * implements java.lang.Comparable.
 *
 */
public class Point implements Comparable<Point> {
	private final int X;
	private final int Y;
	
	public Point(int x, int y) {X = x; Y = y;}
	public int getX() {return X;}
	public int getY() {return Y;}
	public String toString() {return "("+X+","+Y+")"; }
	
	/* Implementerar Comparable. 
	 * return < 0 ==>  this < point. */
	public int compareTo(Point p) {
		if (X == p.X)
			return Y-p.Y;
		else
		    return X-p.X;
	}
}
