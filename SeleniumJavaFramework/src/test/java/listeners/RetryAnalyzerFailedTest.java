package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerFailedTest implements IRetryAnalyzer {
	 
	  private int retryCount = 0;
	  
	  //It will retry 3 times whenever there is a failure
	  private static final int maxRetryCount = 3;
	 
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}

