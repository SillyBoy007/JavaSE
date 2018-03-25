package j7_stringMethod;

public class Char {
	public static void main (String args[]){
		String str = "wang";
		char c = str.charAt(0);
		System.out.println(c);
		char a [] = str.toCharArray();
		print(a);
		for (int x=0;x<a.length;x++){
				a[x] -= 32;
		}
		System.out.println(new String(a));
		System.out.println(new String(a,0,2));
	}
	public static void print(char tmp[]){
		for(int x=0;x<tmp.length;x++){
			System.out.print(tmp[x]+"	");
		}
		System.out.println();
	} 
}
