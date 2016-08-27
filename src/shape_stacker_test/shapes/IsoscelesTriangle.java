/**
 * Defines and isosceles triangle object, which is just a Triangle
 * where exactly 2 of the sides have an equal length.
 */
package shape_stacker_test.shapes;

public class IsoscelesTriangle extends Triangle {

	/**
	 * @param base unique side length
	 * @param sides duplicate sides length
	 */
	public IsoscelesTriangle(double base, double sides) {
		super(base, sides, sides, 'I');
	}

}
