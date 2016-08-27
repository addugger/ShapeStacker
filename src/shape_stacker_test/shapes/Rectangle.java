/**
 * Defines an object representing a rectangle.
 */
package shape_stacker_test.shapes;

public class Rectangle extends Shape {
	
	private double sideA;
	private double sideB;

	/**
	 * @param cornerCnt
	 */
	public Rectangle(double sideA, double sideB) {
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
