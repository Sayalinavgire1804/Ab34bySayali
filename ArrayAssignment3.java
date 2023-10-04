package Arrays;

public class Assignment3 {
	

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
				
				System.out.print(name[i].concat(" "));
			

			
				
				
			}
			System.out.println();
			for(int j=0;j<3;j++)
			{
				
				System.out.print(age[j].concat("    "));
				

				
				
				
			}
			System.out.println();
			for(int k=0;k<3;k++)
			{
				
				System.out.print(gender[k].concat("     "));
				

				
				
				
			}
			
		}

	}



