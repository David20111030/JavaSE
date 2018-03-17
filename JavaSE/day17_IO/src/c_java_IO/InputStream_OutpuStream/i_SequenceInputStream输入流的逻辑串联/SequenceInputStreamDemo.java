package c_java_IO.InputStream_OutpuStream.i_SequenceInputStream���������߼�����;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

import org.junit.Test;

public class SequenceInputStreamDemo {
	
	/**
	 * SequenceInputStream:
	 * 			��ʾ�������������߼����������������������򼯺Ͽ�ʼ�����ӵ�һ����������ʼ��ȡ��
	 * 			ֱ�������ļ�ĩβ�����Ŵӵڶ�����������ȡ���������ƣ�ֱ��������������һ�����������ļ�ĩβΪֹ�� 
	 * 
	 * ���췽��ժҪ 
			SequenceInputStream(Enumeration<? extends InputStream> e) 
          			ͨ����ס��������ʼ���´����� SequenceInputStream��
          				�ò�����������������ʱ����Ϊ InputStream ����� Enumeration �Ͳ����� 
			SequenceInputStream(InputStream s1, InputStream s2) 
          			ͨ����ס��������������ʼ���´����� SequenceInputStream������˳���ȡ�������������ȶ�ȡ s1��Ȼ���ȡ s2����
          			���ṩ�Ӵ� SequenceInputStream ��ȡ���ֽڡ� 

	 * 
	 * 
	 * @throws Exception
	 *
	 * ��ǰ�Ĳ�����
	 * a.txt -- b.txt
	 * c.txt -- d.txt
	 * 
	 * ������Ҫ��
	 * a.txt+b.txt -- c.txt
	 */
	@Test
	public void test1() throws Exception {
		// SequenceInputStream(InputStream s1, InputStream s2)
		// �󣺰�e3.txt��fos3.txt�����ݸ��Ƶ�Copye3fos3.txt��
		//��װ����Դ
		InputStream s1 = new FileInputStream("e3.txt");
		InputStream s2 = new FileInputStream("fos3.txt");
		SequenceInputStream sis = new SequenceInputStream(s1, s2);
		
		//��װĿ�ĵ�
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copye3fos3.txt"));

		// ���д��д�أ���ʵ�ܼ򵥣���Ͱ�����ǰ��ô��д�����ڻ�����ô��д
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();
	}
	
	/**
	 * ��ǰ�Ĳ�����
	 * a.txt -- b.txt
	 * c.txt -- d.txt
	 * e.txt -- f.txt
	 * 
	 * ������Ҫ��
	 * a.txt+b.txt+c.txt -- d.txt
	 */
	@Test
	public void test2() throws Exception{
		// ���󣺰�����������ļ������ݸ��Ƶ�Copy3.java��
		// e3.txt,fos4.txt,copye3fos3.txt
		
		// SequenceInputStream(Enumeration e)
		// ͨ���򵥵Ļع�����֪����Enumeration��Vector�е�һ�������ķ���ֵ���͡�
		// Enumeration<E> elements()
		Vector<InputStream> v = new Vector<InputStream>();
		InputStream s1 = new FileInputStream("e3.txt");
		InputStream s2 = new FileInputStream("fos4.txt");
		InputStream s3 = new FileInputStream("copye3fos3.txt");
		v.add(s1);
		v.add(s2);
		v.add(s3);
		Enumeration<InputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy3.txt"));

		// ���д��д�أ���ʵ�ܼ򵥣���Ͱ�����ǰ��ô��д�����ڻ�����ô��д
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();
		
	}
}
