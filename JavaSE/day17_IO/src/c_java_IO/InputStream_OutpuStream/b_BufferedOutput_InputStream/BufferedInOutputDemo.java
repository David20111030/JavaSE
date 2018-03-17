package c_java_IO.InputStream_OutpuStream.b_BufferedOutput_InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：把e:\\哥有老婆.mp4复制到当前项目目录下的copy.mp4中
 * 
 * 字节流四种方式复制文件：
 * 基本字节流一次读写一个字节：	共耗时：12721毫秒
 * 基本字节流一次读写一个字节数组： 共耗时：16毫秒
 * 高效字节流一次读写一个字节： 共耗时：126毫秒
 * 高效字节流一次读写一个字节数组： 共耗时：8毫秒
 */
public class BufferedInOutputDemo {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		 //method1("闹铃.mp3", "d:\\copy1.mp3");
		// method2("闹铃.mp3", "d:\\copy2.mp3");
		 //method3("闹铃.mp3", "d:\\copy3.mp3");
		method4("闹铃.mp3", "d:\\copy4.mp3");
		long end = System.currentTimeMillis();
		System.out.println("共耗时：" + (end - start) + "毫秒");
	}

	// 高效字节流一次读写一个字节数组：
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

	// 高效字节流一次读写一个字节：
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

	// 基本字节流一次读写一个字节数组
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

	// 基本字节流一次读写一个字节
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
