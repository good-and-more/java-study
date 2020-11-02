package com.itheima.demo01.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP通信服务器端：接收客户端的请求，读取客户端发送的数据，给客户端回写数据
 * 表示服务器的类
 *   java.net.ServerSocket
 * 构造方法：
 *   ServerSocket（int port）创建绑定到特定端口的服务器套接字
 * 服务器端必须明确知道是哪个客户端请求的服务器
 * 使用成员方法accept获取请求的客户端对象Socket
 *   Socket accept()侦听并接收到此套接字的连接
 *
 * 实现步骤
 * 1.创建一个服务器对象ServerSocket，构造方法绑定端口号
 * 2.使用accept方法获取请求客户端的Socket对象
 * 3.使用getInputStream方法获取网络字节输出流IntputStream对象
 * 4.使用网络字节输入流IntputStream对象中的方法read，读客户端发送的数据
 * 5.使用getOutputStream方法获取网络字节输出流OutputStream对象
 * 6.使用网络字节输出流OutputStream对象中的方法write，给客户端回写数据
 * 7.释放资源 Socket ServerSocket都要释放
 * */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个服务器对象ServerSocket，构造方法绑定端口号
        ServerSocket server = new ServerSocket(8888);
        //2.使用accept方法获取请求客户端的Socket对象
        Socket socket = server.accept();
        //3.使用getInputStream方法获取网络字节输出流IntputStream对象
        InputStream inputStream = socket.getInputStream();
        //4.使用网络字节输入流IntputStream对象中的方法read，读客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        //5.使用getOutputStream方法获取网络字节输出流OutputStream对象
        OutputStream outputStream = socket.getOutputStream();
        //6.使用网络字节输出流OutputStream对象中的方法write，给客户端回写数据
        outputStream.write("收到谢谢".getBytes());
        //7.释放资源 Socket ServerSocket都要释放
        socket.close();
        server.close();


    }
}
