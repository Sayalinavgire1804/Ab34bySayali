package JavaClass;
public class MethodOverloading 
{
	static void add()
	{
		System.out.println("1");
	}
	static void add(int a,int b)
	{
		System.out.println("2");
	}
	static void add(int a,int b,char c)
	{
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		add(86,987,'A');
		add();
		add(86,987);

	}

}
