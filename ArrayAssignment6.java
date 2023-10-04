package Arrays;

public class Assignment7 {

	public static void main(String[] args) {

		String[] City=new String[4];
		City[0]="Mumbai";
		City[1]="Pune";
		City[2]="Nagpur";
		City[3]="Delhi";
		
		String [] visitor=new String[4];
		visitor[0]="true";
		visitor[1]="true";
		visitor[2]="false";
		visitor[3]="false";
		String[] message=new String[4];
		message[0]="You have been there";
		message[1]="You have been there";
		message[2]="You will visit soon";
		message[3]="You will visit soon";
		for(int i=0;i<4;i++)
		{
			System.out.print(City[i].concat("|")+visitor[i].concat("|")+message[i]);
			
			System.out.println();
		}
		
	}

}
