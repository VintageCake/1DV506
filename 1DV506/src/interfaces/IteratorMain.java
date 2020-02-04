/*
 * IteratorMain.java
 * Date: 10 okt 2008
 * Author: Jonas Lundberg
 */
package interfaces;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * A program showing how Java iterators can
 * be used to traverse a list of points.
 *
 */
public class IteratorMain {

	public static void main(String[] args) {
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(new Point(3,3));
		points.add(new Point(3,2));
		points.add(new Point(5,4));
		points.add(new Point(1,3));
		points.add(new Point(1,2));
		
		Iterator<Point> it = points.iterator();
		while (it.hasNext()) {
			Point p = it.next();
			System.out.println(p);
		}
	}
}
