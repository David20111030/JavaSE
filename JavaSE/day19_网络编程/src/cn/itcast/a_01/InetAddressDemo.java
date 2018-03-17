package cn.itcast.a_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ���һ����û�й��췽����
 * 	A����Աȫ���Ǿ�̬��(Math,Arrays,Collections)
 *  B:�������ģʽ(Runtime)
 *  C:�����о�̬�������ظ���Ķ���(InetAddress)
 *  	class Demo{
 *  		private Demo(){}
 *  		
 *  		private static Demo getXXX(){
 *  			return new Demo();
 *  		}
 *  	}
 *  ��InetAddress�ĳ�Ա������
 *  	public staitc InetAddress getByName(String host);//��������������IP��ַ���ַ�����ʾ�õ�IP��ַ����
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//public static InetAddress getByName(String host);
		//��������������IP��ַ���ַ�����ʾ�õ�IP��ַ����
		//InetAddress address = InetAddress.getByName("192.168.123.233");//������бȽ���
		//��������Ҳһ��
		InetAddress address = InetAddress.getByName("lixian");//������бȽϿ�
		
		//��ȡ������������������IP��ַ
		//public String getHostName();//��ȡ������
		String name = address.getHostName();
		System.out.println("��������"+name);//
		
		String ipAddress = address.getHostAddress();//��������lixian
		System.out.println("IP��ַ��"+ipAddress);//IP��ַ��192.168.123.223
	}
	
}
