package TestNGGrouping;


import org.testng.annotations.Test;

public class Grouping_class {
	
	@Test(groups= {"Smoke"})
	 public void sceanrio1()
	{
		System.out.println("1");
		
	}
	@Test(groups= {"Smoke"})
	 public void sceanrio2()
	{
		System.out.println("2");
	}
	@Test(groups= {"Smoke","System"})
	 public void sceanrio3()
	{
		System.out.println("3");

	}
	@Test(groups= {"System","Regression"})
	 public void sceanrio4()
	{
		System.out.println("4");

		
	}
	@Test(groups= {"System","Regression"})
	 public void sceanrio5()
	{
		System.out.println("5");

		
	}

	@Test(groups= {"Component","Regression"})
	 public void sceanrio6()
	{
		System.out.println("6");

		
	}
	@Test(groups= {"Component","Integration"})
	 public void sceanrio7()
	{
		System.out.println("7");

		
	}
	@Test(groups= {"Regression","Integration"})
	 public void sceanrio8()
	{
		System.out.println("8");

		
	}
	@Test(groups= {"Regression","System"})
	 public void sceanrio9()
	{
		System.out.println("9");

		
	}
	@Test(groups= {"Regression","System"})
	 public void sceanrio10()
	{
		System.out.println("10");

		
	}
}
