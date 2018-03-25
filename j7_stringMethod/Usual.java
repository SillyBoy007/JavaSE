package j7_stringMethod;

public class Usual {

	public static void main(String[] args) {
		//toUppercase/toLowercase/trim/length/intern/isEmpty
		String a = "wang";
		String b = a.concat("a");
		String c = "wanga";
		String d = a+"a";
		System.out.println(b);
		System.out.println(b==c);
		System.out.println(b==d);
	}

}
