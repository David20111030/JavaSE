package cn.itcast.TCP.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
//发送端
/**
 * TCP协议发送数据：
 * 	A：创建发送端的Socket对象
 * 		这一步如果成功，就说明连接已经建立成功了。
 * B：获取输出流，写数据。
 * C：释放连接
 * 
 * 
 * 连接被拒绝。TCP协议一定要先看服务器。
 * @author 贤元
 *
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端的Socket对象
		//Socket(InetAddress address,int port);
		//Socket(String host,int port);
		//创建ip地址对象
		InetAddress address = InetAddress.getByName("lixian");
		Socket s = new Socket(address,9999);
		
		//获取输出流，写数据。把数据发送到接收端
		// public OuputStream getOutputStream();
		OutputStream os = s.getOutputStream();
		//写数据
		os.write("hello,tcp,我来了".getBytes());
		
		
		//获取接收端发送过来的反馈
		//获取输入流
		InputStream is= s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);//阻塞
		String client = new String(bys,0,len);
		System.out.println("client:"+client);
		
		//释放资源
		s.close();
	}
}
