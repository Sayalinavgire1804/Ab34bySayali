package JavaClass;

public class MetodOverloading3 {
	void name(String a)
	{
		System.out.println("My name is swati");
		
	}
	void name(String a, String b)
	{
		System.out.println("My name is Varsha");
	}
	void name(int a,double b,char c,boolean d)
	{
	System.out.println("My name is Sayali");	
	}

	public static void main(String[] args) {
		
		MetodOverloading3 m3=new MetodOverloading3();
		m3.name(765, -566, 'R', false);
		m3.name("harshal");
		m3.name("Swati", "Sayali");
				
	}

}
