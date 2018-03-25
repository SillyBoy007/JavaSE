package j38_than;

import java.util.Arrays;

public class TypeA {
    public static void main(String [] args){
        int data[] = new int[]{2,1,3,5,4,7,6};
        Arrays.sort(data);
        System.out.println(Arrays.binarySearch(data,4)); //二分查找

        int data2[] = new int[]{2,1};
        int data3[] = new int[]{2,1};
        System.out.println(Arrays.equals(data3,data2));//需要顺序一致

        Arrays.fill(data2,4);
        System.out.println(Arrays.toString(data2));

    }
}
