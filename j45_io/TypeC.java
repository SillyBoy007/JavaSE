package j45_io;

import java.io.*;

//文件合并读取
public class TypeC {
    public static void main(String [] args) throws IOException {
        File fileA = new File("D:"+File.separator+"demo"+File.separator+"a.txt");
        File fileB = new File("D:"+File.separator+"demo"+File.separator+"b.txt");

        InputStream inputA = new FileInputStream(fileA);
        InputStream inputB = new FileInputStream(fileB);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp = inputA.read()) != -1){
            output.write(temp);
        }
        while ((temp = inputB.read()) != -1){
            output.write(temp);
        }

        byte data[] = output.toByteArray();
        output.close();
        inputA.close();
        inputB.close();

        System.out.println(new String(data));
    }
}
