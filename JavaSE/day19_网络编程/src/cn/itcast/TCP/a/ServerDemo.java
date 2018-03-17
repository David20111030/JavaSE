package cn.itcast.TCP.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//接收端
/**
 * TCP协议发送数据：
 * 	A：创建接收端的Socket对象
 *  B：监听客户端连接。返回一个对应的Socket对象
 *  C:获取输入流，读取数据显示在控制台
 *  D：释放资源
 * @author 贤元
 *
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端的Socket对象
		//ServerSocket(int port);
		ServerSocket ss = new ServerSocket(9999);
		
		//监听客户端连接。返回一个对应的Socket对象
		//public Socket accept();
		Socket s = ss.accept();//侦听并接收到此套接字的连接。此方法在连接传入之前一直阻塞
		
		//获取输入流，读取数据显示在控制台
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);//阻塞式方法
		String server = new String(bys,0,len);
		//String ip = s.getInetAddress().getHostAddress();
		System.out.println("server"+server);
		
		//获取输出流，将数据发送到发送端，给发送端一个反馈
		OutputStream os =  s.getOutputStream();
		os.write("数据已经收到".getBytes());
		
		
		//释放资源
		s.close();
		//ss.close();//这个不应该关闭，接收端的socket应该一直开启
	}
}
