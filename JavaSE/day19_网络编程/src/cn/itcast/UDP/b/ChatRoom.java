package cn.itcast.UDP.b;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * ͨ�����̸߳Ľ��ղŵ�������������ҾͿ���ʵ����һ�����ڷ��ͺͽ���������
 * @author ��Ԫ
 *
 */
public class ChatRoom {
	public static void main(String[] args) throws SocketException {
		//���Ͷ˵�Socket
		DatagramSocket dsSend = new DatagramSocket();
		//���ն˵�Socket
		DatagramSocket dsReceive = new DatagramSocket(12306);
		
		//������Դ
		SendThread st = new SendThread(dsSend);
		ReceiveThread rt = new ReceiveThread(dsReceive);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		
		t1.start();
		t2.start();
		
	}
}
