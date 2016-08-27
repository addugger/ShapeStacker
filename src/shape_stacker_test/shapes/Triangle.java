/**
 * Defines a triangle object.
 */
package shape_stacker_test.shapes;

public class Triangle extends Shape {
	
	private double sideA;
	private double sideB;
	private double sideC;

	/**
	 * @param sideA length of sideA
	 * @param sideB length of sideB
	 * @param sideC length of sideC
	 */
	public Triangle(double sideA, double sideB, double sideC) {
		super(3, 'T');
		setSideA(sideA);
		setSideB(sideB);
		setSideC(sideC);
	}
	
	/**
	 * Alternate constructor that allows shapeId to be passed (for use by
	 * extending classes).
	 * 
	 * @param sideA length of sideA
	 * @param sideB length of sideB
	 * @param sideC length of sideC
	 * @param shapeId shapeId of triangle
	 */
	protected Triangle(double sideA, double sideB, double sideC, char shapeId) {
		super(3, shapeId);
		setSideA(sideA);
		setSideB(sideB);
		setSideC(sideC);
	}

	/**
	 * Returns area of the triangle based on the lengths of the sides,
	 * making use of Heron's formula (see description here:
	 * http://www.mathopenref.com/heronsformula.html).
	 */
	@Override
	public double getArea() {
		double halfPerim = getHalfPerimeter();
		double result = halfPerim * (halfPerim - getSideA()) * 
				(halfPerim - getSideB()) * (halfPerim - getSideC());
		return Math.sqrt(result);
	}
	
	/**
	 * Calculates and retuns the half perimeter of the triangle.
	 */
	private double getHalfPerimeter() {
		return (getSideA() + getSideB() + getSideC())/2;
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

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

}
