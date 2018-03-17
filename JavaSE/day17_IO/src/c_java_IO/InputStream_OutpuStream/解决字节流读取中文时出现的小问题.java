package c_java_IO.InputStream_OutpuStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import org.junit.Test;

public class ����ֽ�����ȡ����ʱ���ֵ�С���� {
	
	/**
	 * �����ַ�ʽ�Ͳ���������������ˣ�
	 * 
	 *  String(byte[] bytes, String charsetName):ͨ��ָ�����ַ��������ֽ�����
	 *  byte[] getBytes(String charsetName):ʹ��ָ�����ַ����ϰ��ַ�������Ϊ�ֽ�����
	 * 
	 * ����:�ѿ��ö��ı�ɿ�������
	 * String -- byte[]
	 * 
	 * ����:�ѿ������ı�ɿ��ö���
	 * byte[] -- String
	 * 
	 * ��������սƬ(���籨���ӵ籨)
	 * 
	 * ���С����
	 * 		�ַ�	��ֵ
	 * 
	 * Ҫ����һ�����֣�
	 * 		�����������ϵط���
	 * 
	 * 		���Ͷˣ��� -- ��ֵ -- ������ -- ����ȥ
	 * 		���նˣ����� -- ������ -- ʮ���� -- ��ֵ -- �ַ� -- ��
	 * 
	 * 		�����������ϵط���
	 * 
	 *    new String(byte[] bys,int index,int length,String charsetName);
	 *    			charsetName:��ʾ����
	 * 
	 * ��������򵥣�ֻҪ�������ĸ�ʽ��һ�µġ������ַ�ʽ�Ͳ���������������ˣ�
	 */
	@Test
	public void testname() throws Exception {
		//��������Դ
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("ques.txt"));
		//д������
		bos.write("sdfʿ������".getBytes("GBK"));//��ָ��д����ַ���
		//�ر���
		bos.close();
		
		//��������Դ
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("ques.txt"));
		//��ȡ���� ��һ�ζ�ȡһ���ֽ�����ķ�ʽ��ȡ  
		byte[] bys = new byte[1024];
		int len = 0;
		while( (len = bis.read(bys))!=-1){
			System.out.println(new String(bys,0,len,"GBK"));
		}
		//�ر���
		bis.close();
	}
	
	
	@Test
	public void testname1() throws Exception {
		String s = "���";

		// String -- byte[]
		byte[] bys = s.getBytes(); // [-60, -29, -70, -61]
		// byte[] bys = s.getBytes("GBK");// [-60, -29, -70, -61]
		// byte[] bys = s.getBytes("UTF-8");// [-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));

		// byte[] -- String
		String ss = new String(bys); // ���
		// String ss = new String(bys, "GBK"); // ���
		// String ss = new String(bys, "UTF-8"); // ???
		System.out.println(ss);
	}
}
