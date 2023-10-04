package JavaClass;

public class ConditionalStatement7 {

	public static void main(String[] args) {
int a=100;
int b=200;
if(a==100)
{
	System.out.println("1");

	if(a<=100)
	{
		System.out.println("2");
		if(a<b)
		{
			System.out.println("3");
			
			if(a>b)
			{
				System.out.println("4");
				
			}
			else {
				System.out.println("5");
				
			}
		}
		else {
			
			System.out.println("6");
		}
		
	}
	else
	{
		System.out.println("7");
	
	}
	
}
else
{
	System.out.println("8");
	
}
	}

}
