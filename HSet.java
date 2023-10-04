package collection;

import java.util.HashSet;

public class HSet {

	public static void main(String[] args) {

		HashSet a1=new HashSet();
		a1.add("Ram");
		a1.add("Sita");
		a1.add("Ajay");
		a1.add("Viraj");
		a1.add("Maya");
		a1.add("Viraj");
		a1.add("Viraj");
		a1.add(55);
		a1.add(5.9);
		a1.add('M');
		a1.add(null);
		a1.add("Ram1");
		a1.add("Sita1");
		a1.add("Ajay1");
		a1.add("Viraj1");
		a1.add("Maya1");
		a1.add("Ram2");
		a1.add("Sita2");
		a1.add("Ajay2");
		a1.add("Viraj2");
		a1.add("Maya2");
		a1.add("Ram3");
		a1.add("Sita3");
		a1.add("Ajay3");
		a1.add("Viraj3");
		a1.add("Maya3");
		a1.add("Ram4");
		a1.add("Sita4");
		a1.add("Ajay4");
		a1.add("Viraj4");
		a1.add("Maya4");
		System.out.println(a1);
		HashSet a2=new HashSet();

		a2.add(51);
		a2.add(675);
		a2.add(76);
		a2.add(45);
		a2.add(45);
		a2.add(45);
		a2.add(45);
		//Collections.sort(a2);
		System.out.println(a2);

	}

}
