package cn.itcast.UDP.a;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDPЭ��������ݣ�
 * 	A���������ն�Socket����
 *  B:����һ�����ݰ�(��������)
 *  C������Socket����Ľ��շ�����������
 *  D���������ݰ�������ʾ�ڿ���̨
 *  E:�ͷ���Դ
 *  
 * @author ��Ԫ
 *
 */
/*
 * ����������նˣ�
 * 		java.net.BindException: Address already in use: Cannot bind
 * 		�˿ڱ�ռ�á�
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		//�������ն�Socket����
		//DatagramSocket(int port);
		DatagramSocket ds = new DatagramSocket(10086);
		
		//����һ�����ݰ�(��������)
		//DatagramPacket(byte[] bys,int length);
		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket dp = new DatagramPacket(bys,length);
		
		//����Socket����Ľ��շ�����������
		//public void receive(DatagramPacket p);
		ds.receive(dp);//����ʽ
		
		//�������ݰ�������ʾ�ڿ���̨
		//��ȡ�Է���ip
		//public InetAddress getAddress()
		InetAddress address = dp.getAddress();//ip��ַ����
		String ip = address.getHostAddress();//��ȡip��ַ
		//public byte[] getData();//��ȡ���ݻ�����
		//public int getLength();��ȡ���ݵ�ʵ�ʳ���
		byte[] bys2 = dp.getData();
		int len = dp.getLength();
		String s = new String(bys2,0,len);
		System.out.println(ip + "���ݵ�������:" + s);

		
		// �ͷ���Դ
		// ���ն�Ӧ��һֱ���ŵȴ��������ݣ��ǲ���Ҫ�ر�
		// ds.close();
	}
}
