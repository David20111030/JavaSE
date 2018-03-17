package c_java_IO.Reader_Writer.a_OutputStreamReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

public class OutputStreamWriterDemo {
	
	/**
	 * �ַ�������� 
	 * OutputStreamWriter(OutputStream out):����Ĭ�ϱ�����ֽ���������ת��Ϊ�ַ���
	 * OutputStreamWriter(OutputStream out,String charsetName):����ָ��������ֽ�������ת��Ϊ�ַ��� ���ֽ���ת��Ϊ�ַ�����
	 * 						 �ַ��� = �ֽ��� +�����
	 */
	@Test
	public void testname() throws Exception {
		//��������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"GBK");
		
		//д���� д������ַ�����������ַ���
		osw.write("nisdf����".toCharArray());
		osw.write("�Ҿ����ַ���");
		//�ر���
		osw.close();
		
		
	}
	
	
	/**
	 * OutputStreamWriter�ķ�����
	 * 		public void write(int c):дһ���ַ�
	 * 		public void write(char[] cbuf):дһ���ַ�����
	 * 		public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
	 * 		public void write(String str):дһ���ַ���
	 * 		public void write(String str,int off,int len):дһ���ַ�����һ����
	 * 
	 * �����⣺close()��flush()������?
	 * 		A:close()�ر������󣬵�����ˢ��һ�λ��������ر�֮�������󲻿��Լ�����ʹ���ˡ�
	 * 		B:flush()����ˢ�»�����,ˢ��֮�������󻹿��Լ���ʹ�á�
	 */
	@Test
	public void test2() throws Exception {
		//��������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		
		//д����
		//дһ���ַ�
		osw.write('a');
		osw.write(97);
		
		// public void write(char[] cbuf):дһ���ַ�����
		 char[] chs = {'a','b','c','d','e'};
		 osw.write(chs);

		// public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
	     osw.write(chs,1,3);

		// public void write(String str):дһ���ַ���
		 osw.write("�Ұ�����ϼ");

		// public void write(String str,int off,int len):дһ���ַ�����һ����
		osw.write("�Ұ�����ϼ", 2, 3);		//�ͷ���Դ
		
		//ˢ�»�����
		osw.flush();
		
		//�ͷ���Դ
		osw.close();
		
		// java.io.IOException: Stream closed
		// osw.write("�Ұ�����ϼ", 2, 3);
		
		
		
	}
	
	
	
	
	
	/**
	 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�osw.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�e3.txt��
	 * 
	 * ����Դ��
	 * 		osw.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader
	 * Ŀ�ĵأ�
	 * 		e3.txt -- д������ -- �ַ�ת���� -- OutputStreamWriter
	 */
	@Test
	public void test3() throws Exception {
		//��װ����Դ
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		
		//��װĿ�ĵ�
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e3.txt"));
		
		//�����ļ�
		//��һ�ַ�ʽ��ȡ����ȡһ���ַ������д��һ���ֽ�����
		/*
		char[] chs = new char[1024];
		int len = 0;
		while((len = isr.read(chs))!=-1){
			osw.write(chs, 0, len);
		}*/
		
		//�ڶ��ַ�ʽ����ȡһ���ַ���д��һ���ַ�
		int ch = 0;//�洢��ȡ�����ַ�����Ӧ��ASCII����ֵ
		while((ch = isr.read())!=-1){
			osw.write((char)ch);
		}
		
		//ˢ����
		osw.flush();
		//�ر���
		isr.close();
		osw.close();
		
	}
	
	
	
	
	
	
	
	
	
}
