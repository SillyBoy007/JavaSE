package j7_stringMethod;

public class Equals {

	public static void main(String[] args) {

		String a = "hello";
		String b = "Hello";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(b.compareTo(a));
	}

}
