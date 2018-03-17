package cn.itcast.UDP.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//发送端
/**
 * 步骤：
 * 	封装键盘录入数据
 *  创建数据并打包
 *  发送打包的数据(通过发送端的socket发送)
 * @author 贤元
 *
 */
public class SendThread implements Runnable{
	private DatagramSocket ds;
	
	public SendThread(DatagramSocket ds){
		this.ds = ds;
	}
	
	@Override
	public void run() {
		try {
			//封装键盘录入数据
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String line = null;
			while((line = br.readLine()) !=null){
				if("886".equals(line)){
					break;
				}
				
				//创建数据并打包
				byte[] bys = line.getBytes();
				DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("lixian"),12306);
				
				//发送数据
				ds.send(dp);
			}
			
			//释放资源
			ds.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
