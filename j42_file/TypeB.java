package j42_file;

import java.io.File;

//操作目录

public class TypeB {
    public static void main(String [] args){
        File file = new File("D:"+File.separator);
        if (file.isDirectory()){
            File[] result  = file.listFiles(); //取得目录下所有文件对象
            for (int x=0;x<result.length;x++){
                System.out.println(result[x]);
            }
        }
    }
}
