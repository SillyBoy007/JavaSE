package j42_file;

import java.io.File;

public class TypeC {
    public static void main(String [] args){
        File myfile = new File("D:"+File.separator+"browser"); //
        print(myfile);
    }

    /**
     *  列出文件或目录下的所有文件
     * @param file 要列出的目录/文件
     */
    public static void print(File file){
        if (file.isDirectory()){
            File result[] = file.listFiles();//列出子目录
            if (result != null){ //如果目录不为空(隐藏目录)
                for (int x=0;x<result.length;x++){
                    print(result[x]);
                }
            }

        }else {
            System.out.println(file);
        }

    }
}
