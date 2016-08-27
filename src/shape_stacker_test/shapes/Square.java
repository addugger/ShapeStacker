/**
 * Defines an object representing a square, which is really just a
 * regular rectangle (in the regular polygon sense).
 */
package shape_stacker_test.shapes;

public class Square extends Rectangle {
	
	private double side;

	/**
	 * @param side length of side
	 */
	public Square(double side) {
		super(side, side);
		setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
