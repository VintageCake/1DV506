package ls223qx_lab3;

public class Point {
	private int pointX = 0; // Data fields
	private int pointY = 0;
	
	public Point() { // Constructors
		
	}
	public Point(int x, int y) {
		pointX = x;
		pointY = y;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(pointX + "," + pointY);
		return str.toString();
	}
	
	public boolean isEqualTo(Point p) {
		if (this.toString().equals(p.toString())){
			return true;
		}
		
		return false;
	}
	
	public double distanceTo(Point p) {
		double x12 = Math.pow((double)pointX - p.getX(), 2);
		double y12 = Math.pow((double)pointY - p.getY(), 2);
		return Math.sqrt(x12+y12);
	}
	public void move(int x, int y) {
		pointX += x;
		pointY += y;
	}
	public void moveToXY(int x, int y) {
		pointX = x;
		pointY = y;
	}
	
	public int getX() {
		return pointX;
	}
	public int getY() {
		return pointY;
	}
	

}
