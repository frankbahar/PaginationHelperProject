import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Frank Bahar Created Date 04/11/2021.
 * Description: This is our test runner class which we run to verify our test class.
 */
public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestJUnit.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
	}
}
