package j5_array;

public class BinaryArray {
	public static void main (String args[]){
		int binary [][]= new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		for(int x=0;x<binary.length;x++){
			for(int y=0;y<binary[x].length;y++){
				System.out.print(binary[x][y]+"\t");
			}
			System.out.println();
		}
		
	}
}
