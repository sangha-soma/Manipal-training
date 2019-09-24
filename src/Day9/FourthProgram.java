package Day9;

import org.testng.annotations.Test;

public class FourthProgram {
  @Test(groups="smoke")
  public void firstTest() {
	  System.out.println("This is my firstTestNGcase");
  }
  @Test(groups="Regression")
  public void SecondTest() {
	  System.out.println("This is my secondTestNGcase");
  }
}
