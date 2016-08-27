/**
 * Defines a circle object
 */
package shape_stacker_test.shapes;

public class Circle extends Shape {
	
	private double radius;

	/**
	 * @param radius radius of circle
	 */
	public Circle(double radius) {
		super(0, 'C');
		setRadius(radius);
	}

	/**
	 * Returns radius of the circle (pi * (radius)^2).
	 */
	@Override
	public double getArea() {
		double r = getRadius();
		return Math.PI * (r * r);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
