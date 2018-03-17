package cn.itcast.UDP.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议发送数据：
 * 	A：创建发送端Socket对象
 *  B：创建数据，并把数据打包
 *  C：调用Socket对象的发送方法发送数据包
 *  D：释放资源
 * @author 贤元
 *
 */
/**
 * 数据来自于键盘录入
 * 	键盘录入数据要自己控制录入结果
 * @author 贤元
 *
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端Socket对象
		//DatagramSocket()
		DatagramSocket ds = new DatagramSocket();//创建发送端的Socket
		
		
		//封装键盘录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine())!=null){
			if("886".equals(line)){
				break;
			}
			
			//创建数据，并把数据打包
			//DatagramPacket(byte[] buf, int length, InetAddress address, int port);
			// 构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
			//创建数据
			byte[] bys = line.getBytes();
			//长度
			int length = bys.length;
			//IP地址对象
			InetAddress address = InetAddress.getByName("lixian");
			//端口
			int port = 10086;//端口是自己给定的
			DatagramPacket dp = new DatagramPacket(bys, length, address,port);
			
			//调用Socket对象的法国送方法发送数据包
			//public void send(DatagramPacket p);
			ds.send(dp);
			
		}
		
		
		//释放资源
		ds.close();
		
	}
}
