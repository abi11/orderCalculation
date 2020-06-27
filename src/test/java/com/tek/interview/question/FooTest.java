package com.tek.interview.question;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
public class FooTest extends TestCase {

	 public static Test suite() throws Exception
	  {
      TestSuite suite = new TestSuite();
      System.out.println("Executing all tests");
      suite.addTestSuite(FooTest.class);
      return suite;
	  }
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}


//@RunWith(Suite.class)
//@Suite.SuiteClasses({ 
//   TestJunit1.class 
//})
//public class JunitTestSuite {
//}