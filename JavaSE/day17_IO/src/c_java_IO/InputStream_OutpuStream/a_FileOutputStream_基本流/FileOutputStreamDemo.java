package c_java_IO.InputStream_OutpuStream.a_FileOutputStream_������;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class FileOutputStreamDemo {
	
	
	/**
	 * IO���ķ��ࣺ
	 * 		����:
	 * 			������  ��ȡ����
	 * 			�����  д������
	 * 		��������:
	 *			�ֽ�����
	 *				�ֽ�������  ��ȡ����  InputStream
	 *				�ֽ������	 д������  OutputStream
	 *			�ַ����� 	
	 * 				�ַ�������  ��ȡ����  Reader
	 * 				�ַ������	 д������  Writer
	 * 
	 * ע�⣺һ��������̽��IO����ʱ�����û����ȷ˵�������ַ�����˵��Ĭ��������ǰ��������������ֵġ�
	 * 
	 * ע�⣺ÿ�ֻ�������඼���Ը�������Ϊ��׺����
	 * 		XxxOutputStream
	 * 		XxxInputStream
	 * 		XxxReader
	 * 		XxxWriter
	 * �鿴FileOutputStream�Ĺ��췽����
	 * 		FileOutputStream(File file) 
	 *		FileOutputStream(String name)
	 *
	 * �ֽ�������������裺
	 * 		A:�����ֽ����������
	 * 		B:����write()����
	 * 		C:�ͷ���Դ
	 * 	
	 * �ֽ��������Write()����
	 * 	public void write(int b):дһ���ֽ�.ʵ����b���Ǵ�����Ҫ������ַ���ASCII��ֵ
	 * 	public void write(byte[] b):дһ���ֽ�����
	 * 	public void write(byte[] b,int off,int len):дһ���ֽ������һ����
	 */
	@Test
	public void test1() throws Exception {
		//������Ҫ��һ���ı��ļ�������һ�仰��"hello,io"
		//�����ֽ����������
		//File file = new File("fox.txt");
		//FileOutputStream fos = new FileOutputStream(file);
		//�������д���ȼ���������һ�д���
		FileOutputStream fos = new FileOutputStream("fox.txt");
		/**
		 * �����ֽ�������������˼��������أ�
		 * 		1������ϵͳ����ȥ�����ļ�
		 * 		2������fos����
		 * 		3����fos����ָ������ļ�
		 */
		
		//д����
		//public void write(byte[] bys);
		//public void write(int i);<=>�������Ҳ�͵ȼ��� public void write(char c);
		//public void write(byte[] bys,int index,int len);//index��ʾ�Ӹ��ֽ�������Ǹ�λ�ÿ�ʼ��len��ʾҪд����ֽڸ���
		fos.write("hello,io".getBytes());
		fos.write("java".getBytes(),1,2);
		fos.write(97);//97 -- �ײ����������	-- ͨ�����±��� -- ��97��Ӧ���ַ�ֵ -- a
		fos.write('a');
		/**
		 * fos.txt �е�д�������Ϊ  hello,ioavaa
		 */
		
		//�ͷ���Դ
		//�رմ��ļ���������ͷ�������йص�����ϵͳ��Դ��
		fos.close();
		/**
		 * Ϊʲôһ��Ҫclose�ͷ���Դ�أ�
		 * 	1�����������������������Ϳ��Ա����������������ˡ�
		 *  2��֪ͨϵͳȥ�ͷŸ����ļ���ص���Դ��
		 */
		//java.io.IOException: Stream Closed
		//fos.write("java".getBytes());//ע�⣺һ���ͷ���Դ���Ͳ��ܶԸ��ֽ������������в�����
		
	}
	
	
	/**
	 * ���ʵ�����ݵĻ����أ�
	 * 		д�뻻�з��ϼ��ɡ�
	 * 
	 *  ��Ϊ��ͬ��ϵͳ��Բ�ͬ�Ļ��з���ʶ���ǲ�һ����?
	 * 		windows:\r\n
	 * 		linux:\n
	 * 		Mac:\r
	 * 		��һЩ�����ĸ��߼����±����ǿ���ʶ�����⻻�з��ŵġ� 	
	 * 
	 * ���ʵ�����ݵ�׷��д�룿
	 * 		�ù��췽�����ڶ���������true���������
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		//�����ֽ����������  ����Ҫʵ�����ݵ�׷��д��(�ø��㷽�����ڶ���������true���������)
		/**
		 *  ����һ�������ָ�� ���� ���ļ���д�����ݵ�����ļ���������ڶ�������Ϊ true�����ֽ�д���ļ�ĩβ����������д���ļ���ʼ����
		 */
		FileOutputStream fos = new FileOutputStream("fos3.txt",true);
		
		//д���� ����Ҫ����
		for(int x = 0;x<10;x++){
			fos.write(("hello"+x).getBytes());
			fos.write("\r\n".getBytes());
		}
		//�ͷ���Դ
		fos.close();
		/**fos.txt �ļ��е�������������
		 * hello0
			hello1
			hello2
			hello3
			hello4
			hello5
			hello6
			hello7
			hello8
			hello9
		 */
	}
	
	/**
	 * �����쳣������ֽ����������
	 * @throws Exception
	 */
	@Test
	public void test_Exception() throws Exception {
		// Ϊ����finally�����ܹ������ö���ͱ��붨�嵽���棬Ϊ�˷��ʲ������⣬���������ʼ��ֵ
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("fos4.txt");
			fos.write("javaee+j2ee".getBytes(), 0, 5);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//���fos����null������Ҫclose()
			if(fos!=null){
				//Ϊ�˱�֤close()һ����ִ�У��ͷŵ�����
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
