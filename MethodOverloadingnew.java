package JavaClass;

public class MethodOverloadingnew {
	void add()//nonstatic method nonparametrizze
	{
		System.out.println("hi my name is sayali");
		
	}
void add(int a,int b) //nonstatic method parametrize
{
	System.out.println("hi this is my new program");
	
}
	public static void main(String[] args) {
		
		MethodOverloadingnew m1=new MethodOverloadingnew();//object
		m1.add();
		m1.add(675, 954);
	}

}
