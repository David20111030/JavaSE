package cn.itcast.TCP.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//���ն�
/**
 * TCPЭ�鷢�����ݣ�
 * 	A���������ն˵�Socket����
 *  B�������ͻ������ӡ�����һ����Ӧ��Socket����
 *  C:��ȡ����������ȡ������ʾ�ڿ���̨
 *  D���ͷ���Դ
 * @author ��Ԫ
 *
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		//�������ն˵�Socket����
		//ServerSocket(int port);
		ServerSocket ss = new ServerSocket(9999);
		
		//�����ͻ������ӡ�����һ����Ӧ��Socket����
		//public Socket accept();
		Socket s = ss.accept();//���������յ����׽��ֵ����ӡ��˷��������Ӵ���֮ǰһֱ����
		
		//��ȡ����������ȡ������ʾ�ڿ���̨
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);//����ʽ����
		String server = new String(bys,0,len);
		//String ip = s.getInetAddress().getHostAddress();
		System.out.println("server"+server);
		
		//��ȡ������������ݷ��͵����Ͷˣ������Ͷ�һ������
		OutputStream os =  s.getOutputStream();
		os.write("�����Ѿ��յ�".getBytes());
		
		
		//�ͷ���Դ
		s.close();
		//ss.close();//�����Ӧ�ùرգ����ն˵�socketӦ��һֱ����
	}
}
