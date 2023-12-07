package LearnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSenario1 
{

 @Test(priority=1)
  public void first_testcase()
  {
	 
	 System.out.println("This is first test case");
	 
  }
	@Test(priority=2)
 public void second_testcase()
 {
	 
	 System.out.println("This is second test case");
 }
    @Test(priority=3)
	public void third_testcase()
	 {
		 
		 System.out.println("This is Third test case");
	 }
	 @Test(priority=4)
	 public void forth_testcase()
	 {
		 
		 System.out.println("This is forth test case");
	 }
	 @Test
	 public void fifth_testcase()
	 {
		 
		 System.out.println("This is fifth test case");
	 }
	 @Test(priority=-1)
	 public void sixth_testcase()
	 {
		 
		 System.out.println("This is sixth test case");
	 }
	 @Test(priority=-2)
	 public void seventh_testcase()
	 {
		 
		 System.out.println("This is seventh test case");
	 }
	 @Test
	 public void eigth_testcase()
	 {
		 
		 System.out.println("This is eigth test case");
	 }
@Test
	 public void ninth_testcase()
	 {
		 
		 System.out.println("This is ninth test case");
	 }
	 @Test
	 public void tenth_testcase()
	 {
		 
		 System.out.println("This is tenth test case");
	 }

 
}
