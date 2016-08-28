/**
 * Defines a circle object
 */
package shape_stacker_test.shapes;

public class Circle extends Shape {
	
	private double diameter;

	/**
	 * @param radius radius of circle
	 */
	public Circle(double diameter) {
		super(0, 'C');
		setDiameter(diameter);
	}

	/**
	 * Returns radius of the circle (pi * (radius)^2).
	 */
	@Override
	public double getArea() {
		double r = getDiameter()/2;
		return Math.PI * (r * r);
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

}
