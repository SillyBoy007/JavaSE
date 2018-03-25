package j5_array;

public class Quote {
	public static void main(String args[]){
		int data [] = new int [] {1,2,3};
		change(data);
		for(int x=0;x<data.length;x++){
			System.out.println(data[x]);
		}
	}
	public static void change(int tmp[]){
		for (int x=0;x<tmp.length;x++){
			tmp[x] *= 2;
		}
	}
}
