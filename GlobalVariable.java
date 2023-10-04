package JavaClass;

public class GlobalVariable {
	static int a=10;//global
	double wt=78.67;
	static int myweight;
	void add() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println(myweight);
		GlobalVariable g1=new GlobalVariable();
		System.out.println(g1.wt);

	}

}
