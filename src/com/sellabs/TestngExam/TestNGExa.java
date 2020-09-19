package com.sellabs.TestngExam;

import org.testng.Reporter;

import org.testng.annotations.*;                                                                                                                                                                                                                                                           ;

public class TestNGExa {
	@Test(priority=-1,alwaysRun=true)
	public void login () {
		System.out.println("loginsssss");
	//	throw new ArithmeticException();
		}
	
	@Test(priority=3, dependsOnMethods="login", alwaysRun=true)
	public void homepage () {
		System.out.println("homepage");
		}
	
	
	  // @Parameters({"m1","m2"}) 
	   @Test(priority=2, dependsOnMethods="testE")
	   public void testB () { // System.out.println(m1); //
	  Reporter.log("B", true); // 
	  }
	 	
	@Test
	public void testE () {
		System.out.println("E");
		}
	
	@Test(priority=3)
	public void testD () {
		System.out.println("D");
		}
}


//http://websystique.com/java/testing/testng-suites-example/#:~:text=A%20Suite%20in%20TestNG%20is,tags%20and%20more.