package shape_stacker_test.stacker.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ShapeStackerTestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(ShapeStackerTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println("Failure: " + failure.toString());
      }
		
      System.out.println("All tests succeeded: " + result.wasSuccessful());
   }
} 