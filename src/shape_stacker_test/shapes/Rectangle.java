/**
 * Defines rectangle object.
 */
package shape_stacker_test.shapes;

public class Rectangle extends Shape {
	
	private double sideA;
	private double sideB;

	/**
	 * @param sideA length of first two opposing sides of the rectangle
	 * @param sideB length of second two opposing sides of the rectangle
	 */
	public Rectangle(double sideA, double sideB) {
		super(4, 'R');
		setSideA(sideA);
		setSideB(sideB);
	}
	
	/**
	 * Alternate constructor to allow shapeId to be passed (for use by extending
	 * classes)
	 * 
	 * @param shapeId shapeId
	 * @param sideA length of first two opposing sides of the rectangle
	 * @param sideB length of second two opposing sides of the rectangle
	 */
	protected Rectangle(double sideA, double sideB, char shapeId) {
		super(4, shapeId);
		setSideA(sideA);
		setSideB(sideB);
	}

	/** 
	 * Returns area (sideA * sideB) as a double.
	 */
	@Override
	public double getArea() {
		return getSideA() * getSideB();
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

}
