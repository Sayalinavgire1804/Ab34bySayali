package JavaCalss2;
 class Three extends Two
{
	 void Three1()
	 {
		 System.out.println("Three");
	 }
	
}
 class Two
{
	 void Two1()
	 {
		 System.out.println("Two");
	 }
	
	
}
 class one extends Two
{
	 void one1()
	 {
		 System.out.println("One");
		
	 }
	
}
public class HybridClass extends one
{
	void hyprid()
	{
		System.out.println("hyprid");

	}

	public static void main(String[] args) {
		HybridClass h1=new HybridClass();
		h1.hyprid();
		h1.one1();
		h1.Two1();
		Three t1=new Three();
		t1.Three1();
		t1.Two1();

		
	}

}
