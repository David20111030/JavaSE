package c_java_IO.Reader_Writer.b_FileReader_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class FileReader_FileWriterDemo {
	
	
	
	/**
	 * �������ǳ����Ĳ�������ʹ�ñ���Ĭ�ϱ��룬���ԣ�����ָ�����롣
	 * ��ת�����������е㳤�����ԣ�Java���ṩ�������๩����ʹ�á�
	 * OutputStreamWriter = FileOutputStream + �����(GBK)
	 * FileWriter = FileOutputStream + �����(GBK)
	 * 
	 * InputStreamReader = FileInputStream + �����(GBK)
	 * FileReader = FileInputStream + �����(GBK)
	 * 
	 * FileReader:������ȡ�ַ��ļ��ı����
	 * 		���췽����
	 * 			FileReader(File file);//�ڸ������ж�ȡ���ݵ� File ������´���һ���� FileReader��
	 * 			FileReader(FileDescriptor fd);�ڸ������ж�ȡ���ݵ� FileDescriptor ������´���һ���� FileReader��
	 * 			FileReader(String fileName);�ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader��	
	 * 
	 * 
	 * FileWriter:
	 * 		���췽��ժҪ 
			FileWriter(File file) 
          		���ݸ����� File ������һ�� FileWriter ���� 
			FileWriter(File file, boolean append) 
          		���ݸ����� File ������һ�� FileWriter ���� 
			FileWriter(FileDescriptor fd) 
          		������ĳ���ļ�������������� FileWriter ���� 
			FileWriter(String fileName) 
          		���ݸ������ļ�������һ�� FileWriter ���� 
			FileWriter(String fileName, boolean append) 
       	  		���ݸ������ļ����Լ�ָʾ�Ƿ񸽼�д�����ݵ� boolean ֵ������ FileWriter 
	 
	 
	 * ���󣺰ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰ��ĿĿ¼�µ�b.txt��
	 * 
	 * ����Դ��
	 * 		a.txt -- ��ȡ���� -- �ַ�ת���� -- InputStreamReader -- FileReader
	 * Ŀ�ĵأ�
	 * 		b.txt -- д������ -- �ַ�ת���� -- OutputStreamWriter -- FileWriter
	 */
	@Test
	public void test1() throws Exception {
		//��װ����Դ
		FileReader fr = new FileReader("fos3.txt");
		
		//��װĿ�ĵ�
		FileWriter fw = new FileWriter("fw.txt");
		
		//һ��һ���ַ�
		/*
		int ch = 0;
		while((ch = fr.read())!=-1){
			fw.write((char)ch);
		}*/
		
		
		//һ��һ���ַ�����
		char[] chs = new char[1024];
		int len = 0;
		while((len = fr.read(chs))!=-1){
			fw.write(chs, 0, len);
		}
		
		
		//�ر���
		fr.close();
		fw.close();
	}
}
