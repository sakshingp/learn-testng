package basic;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groups {
	
	  @Test(groups={"complete"})
	  public void f1() {
		  System.out.println("Test 1");
	  }
	  
	  @Test(groups={"partial"})
	  public void f2() {
		  System.out.println("Test 2");
	  }
}
