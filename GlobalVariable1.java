package JavaClass;

public class GlobalVariable1 {
	
	static int a=10;
	static int b=100;
void add() {
	
	System.out.println(a);
	
}
	public static void main(String[] args) {
		 a=100;
		 int b=9;
		 System.out.println(b);
		 //int a=10;
		System.out.println(a);
		GlobalVariable1 g1=new GlobalVariable1();
		g1.add();

		
	}

}
