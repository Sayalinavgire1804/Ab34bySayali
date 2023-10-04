package TestNGPriority;

import org.testng.annotations.Test;

public class PriorityLogic {
	@Test(priority=-1)
	public void scenario1()
	{
		
	}
	@Test(priority=-100)
	public void scenario2()
	{
		
	}
	@Test(priority=78)
	public void scenario3()
	{
		
	}
	@Test(priority=1)
	public void scenario4()
	{
		
	}
}
