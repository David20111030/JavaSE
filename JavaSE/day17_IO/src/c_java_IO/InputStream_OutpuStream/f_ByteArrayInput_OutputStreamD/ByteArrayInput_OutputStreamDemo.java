package c_java_IO.InputStream_OutpuStream.f_ByteArrayInput_OutputStreamD;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class ByteArrayInput_OutputStreamDemo {
	
	/**
	 * 内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失。
	 * 	字节数组：
	 * 		ByteArrayInputStream
	 * 		ByteArrayOutputStream
	 * 		注意：关闭 ByteArrayOutputStream 无效。此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException。 
	 *  字符数组：
	 *  	CharArrayReader
	 *  	CharArrayWriter
	 *  字符串：
	 *  	StringReader
	 *  	StringWriter
	 *  
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//创建对象
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		//写数据
		for(int x = 0;x<10;x++){
			baos.write(("hello"+x).getBytes("UTF-8"));
		}
		
		//注意：关闭 ByteArrayOutputStream 无效。此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException。 
		//baos.close();
		
		baos.write("sadfsdafasdfasdfsadfasdfsd".getBytes("UTF-8"));
		
		byte[] bys = baos.toByteArray();//用于存放在内存中读取到的数据
		//创建对象
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);//要指定一个字节数组，用于接收从内存中读取到的数据
		
		//读取数据
		//一次读取一个字符
		int by = 0;//用于接收本次读取到的字符对应的ASCII码值
		while((by = bais.read())!=-1){
			System.out.print((char)by);
			System.out.println("by:"+by);//该字符对应的ASCII码值
		}
		
		
		
	}
}
