package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LhSet {

	public static void main(String[] args) {

		LinkedHashSet a1=new LinkedHashSet();
		a1.add("Ram");
		a1.add(51);
		a1.add("Laxman");
		a1.add("Sita");
		a1.add("Abhi");
		a1.add(5.9);
		a1.add('M');
		a1.add(null);
		a1.add("Ram");
		a1.add("Ram");
		a1.add("Ram1");
		a1.add(52);
		a1.add("Laxman1");
		a1.add("Sita1");
		a1.add("Abhi1");
		a1.add(6.0);
		a1.add('A');
		a1.add("Ram2");
		a1.add(53);
		a1.add("Laxman2");
		a1.add("Sita2");
		a1.add("Abhi2");
		a1.add(6.1);
		a1.add('B');
		
		System.out.println(a1);
		LinkedHashSet a2=new LinkedHashSet();

		a2.add(51);
		a2.add(675);
		a2.add(76);
		a2.add(45);
		//Collections.sort(a2);
		System.out.println(a2);
	}

}
