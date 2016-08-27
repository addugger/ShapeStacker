/**
 * Defines an object representing a rectangle.
 */
package shape_stacker_test.shapes;

/**
 * @author Aaron Dugger
 *
 */
public class Rectangle extends Shape {
	
	private int sideA;
	private int sideB;

	/**
	 * @param cornerCnt
	 */
	public Rectangle(int sideA, int sideB) {
		super(4);
		setSideA(sideA);
		setSideB(sideB);
	}

	/** 
	 * Returns area (sideA * sideB) as a double.
	 */
	@Override
	double getArea() {
		return getSideA() * getSideB();
	}

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

}
