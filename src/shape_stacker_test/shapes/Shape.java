/**
 * Shape is the base class for all other shapes to be used by ShapeStacker.
 */
package shape_stacker_test.shapes;

public abstract class Shape implements Comparable<Shape> {
	/**
	 * Number of corners the shape has. This will be used to help determine
	 * which shapes are "larger" than others when they have equal area.
	 */
	private final int CORNER_CNT;
	
	/**
	 * char Id representing the type of shape (i.e. S for square). Used
	 * when building a string representation of a list of Shape's.
	 */
	private final char SHAPE_ID;
	
	/**
	 * The only values all the shapes will definitely have is cornerCnt, and
	 * shapeId, so those are set via Shape's constructor.	
	 * 
	 * @param cornerCnt number of corners the shape has
	 * @param shapeId char ID representing type of shape
	 */
	public Shape(int cornerCnt, char shapeId) {
		this.CORNER_CNT = cornerCnt;
		this.SHAPE_ID = shapeId;
	}
	
	/**
	 * Each shape class must implement the getArea() method. The area
	 * returned will be unitless as far as the method is concerned, so
	 * keeping track of units will be up to the caller of getArea().
	 * 
	 * @return the area of the shape
	 */
	public abstract double getArea();
	
	/**
	 * Compares Shape's. Order is based off of first area (greater
	 * area is a greater shape), and then corners (greater cornerCnt is a greater
	 * shape). If the shapes have the same area and the same number of corners,
	 * then they are considered to be equal. If equal, 0 is returned; if this > shape,
	 * non-zero positive value returned; if this < shape, negative value is returned.
	 * 
	 * @param shape shape to compare to
	 */
	@Override
	public int compareTo(Shape shape) {
		int rtn;;
		// If areas aren't equal, area is sufficient for comparison
		rtn = Double.compare(this.getArea(), shape.getArea());
		// If area's are equal, we then compare based on number of corners
		if (rtn == 0) {
			rtn = Integer.compare(this.getCornerCnt(), shape.getCornerCnt());
		}
		return rtn;
	}

	public int getCornerCnt() {
		return CORNER_CNT;
	}

	public char getShapeId() {
		return SHAPE_ID;
	}
}
