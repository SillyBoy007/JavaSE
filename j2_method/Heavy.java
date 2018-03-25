package j2_method;
public class Heavy {
	public static void main (String args[]) {
		System.out.println(add(3,4));
		System.out.println(add(2,3,4));
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a*b*c;
	}
}