package j6_string;
//����ʵ��������������
public class Difference {

	public static void main(String[] args) {

		String strA = "hello";
		String strB = "hello";
		System.out.println(strA == strB);
		String strC = new String("hello").intern();
		String strD = new String("hello");
		System.out.println(strC == strD);
		System.out.println(strC == strA);
	}
	

}
