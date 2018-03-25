package j2_method;
public class Method {
	public static void main (String args[]){
		printInfo();
		System.out.println(add(1,2));
	}
	public static void printInfo(){
		System.out.println("Hello,method");
	}
	public static int add(int a,int b){
		return a+b;
	}
}