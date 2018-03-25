package j48_netdev;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//客户端
public class EchoClient {
    public static void main(String [] args) throws IOException {
        Socket client = new Socket("localhost",9090);
        Scanner input = new Scanner(System.in);//用户输入的数据
        Scanner scan = new Scanner(client.getInputStream());
        scan.useDelimiter("\n");
        input.useDelimiter("\n");
        PrintStream out = new PrintStream(client.getOutputStream());
        boolean flag = true;
        while (flag){
            System.out.print("请输入要发送的数据:");
            if (input.hasNext()){
                String str = input.next().trim();
                out.println(str);//发送服务器数据
                if (str.equalsIgnoreCase("byebye")){
                    flag = false;
                }
                if (scan.hasNext()){
                    System.out.println(scan.next()); //输出回应数据
                }
            }
        }
        input.close();
        scan.close();
        out.close();
        client.close();
    }
}
