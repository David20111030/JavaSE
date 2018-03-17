package c_java_IO.Reader_Writer.e_��ӡ��PrintWriter_PrintWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.junit.Test;

public class �ֽڴ�ӡ��_�ַ���ӡ�� {
	
	/**
	 * ��ӡ����
	 * 	  �ֽ�����ӡ����	PrintStream
	 * 	 �ַ���ӡ����PrintWriter
	 * 
	 * ��ӡ�����ص㣺
	 * 		A��ֻ��д���ݵģ�û�ж�ȡ���ݡ�ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ
	 *      B�����Բ����������͵�����
	 *      C:����������Զ�ˢ�£��ܹ��Զ�ˢ��
	 *      	��Щ�������ǿ���ֱ�Ӳ����ı��ļ����أ�
	 *      		FileInputStream
	 *      		FileOutputStream
	 *      		FileReader
	 *      		FileWriter
	 *      		PrintStream
	 *      		PrintWriter
	 * ��API����������Ĺ��췽�������ͬʱ��File���ͺ�String���͵Ĳ�����һ����˵�ǿ���ֱ�Ӳ����ļ��ġ�
	 * 
	 *		����
	 *			�������������ܹ�ֱ�Ӷ�д�ļ���
	 *			�߼������ڻ������������ṩ��һЩ������ ����
	 * 
	 * 
	 * 
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//��ΪWriter������ʹ��
		PrintWriter pw = new PrintWriter("pw.txt");
		
		pw.write("hello");
		pw.write("world");
		pw.write("j2ee");
		
		pw.close();
		
	}
	
	
	/**
	 * 1�����Բ����������͵�����
	 * 		print();
	 * 		println();
	 * 2�������Զ�ˢ��
	 * 		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"),true);
	 * 		����Ӧ�õ���pringln()�ķ����ſ���
	 * 		���ʱ�򲻽����Զ�ˢ���ˣ���ʵ�������ݵĻ���
	 * 		
	 * 		println()��ʵ�ȼ���bw.wirter();bw.newLine();bw.flush();
	 * 		
	 * @throws Exception
	 */
	@Test
	public void testname() throws Exception {
		//������ӡ������
		PrintWriter pw = new PrintWriter(new FileWriter("pw2.txt"));
		
		// write()�Ǹ㲻���ģ���ô����?
		// ���Ǿ�Ӧ�ÿ��������·���
		
		//ʹ��print()��println()����д����ֻ������͵�����
		pw.println("hello");
		pw.println(true);
		pw.println(100);

		pw.close();
	}
	
	/**
	 * һ��������
	 * 
	 * ����DataStreamDemo.java���Ƶ�Copy.java��
	 * ����Դ��
	 * 		DataStreamDemo.java -- ��ȡ���� -- FileReader -- BufferedReader
	 * Ŀ�ĵأ�
	 * 		Copy.java -- д������ -- FileWriter -- BufferedWriter -- PrintWriter
	 */
	@Test
	public void test2() throws Exception {
		//���Ҫʹ�ô�ӡ���ĸĽ�����
		//��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("fw.txt"));
		
		
		//��װĿ�ĵ�
		PrintWriter pw = new PrintWriter(new FileWriter("copy.java"));
		
		//���и���
		String line = null;
		while((line = br.readLine())!=null){
			pw.println(line);
		}
		
		pw.close();
		br.close();
	}
}
