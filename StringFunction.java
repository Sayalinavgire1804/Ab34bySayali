package String;

public class StringFunction {

	public static void main(String[] args) {

		String a="Sayali";
		String b="Abhishek";
		String c="Software Testing";
		String d=" India is my country   ";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(b.charAt(5));
		System.out.println(b.indexOf('e'));
		System.out.println(c.substring(2));
		System.out.println(c.substring(3, 8));
		System.out.println(d.trim());
		System.out.println(b.contains(d));
		System.out.println(a.matches(b));
		System.out.println(b.isEmpty());
		System.out.println(a.concat(" ").concat(b));
	}

}
