/**
 * ShapeStacker "stacks" 2D shapes from largest on the bottom to
 * smallest on the top.
 */

package shape_stacker_test.stacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import shape_stacker_test.shapes.Shape;

public class ShapeStacker {
	
	private List<Shape> shapeStack;

	/**
	 * Constructor that takes no arguments and creates an empty shapeList
	 * as an ArrayList<Shape>.
	 */
	public ShapeStacker() {
		this(new ArrayList<Shape>());
	}
	
	/**
	 * Constructor that accepts a list of shapes to set to shapeList.
	 * 
	 * @param shapes list of Shape objects to stack
	 */
	public ShapeStacker(List<Shape> shapes) {
		setShapeStack(shapes);
		stackShapes();
	}
	
	/**
	 * Sorts current shapeList to "stack" them from smallest to largest.
	 */
	private void stackShapes() {
		Collections.sort(getShapeStack());
	}
	
	/**
	 * Add a shape to the shapeStack
	 * 
	 * @param shape shape to add
	 */
	public void addShape(Shape shape) {
		getShapeStack().add(shape);
		stackShapes();
	}
	
	/**
	 * Remove a shape from the shapeStack
	 * 
	 * @param shape shape to remove
	 */
	public void removeShape(Shape shape) {
		getShapeStack().remove(shape);
		stackShapes();
	}
	
	/**
	 * Overrides Object.toString() to output as a string to look like
	 * [Shape1[Shape2[Shape3[...]]]] where Shape1 >= Shape 2 >= Shape3 etc.
	 * Note that Shape's compareTo method states that 2 shapes with
	 * the same area and number of corners are considered equal, so
	 * in these cases the order is determined arbitrarily based on
	 * Collections.sort().
	 */
	public String toString() {
		int shapeCnt = getShapeStack().size();;
		StringBuilder str = new StringBuilder();
		int i = 0;
		for (Shape shape : getShapeStack()) {
			// Prepend shapeId to string
			str.insert(0, shape.getShapeId());
			// If not last (i.e. largest) shape, then add []'s
			if (i != shapeCnt - 1) {
				// Prepend [
				str.insert(0, '[');
				// Append ]
				str.append(']');
			}
		}
		return str.toString();
	}

	public List<Shape> getShapeStack() {
		return shapeStack;
	}

	public void setShapeStack(List<Shape> shapeStack) {
		this.shapeStack = shapeStack;
		stackShapes();
	}

}
