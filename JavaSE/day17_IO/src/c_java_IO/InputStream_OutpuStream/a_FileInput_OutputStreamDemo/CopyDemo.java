package c_java_IO.InputStream_OutpuStream.a_FileInput_OutputStreamDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import org.junit.Test;

public class CopyDemo {
	
	/**
	 * һ�������������ı��ļ�
	 * 	 ����Դ���������� (������̷�Ĭ�������·�������ļ��ڱ���Ŀ·����)
	 * 		b.txt --��ȡ���� --FileInputStream
	 *  Ŀ�ĵأ�������ȥ
	 * 	 	d:\b.txt	-- д���� -- FileOutputStream
	 * 
	 * java.io.FileNotFoundException: a.txt (ϵͳ�Ҳ���ָ�����ļ���) 
	 * 
	 * 
	 * ��һ�θ�������û�г����κ����⣬Ϊʲô��?
	 * 		��һ�����ǳ��������ԭ����������ÿ�λ�ȡ��һ���ֽ����ݣ��ͰѸ��ֽ�����ת��Ϊ���ַ����ݣ�Ȼ�����������̨��
	 * 		����һ����?ȷʵͨ��IO����ȡ���ݣ�д���ı��ļ������ȡһ���ֽڣ��Ҿ�д��һ���ֽڣ���û�����κε�ת����
	 * 		�����Լ���ת����
	 * 
	 *   �������͵��ļ��ĸ��ƶ������Ƶģ�ֵ�����Ǹĸ��ļ������ѣ���������������
	 *
	 * @throws Exception
	 */
	@Test
	public void testname() throws Exception {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("b.txt");
		
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("d:\\a.txt");//��ʾ׷�ӵ���ʽд������
		
		//�����ı��ļ�
		//ʹ�ö�ȡһ���ֽھ�д��һ���ֽڵķ�ʽ
		//�Ƽ�ʹ�����ַ�ʽ�����ַ�ʽ��ʹ������Ҳ�����������
		int by = 0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		
		
		//�����ı��ļ�
		//ʹ�ö�ȡһ���ֽ������д��һ���ֽ�����ķ�ʽ
		//���Ƽ����ַ�ʽ�����ַ�ʽ�����ĵ�ʱ����������
		/*byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys)) != -1){
			fos.write(bys,0,len);//����д���ʱ��Ҫ����д�룬����д�����������û�иպ�1024���ֽ�
		}*/
		
		
		//�ͷ���Դ
		fis.close();
		fos.close();
	}
	
	
	
	/**
	 * ���󣺰� ����.mp3 ���Ƶ�d����
	 *  ����Դ��
	 *  	����.mp3
	 *  Ŀ�ĵأ�
	 *  	d:\\copy.mp3
	 */
	@Test
	public void test2() throws Exception {
		//��װ����Դ
		FileInputStream fis = new FileInputStream("����.mp3");
		
		//��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("d:\\copy.mp3");
		
		//��ʼ����
		//ʹ�ö�ȡһ���ֽھ�д��һ���ֽڵķ�ʽ���ƣ���Ϊ������ʹ��������Ҳ�����������
		int by = 0;
		while((by = fis.read()) != -1){
			fos.write(by);
		}
		
		//�ͷ���Դ
		fis.close();
		fos.close();
		
	}
	
	
	
	/*
	 * ����������ʶ��ʲôʱ��ð������ֽ�ת��Ϊһ��������?
	 * �ڼ���������ĵĴ洢�������ֽڣ�
	 * 		��һ���ֽڿ϶��Ǹ�����
	 * 		�ڶ����ֽڳ������Ǹ���������������������ûӰ�졣
	 */
	@Test
	public void test_question() throws Exception {
		 String s = "abcde";
		// // [97, 98, 99, 100, 101]

		//String s = "�Ұ����й�";
		// [-50, -46, -80, -82, -60, -29, -42, -48, -71, -6]

		byte[] bys = s.getBytes();
		System.out.println(Arrays.toString(bys));
	}
	
	
}
