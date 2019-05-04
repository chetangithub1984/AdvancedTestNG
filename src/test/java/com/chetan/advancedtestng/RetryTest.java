package com.chetan.advancedtestng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {

	int counter = 0;
	int retryLimit = 4;
	@Override
	public boolean retry(ITestResult arg0) {
		if(counter<retryLimit){
			counter++;
			return true;
		}
		return false;
	}

}
