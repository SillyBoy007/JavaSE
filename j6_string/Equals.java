package j6_string;

public class Equals {
	public static void main(String args[]){
		String a = "hello";
		String b = "hello";
		String c = b;
		String d = new String("hello");
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==c);
		System.out.println(a==d); //false ַ
		System.out.println(a.equals(d)); //true
		
	}
}
