package j5_array;

public class Array {
	public static void main (String args[]){
		int data [] = new int [3];
		System.out.println(data[0]);
		System.out.println(data.length);
		int tmp [] = data;
		tmp[1] = 32;
		System.out.println(data[1]);
		for(int x=0;x<init().length;x++){
			System.out.print(init()[x]+" ");		
		}	
	}
	public static int[] init(){
		int a [] = new int[]{1,2,3};
		return a;
	}
}
