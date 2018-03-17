package cn.itcast.UDP.b;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//接收端
public class ReceiveThread implements Runnable{
	private DatagramSocket ds;
	
	public ReceiveThread(DatagramSocket ds){
		this.ds = ds;
	}
	
	@Override
	public void run() {
		try {
			while(true){
				// 创建一个包裹
				byte[] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys,bys.length);
				
				//使用创建的包裹接收数据
				ds.receive(dp);
				
				//解析数据 
				InetAddress address = dp.getAddress();//IP获取主机地址对象
				String ip = address.getHostAddress();//ip地址
				String s = new String(dp.getData(),0,dp.getLength());
				
				System.out.println("from " + ip + " data is : " + s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
