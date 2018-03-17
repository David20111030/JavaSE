package cn.itcast.UDP.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//���Ͷ�
/**
 * ���裺
 * 	��װ����¼������
 *  �������ݲ����
 *  ���ʹ��������(ͨ�����Ͷ˵�socket����)
 * @author ��Ԫ
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
			//��װ����¼������
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String line = null;
			while((line = br.readLine()) !=null){
				if("886".equals(line)){
					break;
				}
				
				//�������ݲ����
				byte[] bys = line.getBytes();
				DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("lixian"),12306);
				
				//��������
				ds.send(dp);
			}
			
			//�ͷ���Դ
			ds.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
