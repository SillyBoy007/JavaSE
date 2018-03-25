package j7_stringMethod;

public class Split {

	public static void main(String[] args) {

		String a = "wangsdsadndsn";
		String b [] = a.split("");
		String c [] = a.split("d");
		String d  = "192.168.0.1";
		String e []= d.split("\\.",2);
		print(b);
		print(c);
		print(e);	
	}
	public static void print(String tmp[]){
		for(int x=0;x<tmp.length;x++){
			System.out.print(tmp[x]+" ");
		}
		System.out.println();
	} 
}
