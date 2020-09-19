package com.sellabs.TestngExam;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Parameters({"m1","m2"})
	@Test()
	public void testB (int m1,int m2) {
		System.out.println(m1);
		//Reporter.log("B", true);
		}
	
}
