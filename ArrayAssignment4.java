package Arrays;

public class Assignment4 {

	public static void main(String[] args) {
		String[] name=new String[3];
		name[0]="Ram";
		name[1]="Laxman";
		name[2]="Pooja";
		
		String [] age=new String[3];
		age[0]="51";
		age[1]="43";
		age[2]="21";
		String[] gender=new String[3];
		gender[0]="M";
		gender[1]="M";
		gender[2]="F";
		for(int i=0;i<3;i++)
		{
			System.out.print(name[i].concat(" ")+gender[i].concat("  ")+age[i]);
			System.out.println();
			//System.out.println(gender[i].concat(" "));
			//System.out.print(age[i].concat(" "));
		}
	}

}
