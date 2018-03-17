package c_java_IO.InputStream_OutpuStream.b_BufferedOutput_InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺰�e:\\��������.mp4���Ƶ���ǰ��ĿĿ¼�µ�copy.mp4��
 * 
 * �ֽ������ַ�ʽ�����ļ���
 * �����ֽ���һ�ζ�дһ���ֽڣ�	����ʱ��12721����
 * �����ֽ���һ�ζ�дһ���ֽ����飺 ����ʱ��16����
 * ��Ч�ֽ���һ�ζ�дһ���ֽڣ� ����ʱ��126����
 * ��Ч�ֽ���һ�ζ�дһ���ֽ����飺 ����ʱ��8����
 */
public class BufferedInOutputDemo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		 //method1("����.mp3", "d:\\copy1.mp3");
		// method2("����.mp3", "d:\\copy2.mp3");
		 //method3("����.mp3", "d:\\copy3.mp3");
		method4("����.mp3", "d:\\copy4.mp3");
		long end = System.currentTimeMillis();
		System.out.println("����ʱ��" + (end - start) + "����");
	}

	// ��Ч�ֽ���һ�ζ�дһ���ֽ����飺
	public static void method4(String srcString, String destString)
			throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcString));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(destString));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}

	// ��Ч�ֽ���һ�ζ�дһ���ֽڣ�
	public static void method3(String srcString, String destString)
			throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcString));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(destString));

		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);

		}

		bos.close();
		bis.close();
	}

	// �����ֽ���һ�ζ�дһ���ֽ�����
	public static void method2(String srcString, String destString)
			throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(destString);

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fos.close();
		fis.close();
	}

	// �����ֽ���һ�ζ�дһ���ֽ�
	public static void method1(String srcString, String destString)
			throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(destString);

		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}

		fos.close();
		fis.close();
	}
}
