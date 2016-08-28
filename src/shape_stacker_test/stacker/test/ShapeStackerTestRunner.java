/**
 * Just a simple class to run the ShapeStackerTest tests. This class
 * contians the only main method in the entire ShapeStacker test project.
 */
package shape_stacker_test.stacker.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ShapeStackerTestRunner {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ShapeStackerTest.class);
		// Print out failures
		for (Failure failure : result.getFailures()) {
			System.out.println("Failure: " + failure.toString());
		}
		// Print out whether the tests all succeeded
		System.out.println("All tests succeeded: " + result.wasSuccessful());
	}
} 