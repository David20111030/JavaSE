package c_java_IO.InputStream_OutpuStream.b_BufferedOutputStream_��Ч�ֽ�������������;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import org.junit.Test;

public class BufferedOutputStreamDemo {
	
	
	/*
	 * ͨ����������ķ�ʽȷʵ����ǰһ�ζ�ȡһ���ֽڵķ�ʽ��ܶ࣬���ԣ�������һ�����������Ƿǳ��õġ�
	 * ��Ȼ�������Ļ�����ô��java��ʼ����Ƶ�ʱ����Ҳ���ǵ���������⣬��ר���ṩ�˴����������ֽ��ࡣ
	 * 	�����౻��Ϊ����������(��Ч��)
	 * 		д���ݣ�BufferedOutputStream
	 * 		�����ݣ�BufferedInputStream
	 * 
	 * ���췽������ָ���������Ĵ�С����������һ���ò��ϣ���ΪĬ�ϻ�������С���㹻�ˡ�
	 * 
	 * Ϊʲô������һ��������ļ������ļ�·�������Ǵ���һ��OutputStream������?
	 * 		ԭ��ܼ򵥣��ֽڻ������������ṩ��������Ϊ��Ч����Ƶġ������أ������Ķ�д�������ÿ�������������ʵ�֡�
	 */
	@Test
	public void test1() throws Exception {
		/**
		 * BufferedOutputStream(OutputStream out,int size);
		 * 	size��ʾ����ָ���������Ĵ�С��һ�����ǲ�ָ���������Ĵ�С�����ṩ��Ĭ�ϵĴ�С�͹�����
		 */
		//BufferedOutputStream(OutputStream out);��ָ��size�Ĵ�Сʹ��Ĭ�ϵĻ�����
		// FileOutputStream fos = new FileOutputStream("bos.txt");
		// BufferedOutputStream bos = new BufferedOutputStream(fos);
		// ��д��
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));
		
		//д����  �÷���FileOutputStream���÷�һ��
		//void wirte(int b);
		//void wirte(byte[] b);
		//void wirte(byte[] b,int index,int len);
		bos.write("helloJava�ҿ�Ų���ȥ��".getBytes());//���ֽ�����ķ�ʽд��
		
		//�ͷ���Դ
		bos.close();
		
		
	}
}
