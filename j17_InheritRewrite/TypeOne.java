package j17_InheritRewrite;

class Array{
    private int[] data;
    private int index;

    public Array(int len){
        if (len > 0){
            this.data = new int[len];
        }else{
            this.data = new int[1];
        }
    }

    public boolean add(int num){
        if (this.index < this.data.length){
            this.data[index++] = num;
            return true;
        }
        return false;
    }
    public int[] getData(){
        return this.data;
    }
}

class SortArray extends Array{  //定义一个排序数组子类
    //Array没有无参数构造，需调用父类的有参构造
    public SortArray(int len){
        super(len);
    }
    public int[] getData(){
        java.util.Arrays.sort(super.getData());
        return super.getData();
    }
}
class ReserveArray extends Array{
    public ReserveArray(int len){
        super(len);
    }
    public int[] getData(){
        System.out.println("111111111111111111111111");
        int center = super.getData().length/2;
        int head = 0;
        int tail = super.getData().length - 1;
        for (int x=0;x<center;x++){
            int temp = super.getData()[head];
            super.getData()[head] = super.getData()[tail];
            super.getData()[tail] = temp;
            head ++;
            tail --;
        }
        return super.getData();
    }
}

public class TypeOne {
    public static void main(String args[]){
        ReserveArray arr = new ReserveArray(5);
        System.out.println(arr.add(4));
        System.out.println(arr.add(1));
        System.out.println(arr.add(3));
        System.out.println(arr.add(6));
        System.out.println(arr.add(2));
        System.out.println(arr.add(5));

        int temp[] = arr.getData();

        for (int x=0;x<temp.length;x++){
            System.out.println(temp[x]);
        }

    }
}
