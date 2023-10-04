package JavaClass;

public class NonstaticMethod {
	void add()
	{
		int a=500;
		int b=866;
		int c=a+b;
		System.out.println(c);
	}
void subtract()
{
	int a=500;
	int b=866;
	int c=a-b;
	System.out.println(c);
}
void multiplication()
{
	int a=500;
	int b=866;
	int c=a*b;
	System.out.println(c);
}
void divide()
{
	double a=500;
	double b=866;
	double c=b/a;
	System.out.println(c);
}
	public static void main(String[] args) {
		
		NonstaticMethod s=new NonstaticMethod();
		s.add();
		s.subtract();
		s.multiplication();
		s.divide();
	}

}
