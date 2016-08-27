/**
 * Shape is the base class for all other shapes to be used by ShapeStacker.
 */
package shape_stacker_test;

/**
 * @author Aaron Dugger
 * 
 *
 */
public abstract class Shape {
	/**
	 * Number of corners the shape has. This will be used to help determine
	 * which shapes are "larger" than others when they have equal area.
	 */
	private int cornerCnt;
	
	/**
	 * The only value all the shapes will definitely have is cornerCnt, so
	 * that is set via Shape's constructor.	
	 */
	public Shape(int cornerCnt) {
		this.setCornerCnt(cornerCnt);
	}
	
	/**
	 * Each shape class must implement the getArea() method.
	 */
	abstract double getArea();

	/**
	 * @return the cornerCnt
	 */
	public int getCornerCnt() {
		return cornerCnt;
	}

	/**
	 * @param cornerCnt the cornerCnt to set
	 */
	public void setCornerCnt(int cornerCnt) {
		this.cornerCnt = cornerCnt;
	}
}
