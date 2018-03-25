package j5_array;

public class ArraySort {
	public static void main(String args[]){
		int arr [] = new int[] {2,1,9,0,3,4,7,8,6,5};
		sort(arr);	
		print(arr);
	}
	
	public static void print(int tmp[]){
		for(int x=0;x<tmp.length;x++){
			System.out.print(tmp[x]+" ");
		}
		System.out.println();
	}
	public static void sort(int arr[]){
		int data = 0;
		for (int x=0;x<arr.length;x++){
			for(int y=0;y<arr.length-1;y++){
				if(arr[y+1]-arr[y]<0){			
					data = arr[y+1];
					arr[y+1] = arr[y];
					arr[y] = data;			
				}				
			}
		}
	}
}
