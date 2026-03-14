package extent_reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_reporter_class implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReporter reporter;
	public ExtentTest  test;

	default void onTestStart(ITestResult result) {
		// not implemented
		
	}

	/**
	 * Invoked each time a test succeeds.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 * @see ITestResult#SUCCESS
	 */
	default void onTestSuccess(ITestResult result) {
		// not implemented
	}

	/**
	 * Invoked each time a test fails.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 * @see ITestResult#FAILURE
	 */
	default void onTestFailure(ITestResult result) {
		// not implemented
	}

	
	default void onTestSkipped(ITestResult result) {
		// not implemented
	}

	
	default void onStart(ITestContext context) {
		// not implemented
		
		
	}

	/**
	 * Invoked after all the test methods belonging to the classes inside the
	 * &lt;test&gt; tag have run and all their Configuration methods have been
	 * called.
	 *
	 * @param context The test context
	 */
	default void onFinish(ITestContext context) {
		// not implemented
	}

}
