package c_java_IO.Reader_Writer.a_InputStreamReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.Test;

public class InputStreamReaderDemo {

	/**
	 * �ַ���������
	 * InputStreamReader(InputStream in);��Ĭ�ϵı����ȡ����
	 * InputStreamReader(InputStream in,String charsetName);��ָ���ı����ȡ����
	 * 
	 *ע�⣺��ȡ��д��ı����ʽҪһ������Ȼ��������ġ�Ĭ�ϱ���ΪGBK����
	 * 
	 * InputStreamReader�ķ�����
	 * 		int read():һ�ζ�ȡһ���ַ�
	 * 		int read(char[] chs):һ�ζ�ȡһ���ַ�����
	 */
	@Test
	public void test1() throws Exception {
		//��������  ��Ĭ�ϱ����ȡ����
		//InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		
		//InputStreamReader(InputStream in,String charsetName);��ָ���ı����ȡ����
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"),"GBK");
		
		//��ȡ����  �������÷����ֽ�����һ����
		//һ�ζ�ȡһ���ַ�
		/*
		int ch = 0;
		while((ch = isr.read())!=-1){
			System.out.println((char)ch);
		}*/
		
		//һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];//�洢���ζ�ȡ���ַ�����
		int len = 0;//���ζ�ȡ���ַ�����
		while((len = isr.read(chs))!=-1){
			System.out.println(new String(chs,0,len));
		}
		
		//�ͷ���Դ
		isr.close();
		
		
	}
}
