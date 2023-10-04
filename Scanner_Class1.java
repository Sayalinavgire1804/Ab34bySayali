package JavaClass;

import java.util.Scanner;

public class Scanner_Class1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		//String a=s1.next();
		//int b=s1.nextInt();
		//float c=s1.nextFloat();
		double d=s1.nextDouble();
		//byte e=s1.nextByte();
		/*short f=s1.nextShort();
		long g=s1.nextLong();
		boolean h=s1.nextBoolean();*/
		s1.close();
		System.out.println(d);

	}

}
