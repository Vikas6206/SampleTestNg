package home.TestNg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	
	/**
	 * @BeforeTest works on the tag given in the testNg.xml. It will be executed only once.
	 */
	
	 @BeforeTest
	  public void beforeTest() {
		  System.out.println("Inside beforeTest() SampleTest");
	  }
	 
	 @BeforeMethod
	 public void beforeMethod() {
		 System.out.println("Inside beforMethod() Sample Test");
	 }

	@Test
	public void sampleTest() {
		System.out.println("Sample test example");
	}
	
	
	@Test(dependsOnMethods="sampleTest")
	public void sampleTestTwo() {
		System.out.println("Sample test example 2");
	}

}
