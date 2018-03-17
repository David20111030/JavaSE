package c_java_IO.InputStream_OutpuStream.b_BufferedInputStream_高效字节流带缓冲区的;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import org.junit.Test;

public class BufferedInputStreamDemo {
	/*
	 * 注意：虽然我们有两种方式可以读取，但是，请注意，这两种方式针对同一个对象在一个代码中只能使用一个。
	 */
	@Test
	public void test1() throws Exception {
		// BufferedInputStream(InputStream in);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bos.txt"));
		
		//读取数据 用法和FileInputStream中的一样
		//bis.read();//读取一个字节
		//bis.read(byte[] b);//读取一个字节数组
		//bis.read(byte[] b, int index, int len);
		
		//一次读取一个字节 这种方式遇到有中文的时候会出现中文乱码？号
		/*int by = 0;
		while((by = bis.read()) != -1){
			System.out.print((char)by+" ");//h e l l o J a v a ? ? ? ì ? ? ? ? ? ? ? ? ? ? 
		}*/
		
		//一次读取一个字节数组  这种方式即使有中文，也能正常读取，不会出现中文乱码
		//推荐这种方式读取
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = bis.read(bys)) != -1){
			System.out.println(new String(bys,0,len));
		}
	}
}
