package j7_stringMethod;

public class Replace {

	public static void main(String[] args) {

		String a = "wangncmnd";
		String b = a.replaceAll("n", "-");
		System.out.println(b);
		String c = a.replaceFirst("n", "-");
		System.out.println(c);
				
	}

}
