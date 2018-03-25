package j7_stringMethod;

public class InitCap {

	public static void main(String[] args) {

		String a = "wang";
		System.out.println(initCap(a));;
	}
	public static String initCap(String temp){
		String a = temp.substring(0,1);
		String b = temp.substring(1);
		a = a.toUpperCase() + b;
		return a;		
	}

}
