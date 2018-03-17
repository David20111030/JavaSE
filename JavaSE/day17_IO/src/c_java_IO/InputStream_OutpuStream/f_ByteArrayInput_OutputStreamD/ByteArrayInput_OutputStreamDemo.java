package c_java_IO.InputStream_OutpuStream.f_ByteArrayInput_OutputStreamD;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class ByteArrayInput_OutputStreamDemo {
	
	/**
	 * �ڴ�����������ڴ�����ʱ�洢��Ϣ�ģ�������������ݾʹ��ڴ�����ʧ��
	 * 	�ֽ����飺
	 * 		ByteArrayInputStream
	 * 		ByteArrayOutputStream
	 * 		ע�⣺�ر� ByteArrayOutputStream ��Ч�������еķ����ڹرմ������Կɱ����ã�����������κ� IOException�� 
	 *  �ַ����飺
	 *  	CharArrayReader
	 *  	CharArrayWriter
	 *  �ַ�����
	 *  	StringReader
	 *  	StringWriter
	 *  
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//��������
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		//д����
		for(int x = 0;x<10;x++){
			baos.write(("hello"+x).getBytes("UTF-8"));
		}
		
		//ע�⣺�ر� ByteArrayOutputStream ��Ч�������еķ����ڹرմ������Կɱ����ã�����������κ� IOException�� 
		//baos.close();
		
		baos.write("sadfsdafasdfasdfsadfasdfsd".getBytes("UTF-8"));
		
		byte[] bys = baos.toByteArray();//���ڴ�����ڴ��ж�ȡ��������
		//��������
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);//Ҫָ��һ���ֽ����飬���ڽ��մ��ڴ��ж�ȡ��������
		
		//��ȡ����
		//һ�ζ�ȡһ���ַ�
		int by = 0;//���ڽ��ձ��ζ�ȡ�����ַ���Ӧ��ASCII��ֵ
		while((by = bais.read())!=-1){
			System.out.print((char)by);
			System.out.println("by:"+by);//���ַ���Ӧ��ASCII��ֵ
		}
		
		
		
	}
}
