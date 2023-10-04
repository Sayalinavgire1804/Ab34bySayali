package JavaCalss2;
class Method1
{
	
	void add()
	{
		System.out.println("I am adding 10 numbers");
	}
}

class Method extends Method1
{
	
	void add()
	{
		System.out.println("I am adding three numbers");
	}
}

public class MethodOverriding extends Method {
	void add()
	{
		System.out.println("I am adding five numbers");

		super.add();
		System.out.println("I am adding six numbers");
		System.out.println("I am adding two numbers");
		
		
	}
	
	
	public static void main(String[] args) {
		MethodOverriding m1=new MethodOverriding();
		m1.add();
				

	}

}
