package c_java_IO.Reader_Writer.c_BufferedReader_BufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class BufferedReader_BufferedWriterDemo {
	
	/**
	 * ���췽����
	 * BufferedWriter(Writer out);
	 * BufferedReader(Reader in);
	 * 
	 * ���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣
	 * 
	 * �ַ������������ⷽ����
	 * 	BufferedWriter:
	 * 		public void newLine();����ϵͳ���������з�
	 *  BufferedReader:
	 *  	public String readLine();һ�ζ�ȡһ������
	 *  	public void newLine();д��һ���зָ�����Ҳ���ǻ���
	 *  			�����������ݵ��ַ������������κ�����ֹ��������ѵ�����ĩβ���򷵻� null
	 * @throws Exception
	 */
	@Test
	public void testname() throws Exception {
		//read();
		write();
	}
	/**
	 * BufferedReader
	 * 	���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ַ���������еĸ�Ч��ȡ�� 
	 * 	����ָ���������Ĵ�С�����߿�ʹ��Ĭ�ϵĴ�С�����������£�Ĭ��ֵ���㹻���ˡ� 
	 * 
	 * BufferedReader(Reader in)
	 */
	public static void read() throws IOException{
		//�����ַ���������������
		BufferedReader br = new BufferedReader(new FileReader("fw.txt"));
		
		//��ȡ��ʽ1
		//public String readLine();//һ�ζ�ȡһ������
		/*String line = null;//�����洢һ�ζ�ȡ����һ������
		while((line = br.readLine())!=null){
			System.out.println(line);
		}*/
		
		//��ȡ��ʽ2
		//һ�ζ�ȡһ���ַ�
		/*int ch = 0;//�洢��ȡ�����ַ���ASCII����
		while((ch = br.read())!=-1){
			System.out.println((char)ch);
		}*/
		
		//��ȡ��ʽ3
		//һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];//�洢ÿһ�ζ�ȡ�����ַ�����
		int len = 0;//�洢ÿ�ζ�ȡ�����ַ�����
		while((len = br.read(chs))!=-1){
			System.out.println(new String(chs,0,len));
		}
		
		
		//�ͷ���Դ
		br.close();
	}
	/**
	 * void write(char[] chs);д��һ���ַ�����
	 * void write(char[] cbuf, int off, int len) 
          	д���ַ������ĳһ���֡� 
 		void write(int c) 
          	д�뵥���ַ��� 
 		void write(String s, int off, int len) 
          	д���ַ�����ĳһ���֡� 
         void wirte(String s);д��һ���ַ��� 	
	 * @throws Exception
	 */
	/**
	 * �ַ���Ϊ�˸�Ч��д��Ҳ�ṩ�˶�Ӧ���ַ���������
	 * 		BufferedWriter:�ַ����������
	 * 		BufferedReader:�ַ�����������
	 * 
	 * BufferedWriter:�ַ����������
	 * 		���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
	 * 		����ָ���������Ĵ�С�����߽���Ĭ�ϵĴ�С���ڴ��������£�Ĭ��ֵ���㹻���ˡ� 
	 */
	public static void write() throws Exception{
		//�����ַ��������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
		
		//д������
		for(int x = 0; x < 10; x++){
			bw.write("hello����Ԫ"+x);
			bw.newLine();//����
			bw.flush();//ˢ��
		}
		
		
		//�ر���
		bw.close();
		
	}
	
	
	
	
	/**
	 * һ����ϰ
	 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�bw.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�fw.txt��
	 * 
	 */
	@Test
	public void test3() throws Exception {
		// ��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("bw.txt"));
		// ��װĿ�ĵ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("fw.txt"));

		// ��д����
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}

		// �ͷ���Դ
		bw.close();
		br.close();
	}
	
	
}
