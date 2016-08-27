/**
 * Shape is the base class for all other shapes to be used by ShapeStacker.
 */
package shape_stacker_test.shapes;

public abstract class Shape {
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
	 */
	public abstract double getArea();

	public int getCornerCnt() {
		return CORNER_CNT;
	}

	public char getShapeId() {
		return SHAPE_ID;
	}
}
