package j5_array;

public class ArrayReserve2 {
	public static void main(String args[]){
		int arr[] = new int[]{1,2,3,4,5,6,7};
		reserve(arr);
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]+" ");
		}
	}
	public static void reserve(int tmp []){
		int times = tmp.length/2;
		int head = 0;
		int tail = tmp.length-1;
		for(int x=0;x < times;x ++){
			int t = tmp[tail];
			tmp[tail] = tmp[head];
			tmp[head] = t;
			head ++;
			tail --;
		}
	}
}
