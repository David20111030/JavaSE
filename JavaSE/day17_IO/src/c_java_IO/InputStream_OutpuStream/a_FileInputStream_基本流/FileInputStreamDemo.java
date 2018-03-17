package c_java_IO.InputStream_OutpuStream.a_FileInputStream_������;

import java.io.FileInputStream;

import org.junit.Test;

public class FileInputStreamDemo {

	/**
	 * �ֽ��������������裺
	 * 	1�������ֽ�����������
	 *  2������read()������ȡ���ݣ�����������ʾ�ڿ���̨
	 *  3���ͷ���Դ
	 *  
	 *  ��ȡ���ݵķ�ʽ��
	 *  	A�� int read();һ�ζ�ȡһ���ֽ�  ����ֵ��ʾ���ַ���Ӧ��ASCII��ֵ
	 *      B�� int read(byte[] b);һ�ζ�ȡһ���ֽ����顣�Ӵ��������н���� len ���ֽڵ����ݶ���һ�� byte �����С�
	 *      				����ֵ��ʵ�Ǳ���ʵ�ʶ�ȡ���ֽڸ�����bys��ŵ��Ǳ��ζ�ȡ��������(���ֽڵ���ʽ�洢��)
	 *      C�� int read(byte[] bys,int index,int len);�Ӵ��������н���� len ���ֽڵ����ݶ���һ�� byte �����С�
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("fos4.txt");
		
		//����read()������ȡ���ݣ�����������ʾ�ڿ���̨��
		// int read(); һ�ζ�ȡһ���ַ�
		int by = 0;
		/*while((by = fis.read())!=-1){
			System.out.print((char)by+" ");//j a v a e
			System.out.print(by+" ");//106 97 118 97 101 
		}*/
		
		System.out.println("----------һ�ζ�ȡһ���ֽ�����------------");
		
		// int read(byte[] bys);һ�ζ�ȡһ���ֽ�����. ����ֵ��ʵ�Ǳ���ʵ�ʶ�ȡ���ֽڸ�����bys��ŵ��Ǳ��ζ�ȡ��������(���ֽڵ���ʽ�洢��)
		// ����ĳ���һ����1024����1024��������
		/*byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1){
			System.out.println(new String(bys,0,len));//javae
			System.out.println(bys);//[B@30307ae3 ���ֽ�����bys���ڴ��ַ������洢�ű��ζ�ȡ��������(���ֽ���ʽ�洢��)
			System.out.println(len);//5
		}*/
		
		
		//int read(byte[] bys,int index,int len);�Ӵ��������н���� len ���ֽڵ����ݶ���һ�� byte �����С�
		//Ҳ����������Կ���һ������ȡ�����ֽڵ�����
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys,0,2))!=-1){
			System.out.print(new String(bys,0,len)+" ");//ja va e 
			System.out.println(bys);
			//[B@30307ae3  [B@30307ae3   [B@30307ae3 ���ֽ�����bys���ڴ��ַ������洢�ű��ζ�ȡ��������(���ֽ���ʽ�洢��)
			System.out.println(len);//2 2 1  �ܹ���ȡ������
		}
		
		
		
		
		//�ͷ���Դ
		fis.close();
	}
}
