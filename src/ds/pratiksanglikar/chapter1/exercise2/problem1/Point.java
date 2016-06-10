/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise2.problem1;

/**
 * Class represents a point in the 2D plane.
 *
 * @author Pratik Sanglikar
 */
class Point {

	private final double x; // x coordinate.
	private final double y; // y coordinate.

	/**
	 * initialize the new point using x and y coordinates provided.
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * returns the x coordinate of the point.
	 * 
	 * @return the x coordinate
	 */
	public double getX() {
		return x;
	}

	/**
	 * returns the y coordinate of the point.
	 * 
	 * @return the y coordinate.
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * returns the distance between the point on which the method is called and 
	 * the other point provided as an argument.
	 * 
	 * @param other
	 * @return distance between the point on which the method is called and the other point.
	 */
	public double getDistance(Point other) {
		double x2MinusX1 = getX() - other.getX();
		double y2MinusY1 = getY() - other.getY();
		double distSquare = Math.abs((x2MinusX1 * x2MinusX1) + (y2MinusY1 * y2MinusY1));
		return Math.sqrt(distSquare);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String stringRepresentation = String.format("\nPoint [x=%.3f, y=%.3f]", x, y);
		return stringRepresentation;
	}
}