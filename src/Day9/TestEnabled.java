package Day9;

import org.testng.annotations.Test;

public class TestEnabled {
  @Test(groups="Regression")
  public void firstTest() {
	  System.out.println("This is my first testcase");
  }
  @Test(groups="smoke")
  public void secondTest() {
	  System.out.println("This is my second testcase");
  }
}
