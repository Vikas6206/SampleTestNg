package home.TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class HomeTest {
  @Test
  public void f() {
	  System.out.println("Inside the f()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside beforeTest() HomeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside afterTest() HomeTest");
  }

}
