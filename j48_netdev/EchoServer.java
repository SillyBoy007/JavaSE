package j48_netdev;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class EchoThread implements Runnable{
    private Socket client;
    public EchoThread(Socket client){
        this.client = client;
    }
    @Override
    public void run() {

        Scanner scan = null; //客户端输入数据
        try {
            scan = new Scanner(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintStream out = null; //客户端输出数据
        try {
            out = new PrintStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean flag = true;
        while (flag){
            String str = scan.next(); //客户端发送的内容
            if (str.equalsIgnoreCase("byebye")){ //程序要结束
                out.println("byebye,再见");
                flag = false;
            }else{ //回应输入信息
                out.println("ECHO:"+str);
            }
        }
        scan.close();
        out.close();
        try {
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//Echo服务端
public class EchoServer {
    public static void main(String [] args) throws IOException {
        ServerSocket server = new ServerSocket(9090);
        boolean flag = true;
        while (flag){
            Socket client = server.accept();
            new Thread(new EchoThread(client)).start();
            flag = false;
        }
        server.close();
    }
}
