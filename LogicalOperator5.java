package JavaClass;

public class LogicalOperator5 {

	public static void main(String[] args) {

		int a=30;
		int b=40;
		if(a<b && b!=30)
		{
			System.out.println("1");
		}
		if(a==30 || b>=40)
		{
			System.out.println("2");
			
		}
		if(!(a<20 && b<=50))
		{
			System.out.println("3");
			
		}
		if(!(a>b || b==30))
		{
			System.out.println("4");
		}
	}

}
