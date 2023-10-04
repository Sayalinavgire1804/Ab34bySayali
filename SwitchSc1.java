package switchcases;

import java.util.Scanner;

public class SwitchSc1 {

	public static void main(String[] args) {
Scanner sc1=new Scanner(System.in);
int a=sc1.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Addition");
			break;
		case 2:
			System.out.println("Subtraction");
			break;
		case 3:
			System.out.println("Multiplication");
			break;
		case 4:
			System.out.println("division");
			break;
			default:
				System.out.println("I am default");
				sc1.close();
		
		}
	}

}
