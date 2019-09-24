package Day10;

import org.testng.annotations.Test;

public class Timeout {
  @Test(timeOut=1000)
  public void f() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("hello India");
  }
}
