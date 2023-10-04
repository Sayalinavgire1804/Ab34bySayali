package JavaClass;

public class block4 {
	{
		System.out.println("I am IIB1");
	}
	static void add()
	{
		System.out.println("I am static method");
	}
	static
	{
		System.out.println("I am SIB ");
		
	}
	 

	public static void main(String[] args) {
		add();
		System.out.println("I am main method");
		new block4(888);
		new block4();
		
		block4 b1=new block4();
		b1.subtract();

		
	}
	void subtract()
	{
		System.out.println("I am nonstatic method");
	}
		{
			System.out.println("I am IIB2");
		}
		static
		{
			System.out.println("I am SIB2 ");
			
		}
		block4()
		{
			System.out.println("I am constructor1");
		}
		block4(int a)
		{
			System.out.println("I am constructor2");
		}
		

}
