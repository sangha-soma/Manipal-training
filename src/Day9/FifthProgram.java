package Day9;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FifthProgram {
  @Test
  public void f() {
	  System.out.println("This is my firstTest");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is my beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is my afterTest");
  }

}
