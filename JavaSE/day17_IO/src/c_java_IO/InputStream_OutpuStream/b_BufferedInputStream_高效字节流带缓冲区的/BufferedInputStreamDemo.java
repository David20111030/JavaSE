package c_java_IO.InputStream_OutpuStream.b_BufferedInputStream_��Ч�ֽ�������������;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import org.junit.Test;

public class BufferedInputStreamDemo {
	/*
	 * ע�⣺��Ȼ���������ַ�ʽ���Զ�ȡ�����ǣ���ע�⣬�����ַ�ʽ���ͬһ��������һ��������ֻ��ʹ��һ����
	 */
	@Test
	public void test1() throws Exception {
		// BufferedInputStream(InputStream in);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bos.txt"));
		
		//��ȡ���� �÷���FileInputStream�е�һ��
		//bis.read();//��ȡһ���ֽ�
		//bis.read(byte[] b);//��ȡһ���ֽ�����
		//bis.read(byte[] b, int index, int len);
		
		//һ�ζ�ȡһ���ֽ� ���ַ�ʽ���������ĵ�ʱ�������������룿��
		/*int by = 0;
		while((by = bis.read()) != -1){
			System.out.print((char)by+" ");//h e l l o J a v a ? ? ? �� ? ? ? ? ? ? ? ? ? ? 
		}*/
		
		//һ�ζ�ȡһ���ֽ�����  ���ַ�ʽ��ʹ�����ģ�Ҳ��������ȡ�����������������
		//�Ƽ����ַ�ʽ��ȡ
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read(bys)) != -1){
			System.out.println(new String(bys,0,len));
		}
	}
}
