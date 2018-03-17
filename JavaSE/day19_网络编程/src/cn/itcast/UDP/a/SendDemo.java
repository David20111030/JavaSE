package cn.itcast.UDP.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDPЭ�鷢�����ݣ�
 * 	A���������Ͷ�Socket����
 *  B���������ݣ��������ݴ��
 *  C������Socket����ķ��ͷ����������ݰ�
 *  D���ͷ���Դ
 * @author ��Ԫ
 *
 */
/**
 * ���������ڼ���¼��
 * 	����¼������Ҫ�Լ�����¼����
 * @author ��Ԫ
 *
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		//�������Ͷ�Socket����
		//DatagramSocket()
		DatagramSocket ds = new DatagramSocket();//�������Ͷ˵�Socket
		
		
		//��װ����¼������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine())!=null){
			if("886".equals(line)){
				break;
			}
			
			//�������ݣ��������ݴ��
			//DatagramPacket(byte[] buf, int length, InetAddress address, int port);
			// �������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ںš�
			//��������
			byte[] bys = line.getBytes();
			//����
			int length = bys.length;
			//IP��ַ����
			InetAddress address = InetAddress.getByName("lixian");
			//�˿�
			int port = 10086;//�˿����Լ�������
			DatagramPacket dp = new DatagramPacket(bys, length, address,port);
			
			//����Socket����ķ����ͷ����������ݰ�
			//public void send(DatagramPacket p);
			ds.send(dp);
			
		}
		
		
		//�ͷ���Դ
		ds.close();
		
	}
}
