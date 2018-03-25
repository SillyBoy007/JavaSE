package j5_array;

public class ArrayCopy {
	public static void main(String args[]){
		int arrA [] = new int[]{1,2,3,4,5,6,7,8};
		int arrB [] = new int[]{11,22,33,44,55,66,77,88};
		int data [] = new int[]{2,1,0,3,5,7,6,4};
		System.arraycopy(arrA,4,arrB,2,3);
		print(arrB);
		java.util.Arrays.sort(data);
		print(data);
		
	}
	public static void print(int tmp[]){
		for(int x=0;x<tmp.length;x++){
			System.out.print(tmp[x]+" ");
		}
		System.out.println();
	}
}
