package j22_object;

//Object接收数组
public class Array {
    public static void main(String args[]){
        Object obj = new int[]{1,2,3};
        System.out.println(obj);
        if (obj instanceof int[]){
            int data[] = (int []) obj; //向下转型
            for (int x=0;x<data.length;x++){
                System.out.println(data[x]);
            }
        }
    }
}
