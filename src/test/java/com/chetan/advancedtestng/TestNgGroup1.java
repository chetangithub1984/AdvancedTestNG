package com.chetan.advancedtestng;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNgGroup1 {
	
	int i = 0;
	
	@Test(groups= {"sanity"})
	
	public void mtd1() {
		
		System.out.println("I am belongs to group - Sanity");
		System.out.println("User Name is - " + System.getProperty("userName"));
	}
	
@Test(groups= {"sanity", "functional"})
	
	public void mtd2() {
		
		System.out.println("I am belongs to group - Sanity & Functional");
	}

@Test(groups= {"regression"},retryAnalyzer=RetryTest.class)

public void mtd3() {

	System.out.println("I am belongs to group - regression");
if ( i > 2){

	i++;
	System.out.println("value of i = " + i);
	//Assert.assertTrue(false);
}

System.out.println("Hey finally Pass");
Assert.assertTrue(true);
}


}
