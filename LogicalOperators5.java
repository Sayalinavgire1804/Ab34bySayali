package JavaClass;

public class LogicalOperators5 {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		if(a>b && b==200)
		{
			System.out.println("1");
		}
		if(a>=300 || b<a)
		{
			System.out.println("2");
		}
		if(!(a<=500 && b>a))
		{
			System.out.println("3");
		}
		if(!(a>=100 || b!=200))
		{
			System.out.println("4");
		}

		
	}

}
