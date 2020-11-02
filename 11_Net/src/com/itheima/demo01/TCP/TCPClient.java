package com.itheima.demo01.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* TCP通信客户端：向服务器发送请求，给服务器发送数据，读取服务器返回的数据
* 表示客户端的类
*   java.net.Socket
* 构造方法：
*   String host:服务器主机的名称，服务器IP地址
*   int port:端口号
* 成员方法
*   OutputStream getOutputStream() 返回此套接字的输出流
*   InputStream getInputStream() 返回此套接字的输入流
*   void close() 关闭此套接字
*
* 实现步骤
* 1.创建一个客户端对象Socket，构造方法绑定服务器ip地址和端口号
* 2.使用getOutputStream方法获取网络字节输出流OutputStream对象
* 3.使用网络字节输出流OutputStream对象中的方法write，给服务器发送数据
* 4.使用getInputStream方法获取网络字节输出流IntputStream对象
* 5.使用网络字节输入流IntputStream对象中的方法read，读服务器回写的数据
* 6.释放资源，close
*
* 注意：
*   1.客户端和服务器端进行交互，必须使用Socket中提供的网络流，不能使用自己创建的对象流
*   2.当创建客户端对象Socket时，就会去请求服务器，3次握手建立连接通路
*     如果此时服务器没启动就会抛出异常 java.net.ConnectException: Connection refused: connect
*
* */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建一个客户端对象Socket，构造方法绑定服务器ip地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //2.使用getOutputStream方法获取网络字节输出流OutputStream对象
        OutputStream outputStream = socket.getOutputStream();
        //3.使用网络字节输出流OutputStream对象中的方法write，给服务器发送数据
        outputStream.write("你好服务器".getBytes());
        //4.使用getInputStream方法获取网络字节输出流IntputStream对象
        InputStream inputStream = socket.getInputStream();
        //5.使用网络字节输入流IntputStream对象中的方法read，读服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        //6.释放资源，close
        socket.close();
    }
}
