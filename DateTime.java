package String;

import java.util.Date;

public class DateTime {

	public static void main(String[] args) {

		Date d1=new Date();
		d1.getTime();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime()+(1000*60*60*24*1));
		System.out.println(d2);
		String a=d2.toString();
		
		System.out.println(a.length());
		System.out.println(a.substring(0, 3));
		System.out.println(a.substring(4, 7));
		System.out.println(a.substring(9,11));
		System.out.println(a.substring(24));
		String month=a.substring(4, 7);
		System.out.println(month);
		String date=a.substring(9,11);
		System.out.println(date);
		String year=a.substring(24);
		System.out.println(year);
		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));


	}

}
