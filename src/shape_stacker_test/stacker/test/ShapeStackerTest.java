/**
 * Class for testing the ShapeStacker class (and within that, the
 * different Shape classes).
 */
package shape_stacker_test.stacker.test;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import shape_stacker_test.shapes.*;
import shape_stacker_test.stacker.ShapeStacker;

public class ShapeStackerTest {
	ShapeStacker stacker = new ShapeStacker();
	
	/** 
	 * Test the given test cases for ShapeStacker.
	 * Note that all T's in the given cases were switched to I's in
	 * the expected results because I ended up implementing a general
	 * Triagnle (T) and then extending that with IsoscelesTriangle (I)
	 * because it seemed like this project was using all isosceles
	 * triangles.
	 */
	@Test
	public void testShapeStacker() {
		// Case 1
		ArrayList<Shape> case1 = new ArrayList<Shape>();
		case1.add(new Square(4));
		case1.add(new Circle(4));
		case1.add(new IsoscelesTriangle(4, 10));
		stacker.setShapeStack(case1);
		assertEquals("I[S[C]]", stacker.toString());
		//System.out.println(stacker.toString());
		
		// Case 2
		ArrayList<Shape> case2 = new ArrayList<Shape>();
		case2.add(new Square(4));
		case2.add(new Circle(6));
		case2.add(new Rectangle(2, 4));
		stacker.setShapeStack(case2);
		assertEquals("C[S[R]]", stacker.toString());
		//System.out.println(stacker.toString());
		
		// Case 3
		ArrayList<Shape> case3 = new ArrayList<Shape>();
		case3.add(new IsoscelesTriangle(4, 10));
		case3.add(new Circle(20));
		stacker.setShapeStack(case3);
		assertEquals("C[I]", stacker.toString());
		//System.out.println(stacker.toString());
		
		// Case 4 The order in this case was left up to the developer,
		// so I decided to make it arbitrary what the order is when both
		// the area and the number of corners of the shapes are equal. So
		// the order is actually determined by Collections.sort(List<Integer>)
		// since first the area is checked and then the corners are checked if
		// the area is equal.  After running this test numerous times, it does
		// seem like the rectangle is always considered "larger" than the sqaure
		// for this specific setup.
		ArrayList<Shape> case4 = new ArrayList<Shape>();
		case4.add(new Square(4));
		case4.add(new Rectangle(4, 4));
		stacker.setShapeStack(case4);
		assertTrue("Unexpected value for stacker.toString(): " + stacker.toString(),
				stacker.toString().equals("R[S]") ||
				stacker.toString().equals("S[R]"));
		//System.out.println(stacker.toString());
		
		// Case 5 I added this test specifically to have a test for a
		// failure, but commented it out so that the actual test runs
		// could succeed.
//		ArrayList<Shape> case5 = new ArrayList<Shape>();
//		case5.add(new Square(4));
//		case5.add(new Circle(4));
//		case5.add(new IsoscelesTriangle(4, 10));
//		stacker.setShapeStack(case5);
//		assertEquals("S[I[C]]", stacker.toString());
		//System.out.println(stacker.toString());
	}

}
