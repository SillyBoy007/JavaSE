package j36_numoperate;

import java.util.Random;
//36取7
public class TypeB {
    public static void main(String [] args){
        Random rand = new Random();
        int[] arr = new int[7];
        int index = 0;  //数组操作的角标
        while (index < 7){
            int t = rand.nextInt(37); //生成一个不大于37的随机数
            if (!isRepeat(arr,t)){ //不重复
                arr [index++] = t;
            }
        }
        java.util.Arrays.sort(arr);
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]+"、");
        }
    }

    /**
     * 主要判断是否存在重复的内容,但不允许保存0
     * @param temp 已保存的数据
     * @param num   新生成的数据
     * @return  成功返回true,否则false
     */
    public static boolean isRepeat(int[] temp,int num){
        if (num == 0){
            return true;
        }
        for (int x=0;x<temp.length;x++){
            if (temp[x] == num){
                return true;
            }
        }
        return false ;
    }
}
