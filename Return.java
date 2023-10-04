package switchcases;

public class Return {
	int add(int a,int b)

	{
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	 double multiply(double e,int f)
	{
		double g=e*f;
		System.out.println(g);
        return 89.9;		
	}

	public static void main(String[] args) {
		Return rt=new Return();
		rt.add(896,787);
		rt.multiply(78, 6);

		
	}

}
