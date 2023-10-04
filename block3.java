package JavaClass;

public class block3 {
	{
		System.out.println("1");
	}
	static
	{
		System.out.println("2");
	}
	
	{
		System.out.println("3");
	}
	static
	{
		System.out.println("4");
	}
	public static void main(String[] args) {
		System.out.println("I am main method");
		new block3();

	}

}
