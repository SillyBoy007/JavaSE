package j5_array;

public class ArrayReserve {
	public static void main(String args[]){
		int arr [] = new int[]{1,2,3,4,5,6};
		int temp [] = new int[arr.length];
		int foot = arr.length - 1;
		for(int x=0;x<arr.length;x++){
			temp[x] = arr[foot];
			foot --;		
		}
		arr = temp;
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]+" ");
		}
		
	}
}
