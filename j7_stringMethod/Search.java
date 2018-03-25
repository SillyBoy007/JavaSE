package j7_stringMethod;
//�ַ����Ĳ���
public class Search {

	public static void main(String[] args) {

		String a = "wangn";
		boolean b = a.contains("a");
		System.out.println(b);
		int c = a.indexOf("n");
		int e = a.indexOf("n",3);
		System.out.println(c);
		System.out.println(e);
		int d = a.lastIndexOf("n");
		int f = a.lastIndexOf("n",1);
		System.out.println(d);
		System.out.println(f);
		boolean g = a.startsWith("e");
		System.out.println(g);
		boolean h = a.endsWith("n");
		System.out.println(h);
		
		
	}

}
