/**
 * IntList.java
 * 22 dec 2014
 */
package interfaces;

import java.util.Iterator;

/**
 * @author jonasl
 *
 */

public interface IntList {
	void add(int n);
	int get(int pos);
	boolean contains(int n);
	int size();
	Iterator<Integer> iterator();
}
