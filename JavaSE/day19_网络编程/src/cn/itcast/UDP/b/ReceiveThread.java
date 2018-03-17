package cn.itcast.UDP.b;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//���ն�
public class ReceiveThread implements Runnable{
	private DatagramSocket ds;
	
	public ReceiveThread(DatagramSocket ds){
		this.ds = ds;
	}
	
	@Override
	public void run() {
		try {
			while(true){
				// ����һ������
				byte[] bys = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bys,bys.length);
				
				//ʹ�ô����İ�����������
				ds.receive(dp);
				
				//�������� 
				InetAddress address = dp.getAddress();//IP��ȡ������ַ����
				String ip = address.getHostAddress();//ip��ַ
				String s = new String(dp.getData(),0,dp.getLength());
				
				System.out.println("from " + ip + " data is : " + s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
