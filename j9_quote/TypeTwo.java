package j9_quote;

public class TypeTwo {

	public static void main(String[] args) {
		String msg = "hello";
		fun(msg);
		System.out.println(msg);
	}
	public static void fun(String temp){
		temp = "world";
	}
}
