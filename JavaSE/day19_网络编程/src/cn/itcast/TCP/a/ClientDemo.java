package cn.itcast.TCP.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
//���Ͷ�
/**
 * TCPЭ�鷢�����ݣ�
 * 	A���������Ͷ˵�Socket����
 * 		��һ������ɹ�����˵�������Ѿ������ɹ��ˡ�
 * B����ȡ�������д���ݡ�
 * C���ͷ�����
 * 
 * 
 * ���ӱ��ܾ���TCPЭ��һ��Ҫ�ȿ���������
 * @author ��Ԫ
 *
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//�������Ͷ˵�Socket����
		//Socket(InetAddress address,int port);
		//Socket(String host,int port);
		//����ip��ַ����
		InetAddress address = InetAddress.getByName("lixian");
		Socket s = new Socket(address,9999);
		
		//��ȡ�������д���ݡ������ݷ��͵����ն�
		// public OuputStream getOutputStream();
		OutputStream os = s.getOutputStream();
		//д����
		os.write("hello,tcp,������".getBytes());
		
		
		//��ȡ���ն˷��͹����ķ���
		//��ȡ������
		InputStream is= s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);//����
		String client = new String(bys,0,len);
		System.out.println("client:"+client);
		
		//�ͷ���Դ
		s.close();
	}
}
