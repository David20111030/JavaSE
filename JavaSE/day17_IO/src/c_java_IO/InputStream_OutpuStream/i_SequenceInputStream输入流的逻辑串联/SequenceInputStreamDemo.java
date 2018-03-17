package c_java_IO.InputStream_OutpuStream.i_SequenceInputStream输入流的逻辑串联;

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
	 * 			表示其他输入流的逻辑串联。它从输入流的有序集合开始，并从第一个输入流开始读取，
	 * 			直到到达文件末尾，接着从第二个输入流读取，依次类推，直到到达包含的最后一个输入流的文件末尾为止。 
	 * 
	 * 构造方法摘要 
			SequenceInputStream(Enumeration<? extends InputStream> e) 
          			通过记住参数来初始化新创建的 SequenceInputStream，
          				该参数必须是生成运行时类型为 InputStream 对象的 Enumeration 型参数。 
			SequenceInputStream(InputStream s1, InputStream s2) 
          			通过记住这两个参数来初始化新创建的 SequenceInputStream（将按顺序读取这两个参数，先读取 s1，然后读取 s2），
          			以提供从此 SequenceInputStream 读取的字节。 

	 * 
	 * 
	 * @throws Exception
	 *
	 * 以前的操作：
	 * a.txt -- b.txt
	 * c.txt -- d.txt
	 * 
	 * 现在想要：
	 * a.txt+b.txt -- c.txt
	 */
	@Test
	public void test1() throws Exception {
		// SequenceInputStream(InputStream s1, InputStream s2)
		// 求：把e3.txt和fos3.txt的内容复制到Copye3fos3.txt中
		//封装数据源
		InputStream s1 = new FileInputStream("e3.txt");
		InputStream s2 = new FileInputStream("fos3.txt");
		SequenceInputStream sis = new SequenceInputStream(s1, s2);
		
		//封装目的地
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copye3fos3.txt"));

		// 如何写读写呢，其实很简单，你就按照以前怎么读写，现在还是怎么读写
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();
	}
	
	/**
	 * 以前的操作：
	 * a.txt -- b.txt
	 * c.txt -- d.txt
	 * e.txt -- f.txt
	 * 
	 * 现在想要：
	 * a.txt+b.txt+c.txt -- d.txt
	 */
	@Test
	public void test2() throws Exception{
		// 需求：把下面的三个文件的内容复制到Copy3.java中
		// e3.txt,fos4.txt,copye3fos3.txt
		
		// SequenceInputStream(Enumeration e)
		// 通过简单的回顾我们知道了Enumeration是Vector中的一个方法的返回值类型。
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

		// 如何写读写呢，其实很简单，你就按照以前怎么读写，现在还是怎么读写
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = sis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		sis.close();
		
	}
}
