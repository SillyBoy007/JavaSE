package j7_stringMethod;

public class Byte {

	public static void main(String[] args) {

			String str = "wang";
			byte [] data = str.getBytes();
			for (int x=0;x<data.length;x++){
				data[x] -= 32;
			}
			System.out.println(new String(data));
			System.out.println(new String(data,0,2));
	}

}
