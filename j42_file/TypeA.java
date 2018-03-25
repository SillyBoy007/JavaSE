package j42_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class TypeA {
    public static void main(String[] args) throws IOException {
        File file = new File("D:"+File.separator+"test.txt"); //定义一个文件,File.separator表示分隔符

        System.out.println(file.createNewFile());  //创建一个文件
        System.out.println((double) file.length()/1024/1024);  //取得文件大小,返回字节
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified())); //上次修改时间返回long
        System.out.println(file.getName());//取得文件名
        System.out.println(file.getPath());//取得文件路径

        //创建多级目录
        /*File file1 = new File("D:"+File.separator+"demo"+File.separator+"nihao"+File.separator+"heh"+File.separator+"test.txt");
        if (!file1.getParentFile().exists()){  //如果父级目录存在
            //file1.getParentFile().mkdir(); //创建一级目录
            file1.getParentFile().mkdirs();  //创建多级目录
        }
        if (file1.exists()){  //文件存在
            file1.delete();  //删除文件
        }else {
            System.out.println(file1.createNewFile());  //创建一个文件
        }
*/
    }
}
